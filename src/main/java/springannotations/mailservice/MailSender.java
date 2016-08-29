package springannotations.mailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by Evegeny on 29/08/2016.
 */
@Service
@EnableScheduling
public class MailSender {

    private Map<Integer, MailGenerator> map = new HashMap<>();

    @Autowired
    public void configureMap(List<MailGenerator> generators){
        for (MailGenerator generator : generators) {
            if (map.containsKey(generator.code())) {
                throw new IllegalStateException("code " + generator.code() + " already in use");
            }
            map.put(generator.code(), generator);
        }
    }


    @Scheduled(cron = "1/1 * * * * ?")
    public void sendMail(){
        Random random = new Random();
        int mailCode = random.nextInt(2)+1;
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new UnsupportedOperationException(mailCode+" not supported");
        }
        String s = mailGenerator.generate();
        System.out.println("s = " + s);
    }

}




