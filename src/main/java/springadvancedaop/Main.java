package springadvancedaop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springadvancedaop.business.MainService;

/**
 * Created by Evegeny on 30/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("springadvancedaop");
        try {
            context.getBean(MainService.class).doWork();
        } catch (Exception e) {
            System.out.println("problem");
        }
        try {
            context.getBean(MainService.class).doWork();
        } catch (Exception e) {
            System.out.println("problem");
        }
    }
}
