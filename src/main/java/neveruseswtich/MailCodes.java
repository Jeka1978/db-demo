package neveruseswtich;

import java.lang.annotation.*;

/**
 * Created by Evegeny on 25/08/2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface MailCodes {
    MailCode[] value();
}
