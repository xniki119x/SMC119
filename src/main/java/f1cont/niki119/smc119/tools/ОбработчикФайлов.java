package f1cont.niki119.smc119.tools;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class ОбработчикФайлов {
    public static void записать_в_файл_строку(String путь, String строка){
        File файл = new File(путь);
        try {
            BufferedWriter BW = new BufferedWriter(new FileWriter(файл));
            BW.write(строка);
            BW.flush();
            BW.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static String прочитать_файл_как_строку(String путь){
        File файл = new File(путь);
        if(!файл.exists()){
            return null;
        }
        try {
            BufferedReader BR = new BufferedReader(new FileReader(файл));
            String line = "";
            String s = "";
            while((line = BR.readLine())!=null){
                s+=line+"\n";
            }
            if(!s.equals("")){
                s=s.substring(0,s.lastIndexOf("\n"));
            }
            return s;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public static boolean создать_файлы_конфига(){
        File пакпа_конфига = new File("SMC119");
        if (!пакпа_конфига.exists()) пакпа_конфига.mkdir();

        return false;
    }
    public static void main(String[] args) throws Exception {
        String sum = "";
        for(String s : список_всех_файлов_в_папке("bin")) {
            System.out.println(контрольная_сумма(s)); sum +=s;
        }
        System.out.println();
        System.out.println(сумма_из_строки(sum));
    }
    public static String контрольная_сумма(String путь) throws Exception {
        return getMD5Checksum(путь);
    }
    public static List<String> список_всех_файлов_в_папке(String путь){
        File dir = new File(путь);
        List<String> list = new ArrayList<>();
        if(!dir.exists()) return list;
        for(File file : dir.listFiles()){
            if(file.isFile()) list.add(file.getPath());
            else list.addAll(список_всех_файлов_в_папке(file.getPath()));
        }
        return list;
    }
    public static String сумма_из_строки(String строка) throws NoSuchAlgorithmException {
        byte[] bytes = строка.getBytes(StandardCharsets.UTF_8);
        MessageDigest complete = MessageDigest.getInstance("MD5");
        complete.update(bytes, 0, bytes.length);
        byte[] b = complete.digest();
        String result = "";
        for (int i=0; i < b.length; i++) {
            result += Integer.toString( ( b[i] & 0xff ) + 0x100, 16).substring( 1 );
        }
        return result;
    }
    public static byte[] createChecksum(String filename) throws Exception {
        InputStream fis =  new FileInputStream(filename);

        byte[] buffer = new byte[1024];
        MessageDigest complete = MessageDigest.getInstance("MD5");
        int numRead;

        do {
            numRead = fis.read(buffer);
            if (numRead > 0) {
                complete.update(buffer, 0, numRead);
            }
        } while (numRead != -1);

        fis.close();
        return complete.digest();
    }
    public static String getMD5Checksum(String filename) throws Exception {
        byte[] b = createChecksum(filename);
        String result = "";

        for (int i=0; i < b.length; i++) {
            result += Integer.toString( ( b[i] & 0xff ) + 0x100, 16).substring( 1 );
        }
        return result;
    }
}
