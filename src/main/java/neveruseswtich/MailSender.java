package neveruseswtich;

/**
 * Created by Jeka on 23/08/2016.
 */
public class MailSender {
    public void sendMail() {
        MailInfo mailInfo =  DBUtils.getMailInfo();
        switch (mailInfo.getMailCode()) {
            case 1:
                //80 lines of code
                System.out.println("WELCOME " + mailInfo.getClientName());
                break;
            default:
                //60 lines of code
                System.out.println("don't call us we call you");
                break;
        }
    }
}
