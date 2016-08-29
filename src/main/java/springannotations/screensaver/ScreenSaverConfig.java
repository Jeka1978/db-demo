package springannotations.screensaver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.awt.*;
import java.util.Random;

/**
 * Created by Evegeny on 29/08/2016.
 */
@Configuration
public class ScreenSaverConfig {
    private Random random = new Random();

    @Bean
    @Scope("prototype")
    public Color color() {
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }
}







