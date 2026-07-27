package Tests.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigHandler {
    Properties properties = new Properties();
    public  ConfigHandler(String path)
    {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            properties.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String getValue(String key)
    {
        return properties.getProperty(key);
    }
}
