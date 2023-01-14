package com.hioscar.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // #1 - We create Properties object
    private static Properties properties = new Properties();

    static {
        // #2 - We get the path and pass it into FileInput Stream
        try {
            FileInputStream file = new FileInputStream("config.properties");
            // #3 - We load the file
            properties.load(file);
            // #5 - We close the file
            file.close();

        } catch (IOException e) {
            System.out.println("Properties file not found");
        }
    }

    // #4 - We read from file
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }


}
