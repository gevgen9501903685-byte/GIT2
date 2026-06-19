package FromMax;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SimpleSpELExamples {
    @Value("#{4+2}")
    private int numEval;

    @Value("#{'i not '.concat('string')}")
    private String strEval;

    @Value("#{2>3 and 1<10}")
    private boolean bolEval;

    @Value("#{1!=1 ? 0 : 1 }")
    private int ternEval;

    @Value("#{'${my.prop}'?:'defaultvalue'}")
    private String defaultvalue;

    @Value("${app.os}")
    private String osName;

    public void simleEval1(){
        System.out.println(strEval.concat(" добавил"));
    }
    public void simleEval(){
        System.out.println("Болевые " +
                " "+ternEval);
    }
    public void simleEval3(){
        System.out.println("defaultvalue " + defaultvalue);
        System.out.println("Os name "+ osName);
    }
}
