package springprofiles;

import org.springframework.context.annotation.*;

/**
 * Created by Evegeny on 30/08/2016.
 */
@Configuration
@Profile({"DEV"})
@PropertySource("classpath:dev.properties")
public class DevConfig {

}
