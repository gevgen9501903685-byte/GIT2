package Game;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Game.Config.Config;

public class MAIN {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        


    }
}
