package f1cont.niki119.smc119.tools;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Config {

    public static String nickname = "player";
    public static boolean version_check = true;
    public static String java_path = "java";
    public static File config = new File("config.cfg");

    public static void loadConfig() throws IOException {
        if(!config.exists()) createDefaultConfig();
        BufferedReader br = new BufferedReader(new FileReader(config));
        String line = "";
        Map<String, String> cm = new HashMap<>();
        while ((line = br.readLine())!=null){
            if(line.contains("=")) {
                String[] ss = line.split("=");
                cm.put(ss[0],ss[1]);
            }
        }
        nickname = cm.get("nickname");
        version_check = Boolean.parseBoolean(cm.get("version_check"));
        java_path = cm.get("java_path");
        br.close();
    }

    public static void saveConfig() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(config));
        config.delete();config.createNewFile();
        bw.write("nickname="+nickname);bw.newLine();
        bw.write("version_check="+version_check);bw.newLine();
        bw.write("java_path="+java_path);bw.newLine();
        bw.flush();
        bw.close();
    }

    public static void createDefaultConfig() throws IOException {
        config.createNewFile();
        BufferedWriter bw = new BufferedWriter(new FileWriter(config));
        bw.write("nickname="+nickname);bw.newLine();
        bw.write("version_check="+version_check);bw.newLine();
        bw.write("java_path="+java_path);bw.newLine();
        bw.flush();
        bw.close();
    }
}
