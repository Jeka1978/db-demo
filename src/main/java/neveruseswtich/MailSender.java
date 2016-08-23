package neveruseswtich;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Jeka on 23/08/2016.
 */
public class MailSender {
    private Reflections reflections = new Reflections("neveruseswtich");
    private Map<Integer, MailGenerator> map = new HashMap<>();


    @SneakyThrows
    public MailSender() {
        Set<Class<? extends MailGenerator>> classes = reflections.getSubTypesOf(MailGenerator.class);
        for (Class<? extends MailGenerator> aClass : classes) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                MailCode annotation = aClass.getAnnotation(MailCode.class);
                if (annotation == null) {
                    throw new
                            IllegalStateException("" +
                            "if you implement" +
                            MailGenerator.class.getSimpleName());
                }
                int mailCode = annotation.value();
                if (map.containsKey(mailCode)) {
                    throw new IllegalArgumentException("already in use");
                }
                map.put(mailCode, aClass.newInstance());
            }
    }
    }

    public void sendMail() {
        MailInfo mailInfo =  DBUtils.getMailInfo();
        MailGenerator mailGenerator = map.get(mailInfo.getMailCode());
        if (mailGenerator == null) {
            throw new UnsupportedOperationException("not implemented yet");
        }
        String html = mailGenerator.generateHtml(mailInfo);
        send(html);
    }




    private void send(String html) {
        System.out.println("sending... "+html);
    }
}
