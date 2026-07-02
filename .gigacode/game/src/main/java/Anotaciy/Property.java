package Anotaciy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Property {
    String value(); // ключ в .properties (например, "db.port")
    String defaultValue() default ""; // значение по умолчанию (опционально)
}
