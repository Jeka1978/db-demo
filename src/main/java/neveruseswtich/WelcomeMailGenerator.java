package neveruseswtich;

/**
 * Created by Jeka on 23/08/2016.
 */
@MailCode(1)
@MailCode(4)
@MailCode(5)
public class WelcomeMailGenerator implements MailGenerator {

    public WelcomeMailGenerator() {
    }

    @Override
    public String generateHtml(MailInfo mailInfo) {
        // 80 lines of code
        return "<html>Welcome " + mailInfo.getClientName() + " </html>";
    }
}
