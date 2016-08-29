package spring;

import factory.IRobot;
import factory.Speaker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 26/08/2016.
 */
@Configuration
@PropertySource("classpath:quotes.properties")
public class JavaConfig {

  /*  @Bean  since 4.3.0 will be introduced automatic
    public static PropertySourcesPlaceholderConfigurer configurer(){
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        return configurer;
    }*/
}
