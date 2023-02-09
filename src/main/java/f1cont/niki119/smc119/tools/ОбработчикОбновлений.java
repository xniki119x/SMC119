package f1cont.niki119.smc119.tools;

import f1cont.niki119.smc119.SMC119;
import f1cont.niki119.smc119.gui.UpdateGui;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ОбработчикОбновлений {

    public static String URL_JAR = "https://github.com/xniki119x/SMC119/raw/master/build/libs/";
    public static String URL_VERSION = "https://github.com/xniki119x/SMC119/raw/master/VERSION.TXT";

    public static void update() throws IOException, InterruptedException {
        int remote_version = getRemoteVersion();
        System.out.println(remote_version);
        if(SMC119.VERSION<remote_version){
            UpdateGui updateGui = new UpdateGui();
            String jar_name = "SMC119-"+remote_version/10+"."+remote_version%10+".jar";
            URL website = new URL(URL_JAR+jar_name);
            FileOutputStream fos = new FileOutputStream(jar_name);
            HttpURLConnection httpConn = (HttpURLConnection) website.openConnection();
            InputStream in = httpConn.getInputStream();
            byte[] buffer = new byte[1024];
            int bytesRead = -1;
            long totalBytesRead = 0;
            int percentCompleted = 0;
            long fileSize = httpConn.getContentLength();
            while ((bytesRead = in.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                totalBytesRead += bytesRead;
                percentCompleted = (int) (totalBytesRead * 100 / fileSize);
               updateGui.pb_update_progress.setValue(percentCompleted);
            }
            fos.close();
            start(jar_name, SMC119.VERSION);
            updateGui.setVisible(false);
            System.exit(0);
        }else {
            SMC119 smc119 = new SMC119();
        }
    }

    public static void delete(String name) throws InterruptedException {
        Thread.sleep(1000);
        File file = new File(name);
        if(file.exists()) file.delete();
    }

    public static void start(String name, int old_version) throws IOException {
        String command = "\""+SMC119.java_home.replace("\\","/")+"\" -jar ./"+name+" delete "+"SMC119-"+old_version/10+"."+old_version%10+".jar";
        Process p = Runtime.getRuntime().exec(command);
    }

    public static int getRemoteVersion() throws IOException{
        URL website = new URL(URL_VERSION);
        InputStream in = website.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line = br.readLine();
        int version = Integer.parseInt(line);
        return version;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(ОбработчикФайлов.getMD5Checksum("версии.cfg"));
    }

    public static String получить_файл_с_сервера(String путь) throws IOException {
        String s = ОбработчикФайлов.прочитать_файл_как_строку("версии.cfg");
        s = s.split("=")[1];
        System.out.println(s+путь);
        URL website = new URL(s+путь);
        InputStream in = website.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line = br.readLine();
        return line;
    }
}
