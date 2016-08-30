package springannotations.screensaver2.screensaver;

import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;
import java.util.function.Supplier;

/**
 * Created by Evegeny on 29/08/2016.
 */
@Configuration
@ComponentScan(basePackages = "springannotations.screensaver2")
public class ScreenSaverConfig {
    private static Random random = new Random();

    @Bean
    @Scope(value = "twoSeconds",proxyMode = ScopedProxyMode.TARGET_CLASS)
    public  Color color() {
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }


}







