package springannotations.mailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Random;

/**
 * Created by Evegeny on 29/08/2016.
 */
@Service
@EnableScheduling
public class MailSender {

    @Autowired
    private Map<String, MailGenerator> map;


    @Scheduled(cron = "1/1 * * * * ?")
    public void sendMail(){
        Random random = new Random();
        String mailCode = String.valueOf(random.nextInt(2)+1);
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new UnsupportedOperationException(mailCode+" not supported");
        }
        String s = mailGenerator.generate();
        System.out.println("s = " + s);
    }

}




