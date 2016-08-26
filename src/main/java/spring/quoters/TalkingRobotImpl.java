package spring.quoters;

import lombok.Setter;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Evegeny on 26/08/2016.
 */
@Setter
public class TalkingRobotImpl implements TalkingRobot {
    private List<Quoter> quoters;
    private int x;


    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }


}
