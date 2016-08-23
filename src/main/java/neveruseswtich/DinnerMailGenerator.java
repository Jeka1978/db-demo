package neveruseswtich;

/**
 * Created by Jeka on 23/08/2016.
 */
@MailCode(3)
public class DinnerMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        return "идите кушать уже!";
    }
}
