package f1cont.niki119.smc119;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Updater {

    public static String URL_JAR = "https://github.com/xniki119x/SMC119/raw/master/build/libs/SMC119-latest.jar";
    public static String URL_VERSION = "https://github.com/xniki119x/SMC119/raw/master/VERSION.TXT";

    public static void update() throws IOException {
        URL website = new URL(URL_VERSION);
        ReadableByteChannel rbc = Channels.newChannel(website.openStream());
        FileOutputStream fos = new FileOutputStream("version");
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
    }

    public static void main(String[] args) throws IOException {
        update();
    }
}
