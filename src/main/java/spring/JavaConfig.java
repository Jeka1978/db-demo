package spring;

import factory.IRobot;
import factory.MyService;
import factory.MyServiceImpl;
import factory.Speaker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 26/08/2016.
 */
@Configuration
@PropertySource("classpath:quotes.properties")
@ComponentScan(basePackages = "spring.quoters")
@EnableAspectJAutoProxy
public class JavaConfig {

    @PostConstruct
    public void init() {
        System.out.println("CONFIG STARTED!!!!!!!!!!!!!!!!!");
    }

    @Bean
    public MyService myService(){
        return new MyServiceImpl<>();
    }

  /*  @Bean  since 4.3.0 will be introduced automatic
    public static PropertySourcesPlaceholderConfigurer configurer(){
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        return configurer;
    }*/
}
