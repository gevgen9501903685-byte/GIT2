package Anotaciy;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
    private static final Properties PROPERTIES = new Properties();

    static {
        loadProperties();
    }
    public static String get(String key) {
        return PROPERTIES.getProperty(key);
    }

    private static void loadProperties() {

        try(var inputStream = PropertiesUtil.class.getClassLoader().getResourceAsStream("Data.properties")) {
            PROPERTIES.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private PropertiesUtil() {
    }
}
class g {
    static void main() {
        var i = PropertiesUtil.get("health");
        System.out.println(i);

    }
}