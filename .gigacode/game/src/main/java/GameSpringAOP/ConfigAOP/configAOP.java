package GameSpringAOP.ConfigAOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("GameSpringAOP")
@PropertySource("classpath:data.Properties")
public class configAOP {

}
