package springannotations.screensaver2.screensaver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

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
    @Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
    public  Color color() {
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }


}







