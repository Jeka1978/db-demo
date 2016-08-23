package neveruseswtich;

/**
 * Created by Jeka on 23/08/2016.
 */
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        // 80 lines of code
        return "<html>Welcome " + mailInfo.getClientName() + " </html>";
    }
}
