package utilities;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties configFile;
    static {
        try {
            String path = "configuration.properties";
            FileInputStream stream = new FileInputStream(path);
            configFile = new Properties();
            configFile.load(stream);
            stream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static String getProperty(String keyName){
        return configFile.getProperty(keyName);
    }

}
