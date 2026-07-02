package FromMax;

import org.springframework.context.ApplicationContext;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class MAinSpEL {
    static void main() {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigSpEL.class);

        SimpleSpELExamples simpleSpELExamples = context.getBean(SimpleSpELExamples.class);
        simpleSpELExamples.simleEval();
        simpleSpELExamples.simleEval1();
        simpleSpELExamples.simleEval3();

        Shop shop = context.getBean(Shop.class);
        shop.allShow();

    }
}
