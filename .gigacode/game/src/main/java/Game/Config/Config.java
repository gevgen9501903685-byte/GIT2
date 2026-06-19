package Game.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("Game")
@PropertySource("classpath:data.properties")
public class Config {
//    @Bean
//    public Infantryman setInfantryman(int a,int b, int c){
//        return new Infantryman(3,1,0);
//    }
}
