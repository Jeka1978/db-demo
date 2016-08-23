package neveruseswtich;

import lombok.SneakyThrows;

/**
 * Created by Jeka on 23/08/2016.
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {

        MailSender mailSender = new MailSender();
        while (true) {
            mailSender.sendMail();
            Thread.sleep(1000);
        }
    }
}
