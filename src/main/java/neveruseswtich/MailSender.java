package neveruseswtich;

/**
 * Created by Jeka on 23/08/2016.
 */
public class MailSender {
    public void sendMail() {
        MailInfo mailInfo =  DBUtils.getMailInfo();
        MailType mailType = MailType.findByDbCode(mailInfo.getMailCode());
        String html = mailType.getMailGenerator().generateHtml(mailInfo);
        send(html);
    }

    private void send(String html) {
        System.out.println("sending... "+html);
    }
}
