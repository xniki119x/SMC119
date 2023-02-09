package f1cont.niki119.smc119.tools;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ОбработчикКонфига {

    public static String никнейм = "player";
    public static boolean авто_обновление_лаунчера = true;
    public static String путь_к_java = "java";
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
        никнейм = cm.get("nickname");
        авто_обновление_лаунчера = Boolean.parseBoolean(cm.get("version_check"));
        путь_к_java = cm.get("java_path");
        br.close();
    }

    public static void saveConfig() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(config));
        config.delete();config.createNewFile();
        bw.write("nickname="+ никнейм);bw.newLine();
        bw.write("авто_обновление_лаунчера="+ авто_обновление_лаунчера);bw.newLine();
        bw.write("java_path="+ путь_к_java);bw.newLine();
        bw.flush();
        bw.close();
    }

    public static void createDefaultConfig() throws IOException {
        config.createNewFile();
        BufferedWriter bw = new BufferedWriter(new FileWriter(config));
        bw.write("nickname="+ никнейм);bw.newLine();
        bw.write("авто_обновление_лаунчера="+ авто_обновление_лаунчера);bw.newLine();
        bw.write("java_path="+ путь_к_java);bw.newLine();
        bw.flush();
        bw.close();
    }
}
