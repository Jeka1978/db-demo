package spring;

import factory.IRobot;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import spring.quoters.Person;
import spring.quoters.Quoter;
import spring.quoters.TalkingRobot;

import java.nio.file.FileSystem;

/**
 * Created by Evegeny on 26/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.close();
    }
}
