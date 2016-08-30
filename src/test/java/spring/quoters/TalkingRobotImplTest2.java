package spring.quoters;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spring.JavaConfig;

/**
 * Created by Evegeny on 30/08/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JavaConfig.class})
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class TalkingRobotImplTest2 {
    @Autowired
    private TalkingRobot talkingRobot;

    private int x=10;

    @Before
    @Transactional
    @Rollback(false)
    public void setUp() throws Exception {


    }

    public TalkingRobotImplTest2() {
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