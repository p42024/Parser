package org.g5.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Logger {
    private static String logDirectory = "./logs/";

    public static<T extends Exception> void LogException(T exception) throws Exception {
        {
            File dir = new File(logDirectory);
            // Either the logging directory doesn't exist or it is not a directory.
            if (!dir.exists() || !dir.isDirectory()) { 
                if (!dir.mkdirs()) {
                    throw new Exception("Couldn't create the directory!");
                }
            }
        }

        String prefix = Long.valueOf(System.currentTimeMillis()).toString();
        String filePath = logDirectory + prefix + exception.getClass();
        try {
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filePath));
            fileWriter.write(exception.getMessage());
            fileWriter.close();
        }
        catch (Exception e) {
            System.err.println("Error writing error log!");
        }
    }
}
