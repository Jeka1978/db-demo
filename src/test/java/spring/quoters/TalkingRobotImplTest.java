package spring.quoters;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.JavaConfig;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 30/08/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JavaConfig.class})
public class TalkingRobotImplTest {
    @Autowired
    private TalkingRobot talkingRobot;

    private int x=10;


    public TalkingRobotImplTest() {
        System.out.println("**************************************************");
    }

    @Test
    public void testTalk() throws Exception {
        talkingRobot.talk();
    }

    @Test
    public void test2() throws Exception {
       talkingRobot.talk();

    }
}