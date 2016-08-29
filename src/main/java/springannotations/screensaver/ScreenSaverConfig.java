package springannotations.screensaver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.awt.*;
import java.util.Random;
import java.util.function.Supplier;

/**
 * Created by Evegeny on 29/08/2016.
 */
@Configuration
public class ScreenSaverConfig {
    private static Random random = new Random();

    @Bean
    public Supplier<Color> colorSupplier(){
        return this::color;
    }

    @Bean
    public Supplier<MyService> myServiceSupplier(){
        return this::myService;
    }

    @Bean
    @Scope("prototype")
    public MyService myService(){
        return new MyService();
    }

    @Bean
    @Scope("prototype")
    public  Color color() {
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    @Bean
    public ColorFrame colorFrame(){
        return new ColorFrame() {
            @Override
            protected Color getColorBean() {
                return color();
            }
        };
    }

}







