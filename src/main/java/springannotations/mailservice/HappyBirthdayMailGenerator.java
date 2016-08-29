package springannotations.mailservice;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 29/08/2016.
 */
@Component("2")
public class HappyBirthdayMailGenerator implements MailGenerator {
    @Override
    public String generate() {
        return "Happy birthday";
    }
}
