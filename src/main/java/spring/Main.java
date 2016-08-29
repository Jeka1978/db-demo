package spring;

import factory.IRobot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Service;
import spring.quoters.Person;
import spring.quoters.Quoter;
import spring.quoters.TalkingRobot;

import java.nio.file.FileSystem;
import java.util.Arrays;

/**
 * Created by Evegeny on 26/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("spring");
        context.close();
    }
}
