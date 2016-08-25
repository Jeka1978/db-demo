package neveruseswtich;

import org.fluttercode.datafactory.impl.DataFactory;

import java.util.Random;

/**
 * Created by Jeka on 23/08/2016.
 */
public class DBUtils {
    public static MailInfo getMailInfo() {
        Random random = new Random();
        DataFactory dataFactory = new DataFactory();
        return new MailInfo(dataFactory.getFirstName(),
                random.nextInt(5)+1);
    }
}
