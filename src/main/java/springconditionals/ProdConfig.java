package springconditionals;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Evegeny on 30/08/2016.
 */
@Configuration
@Prod
@PropertySource("classpath:prod.properties")
public class ProdConfig {
}
