package f1cont.niki119.smc119.tools;

import java.io.IOException;

public class Launcher {

    public static String command = "jdk-17\\bin\\java -XX:+UnlockExperimentalVMOptions -XX:+UseG1GC -XX:G1NewSizePercent=20 " +
            "-XX:G1ReservePercent=20 -XX:MaxGCPauseMillis=50 -XX:G1HeapRegionSize=32M -XX:+DisableExplicitGC -XX:+AlwaysPreTouch " +
            "-XX:+ParallelRefProcEnabled -Xms2048M -Xmx4096M -Dfile.encoding=UTF-8 -XX:HeapDumpPath=MojangTricksIntelDriversForPerformance_javaw.exe_minecraft.exe.heapdump " +
            "-Xss1M -Djava.library.path=bin\\natives -Dminecraft.launcher.brand=java-minecraft-launcher -Dminecraft.launcher.version=1.6.84-j " +
            "-cp \"libraries\\cpw\\mods\\securejarhandler\\2.1.4\\securejarhandler-2.1.4.jar;libraries\\org\\ow2\\asm\\asm\\9.3\\asm-9.3.jar;libraries\\org\\ow2\\asm\\asm-commons\\9.3\\asm-commons-9.3.jar;libraries\\org\\ow2\\asm\\asm-tree\\9.3\\asm-tree-9.3.jar;libraries\\org\\ow2\\asm\\asm-util\\9.3\\asm-util-9.3.jar;libraries\\org\\ow2\\asm\\asm-analysis\\9.3\\asm-analysis-9.3.jar;libraries\\net\\minecraftforge\\accesstransformers\\8.0.4\\accesstransformers-8.0.4.jar;libraries\\org\\antlr\\antlr4-runtime\\4.9.1\\antlr4-runtime-4.9.1.jar;libraries\\net\\minecraftforge\\eventbus\\6.0.3\\eventbus-6.0.3.jar;libraries\\net\\minecraftforge\\forgespi\\6.0.0\\forgespi-6.0.0.jar;libraries\\net\\minecraftforge\\coremods\\5.0.1\\coremods-5.0.1.jar;libraries\\cpw\\mods\\modlauncher\\10.0.8\\modlauncher-10.0.8.jar;libraries\\net\\minecraftforge\\unsafe\\0.2.0\\unsafe-0.2.0.jar;libraries\\com\\electronwill\\night-config\\core\\3.6.4\\core-3.6.4.jar;libraries\\com\\electronwill\\night-config\\toml\\3.6.4\\toml-3.6.4.jar;libraries\\org\\apache\\maven\\maven-artifact\\3.8.5\\maven-artifact-3.8.5.jar;libraries\\net\\jodah\\typetools\\0.8.3\\typetools-0.8.3.jar;libraries\\net\\minecrell\\terminalconsoleappender\\1.2.0\\terminalconsoleappender-1.2.0.jar;libraries\\org\\jline\\jline-reader\\3.12.1\\jline-reader-3.12.1.jar;libraries\\org\\jline\\jline-terminal\\3.12.1\\jline-terminal-3.12.1.jar;libraries\\org\\spongepowered\\mixin\\0.8.5\\mixin-0.8.5.jar;libraries\\org\\openjdk\\nashorn\\nashorn-core\\15.3\\nashorn-core-15.3.jar;libraries\\net\\minecraftforge\\JarJarSelector\\0.3.16\\JarJarSelector-0.3.16.jar;libraries\\net\\minecraftforge\\JarJarMetadata\\0.3.16\\JarJarMetadata-0.3.16.jar;libraries\\cpw\\mods\\bootstraplauncher\\1.1.2\\bootstraplauncher-1.1.2.jar;libraries\\net\\minecraftforge\\JarJarFileSystems\\0.3.16\\JarJarFileSystems-0.3.16.jar;libraries\\net\\minecraftforge\\fmlloader\\1.19.2-43.1.1\\fmlloader-1.19.2-43.1.1.jar;libraries\\com\\mojang\\logging\\1.0.0\\logging-1.0.0.jar;libraries\\com\\mojang\\blocklist\\1.0.10\\blocklist-1.0.10.jar;libraries\\ru\\tln4\\empty\\0.1\\empty-0.1.jar;libraries\\com\\github\\oshi\\oshi-core\\5.8.5\\oshi-core-5.8.5.jar;libraries\\net\\java\\dev\\jna\\jna\\5.10.0\\jna-5.10.0.jar;libraries\\net\\java\\dev\\jna\\jna-platform\\5.10.0\\jna-platform-5.10.0.jar;libraries\\org\\slf4j\\slf4j-api\\1.8.0-beta4\\slf4j-api-1.8.0-beta4.jar;libraries\\org\\apache\\logging\\log4j\\log4j-slf4j18-impl\\2.17.0\\log4j-slf4j18-impl-2.17.0.jar;libraries\\com\\ibm\\icu\\icu4j\\70.1\\icu4j-70.1.jar;libraries\\com\\mojang\\javabridge\\1.2.24\\javabridge-1.2.24.jar;libraries\\net\\sf\\jopt-simple\\jopt-simple\\5.0.4\\jopt-simple-5.0.4.jar;libraries\\io\\netty\\netty-common\\4.1.77.Final\\netty-common-4.1.77.Final.jar;libraries\\io\\netty\\netty-buffer\\4.1.77.Final\\netty-buffer-4.1.77.Final.jar;libraries\\io\\netty\\netty-codec\\4.1.77.Final\\netty-codec-4.1.77.Final.jar;libraries\\io\\netty\\netty-handler\\4.1.77.Final\\netty-handler-4.1.77.Final.jar;libraries\\io\\netty\\netty-resolver\\4.1.77.Final\\netty-resolver-4.1.77.Final.jar;libraries\\io\\netty\\netty-transport\\4.1.77.Final\\netty-transport-4.1.77.Final.jar;libraries\\io\\netty\\netty-transport-native-unix-common\\4.1.77.Final\\netty-transport-native-unix-common-4.1.77.Final.jar;libraries\\io\\netty\\netty-transport-classes-epoll\\4.1.77.Final\\netty-transport-classes-epoll-4.1.77.Final.jar;libraries\\com\\google\\guava\\failureaccess\\1.0.1\\failureaccess-1.0.1.jar;libraries\\com\\google\\guava\\guava\\31.0.1-jre\\guava-31.0.1-jre.jar;libraries\\org\\apache\\commons\\commons-lang3\\3.12.0\\commons-lang3-3.12.0.jar;libraries\\commons-io\\commons-io\\2.11.0\\commons-io-2.11.0.jar;libraries\\commons-codec\\commons-codec\\1.15\\commons-codec-1.15.jar;libraries\\com\\mojang\\brigadier\\1.0.18\\brigadier-1.0.18.jar;libraries\\com\\mojang\\datafixerupper\\5.0.28\\datafixerupper-5.0.28.jar;libraries\\com\\google\\code\\gson\\gson\\2.8.9\\gson-2.8.9.jar;libraries\\by\\ely\\authlib\\3.11.49.0\\authlib-3.11.49.0.jar;libraries\\org\\apache\\commons\\commons-compress\\1.21\\commons-compress-1.21.jar;libraries\\org\\apache\\httpcomponents\\httpclient\\4.5.13\\httpclient-4.5.13.jar;libraries\\commons-logging\\commons-logging\\1.2\\commons-logging-1.2.jar;libraries\\org\\apache\\httpcomponents\\httpcore\\4.4.14\\httpcore-4.4.14.jar;libraries\\it\\unimi\\dsi\\fastutil\\8.5.6\\fastutil-8.5.6.jar;libraries\\org\\apache\\logging\\log4j\\log4j-api\\2.17.0\\log4j-api-2.17.0.jar;libraries\\org\\apache\\logging\\log4j\\log4j-core\\2.17.0\\log4j-core-2.17.0.jar;libraries\\org\\lwjgl\\lwjgl\\3.3.1\\lwjgl-3.3.1.jar;libraries\\org\\lwjgl\\lwjgl\\3.3.1\\lwjgl-3.3.1-natives-windows.jar;libraries\\org\\lwjgl\\lwjgl\\3.3.1\\lwjgl-3.3.1-natives-windows-x86.jar;libraries\\org\\lwjgl\\lwjgl-jemalloc\\3.3.1\\lwjgl-jemalloc-3.3.1.jar;libraries\\org\\lwjgl\\lwjgl-jemalloc\\3.3.1\\lwjgl-jemalloc-3.3.1-natives-windows.jar;libraries\\org\\lwjgl\\lwjgl-jemalloc\\3.3.1\\lwjgl-jemalloc-3.3.1-natives-windows-x86.jar;libraries\\org\\lwjgl\\lwjgl-openal\\3.3.1\\lwjgl-openal-3.3.1.jar;libraries\\org\\lwjgl\\lwjgl-openal\\3.3.1\\lwjgl-openal-3.3.1-natives-windows.jar;libraries\\org\\lwjgl\\lwjgl-openal\\3.3.1\\lwjgl-openal-3.3.1-natives-windows-x86.jar;libraries\\org\\lwjgl\\lwjgl-opengl\\3.3.1\\lwjgl-opengl-3.3.1.jar;libraries\\org\\lwjgl\\lwjgl-opengl\\3.3.1\\lwjgl-opengl-3.3.1-natives-windows.jar;libraries\\org\\lwjgl\\lwjgl-opengl\\3.3.1\\lwjgl-opengl-3.3.1-natives-windows-x86.jar;libraries\\org\\lwjgl\\lwjgl-glfw\\3.3.1\\lwjgl-glfw-3.3.1.jar;libraries\\org\\lwjgl\\lwjgl-glfw\\3.3.1\\lwjgl-glfw-3.3.1-natives-windows.jar;libraries\\org\\lwjgl\\lwjgl-glfw\\3.3.1\\lwjgl-glfw-3.3.1-natives-windows-x86.jar;libraries\\org\\lwjgl\\lwjgl-stb\\3.3.1\\lwjgl-stb-3.3.1.jar;libraries\\org\\lwjgl\\lwjgl-stb\\3.3.1\\lwjgl-stb-3.3.1-natives-windows.jar;libraries\\org\\lwjgl\\lwjgl-stb\\3.3.1\\lwjgl-stb-3.3.1-natives-windows-x86.jar;libraries\\org\\lwjgl\\lwjgl-tinyfd\\3.3.1\\lwjgl-tinyfd-3.3.1.jar;libraries\\org\\lwjgl\\lwjgl-tinyfd\\3.3.1\\lwjgl-tinyfd-3.3.1-natives-windows.jar;libraries\\org\\lwjgl\\lwjgl-tinyfd\\3.3.1\\lwjgl-tinyfd-3.3.1-natives-windows-x86.jar;libraries\\com\\mojang\\text2speech\\1.13.9\\text2speech-1.13.9.jar;libraries\\com\\mojang\\text2speech\\1.13.9\\text2speech-1.13.9-natives-windows.jar;bin\\1.19.2-forge-43.1.1.jar\" " +
            "-Djava.net.preferIPv6Addresses=system " +
            "-DignoreList=bootstraplauncher,securejarhandler,asm-commons,asm-util,asm-analysis,asm-tree,asm,JarJarFileSystems,client-extra,fmlcore,javafmllanguage,lowcodelanguage,mclanguage,forge-,1.19.2-forge-43.1.1.jar " +
            "-DmergeModules=jna-5.10.0.jar,jna-platform-5.10.0.jar -DlibraryDirectory=libraries " +
            "-p \"libraries/cpw/mods/bootstraplauncher/1.1.2/bootstraplauncher-1.1.2.jar;libraries/cpw/mods/securejarhandler/2.1.4/securejarhandler-2.1.4.jar;libraries/org/ow2/asm/asm-commons/9.3/asm-commons-9.3.jar;libraries/org/ow2/asm/asm-util/9.3/asm-util-9.3.jar;libraries/org/ow2/asm/asm-analysis/9.3/asm-analysis-9.3.jar;libraries/org/ow2/asm/asm-tree/9.3/asm-tree-9.3.jar;libraries/org/ow2/asm/asm/9.3/asm-9.3.jar;libraries/net/minecraftforge/JarJarFileSystems/0.3.16/JarJarFileSystems-0.3.16.jar\" " +
            "--add-modules ALL-MODULE-PATH --add-opens java.base/java.util.jar=cpw.mods.securejarhandler --add-opens java.base/java.lang.invoke=cpw.mods.securejarhandler " +
            "--add-exports java.base/sun.security.util=cpw.mods.securejarhandler --add-exports jdk.naming.dns/com.sun.jndi.dns=java.naming cpw.mods.bootstraplauncher.BootstrapLauncher " +
            "--username %nickname% --version 1.19.2-forge-43.1.1 --gameDir .\\ --assetsDir assets --assetIndex 1.19 --uuid 53315991293c377ba07c5919f938e19d " +
            "--accessToken 53315991293c377ba07c5919f938e19d --clientId  --xuid  --userType legacy --versionType release --width 925 --height 530 --launchTarget forgeclient " +
            "--fml.forgeVersion 43.1.1 --fml.mcVersion 1.19.2 --fml.forgeGroup net.minecraftforge --fml.mcpVersion 20220805.130853\n";

    public static void start(String nickname) throws IOException {
        Process process = Runtime.getRuntime().exec(command.replace("%nickname%", nickname));
        Config.saveConfig();
        System.exit(0);
    }
}
