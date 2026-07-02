package BATL.Config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("BATL")
@PropertySource({"classpath:akkm.properties","classpath:Grenade.properties"})
public class Config2 {

}
