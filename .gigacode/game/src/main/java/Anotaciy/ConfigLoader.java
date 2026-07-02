package Anotaciy;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Properties;

public class ConfigLoader {
    private static final Properties GLOBAL_PROPERTIES = new Properties();

    static {
        loadGlobalProperties(); // один раз при старте
    }

    private static void loadGlobalProperties() {
        // Можно загрузить несколько файлов — здесь один
        String filename = "app.properties";
        try (InputStream is = ConfigLoader.class
                .getClassLoader()
                .getResourceAsStream(filename)) {

            if (is != null) {
                GLOBAL_PROPERTIES.load(is);
            } else {
                System.err.println("⚠️ Файл " + filename + " не найден — будут использованы только значения по умолчанию");
            }
        } catch (Exception e) {
            throw new RuntimeException("Ошибка загрузки " + filename, e);
        }
    }

    // Основной метод — загрузка конфига
    public static <T> T load(Class<T> configClass) {
        try {
            T instance = configClass.getDeclaredConstructor().newInstance();

            Field[] fields = configClass.getDeclaredFields();
            for (Field field : fields) {
                Property annotation = field.getAnnotation(Property.class);
                if (annotation != null) {
                    String key = annotation.value();
                    String defaultValue = annotation.defaultValue();
                    String value = GLOBAL_PROPERTIES.getProperty(key, defaultValue);

                    field.setAccessible(true); // обход private
                    setFieldValue(field, instance, value);
                }
            }
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Ошибка создания конфига: " + configClass.getName(), e);
        }
    }

    // Умная подстановка значений в поле
    private static void setFieldValue(Field field, Object instance, String value) throws IllegalAccessException {
        if (value == null) return;

        Class<?> type = field.getType();
        if (type == String.class) {
            field.set(instance, value);
        } else if (type == int.class || type == Integer.class) {
            field.set(instance, Integer.parseInt(value));
        } else if (type == long.class || type == Long.class) {
            field.set(instance, Long.parseLong(value));
        } else if (type == boolean.class || type == Boolean.class) {
            field.set(instance, Boolean.parseBoolean(value));
        } else if (type == double.class || type == Double.class) {
            field.set(instance, Double.parseDouble(value));
        } else {
            throw new IllegalStateException("Неподдерживаемый тип поля: " + type.getName());
        }
    }
}
