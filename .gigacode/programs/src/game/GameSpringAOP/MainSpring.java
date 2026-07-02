package GameSpringAOP;

import GameSpringAOP.Unit.Shturm;
import GameSpringAOP.Unit.Solder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpring {
    static void main() {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("GameSpringAOP");

        Solder solder = context.getBean(Solder.class);
        System.out.println(solder.damage());
        Shturm shturm = context.getBean(Shturm.class);
        System.out.println(shturm.damage());
    }
}