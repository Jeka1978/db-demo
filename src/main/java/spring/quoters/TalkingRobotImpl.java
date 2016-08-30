package spring.quoters;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 26/08/2016.
 */
//@Component
@Setter
public class TalkingRobotImpl implements TalkingRobot {
    @Autowired(required = false)
    @Qualifier("books")
    private List<Quoter> quoters =  Arrays.asList(new Quoter() {
        @Override
        public void sayQuote() {
            System.out.println("цитата");
        }

        @Override
        public void sayAdditionalQuote() {

        }
    });


    @Override
    @PostConstruct
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }


}
