package springannotations.screensaver2.screensaver;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Evegeny on 29/08/2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScreenSaverConfig.class);
        while (true) {
            context.getBean(ColorFrame.class).move();
            Thread.sleep(75);
        }
    }
}
