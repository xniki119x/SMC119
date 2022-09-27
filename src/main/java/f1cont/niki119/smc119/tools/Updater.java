package f1cont.niki119.smc119.tools;

import f1cont.niki119.smc119.SMC119;

import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Updater {

    public static String URL_JAR = "https://github.com/xniki119x/SMC119/raw/master/build/libs/";
    public static String URL_VERSION = "https://github.com/xniki119x/SMC119/raw/master/VERSION.TXT";

    public static void update() throws IOException {
        int remote_version = getRemoteVersion();
        if(SMC119.VERSION<remote_version){
            String jar_name = "SMC119-"+remote_version/10+"."+remote_version%10+".jar";
            URL website = new URL(URL_JAR+jar_name);
            ReadableByteChannel rbc = Channels.newChannel(website.openStream());
            FileOutputStream fos = new FileOutputStream(jar_name);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        }else {
            SMC119 smc119 = new SMC119();
        }
    }

    public static int getRemoteVersion() throws IOException{
        URL website = new URL(URL_VERSION);
        InputStream in = website.openStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int version = Integer.parseInt(br.readLine());
        return version;
    }

    public static void main(String[] args) throws IOException {
        update();
    }
}
