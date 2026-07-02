package BATL;

import BATL.Config.Config2;
import BATL.PEHUnit.UnitsPEH.Solder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config2.class);

      Solder akm = context.getBean(Solder.class);
        System.out.println(akm.getPrice());

    }
}
