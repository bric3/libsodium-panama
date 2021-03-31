package com.github.bric3.sodium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ProcessBuilder.Redirect;
import java.util.Locale;

class OS {
    private static String OS_NAME = System.getProperty("os.name", "unknown").toLowerCase(Locale.ROOT);

    public static final boolean IS_WINDOWS = OS_NAME.startsWith("win");
    public static final boolean IS_LINUX = OS_NAME.startsWith("linux");
    public static final boolean IS_MACOS = OS_NAME.startsWith("mac");
    public static final boolean HAS_LIBPROCPS = hasLibrary("libprocps");

    private static boolean hasLibrary(String libraryName) {
        try {
            var ldconfig = new ProcessBuilder("ldconfig", "-p").redirectError(Redirect.INHERIT).start();

            try (var reader = new BufferedReader(new InputStreamReader(ldconfig.getInputStream()))) {

                String line;
                while ((line = reader.readLine()) != null) {

                    if (line.contains(libraryName)) {
                        return true;
                    }
                }
                return false;
            }
        } catch (IOException e) {
            return false;
        }
    }
}