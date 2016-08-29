package springannotations.mailservice;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 29/08/2016.
 */
@Component
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generate() {
        return "Welcome";
    }

    @Override
    public int code() {
        return 1;
    }
}
