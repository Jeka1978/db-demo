package spring;

import factory.IRobot;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.nio.file.FileSystem;

/**
 * Created by Evegeny on 26/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("c:\\context.xml");
        IRobot iRobot = context.getBean(IRobot.class);

    }
}
