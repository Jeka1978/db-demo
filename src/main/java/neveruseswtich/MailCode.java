package neveruseswtich;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.CONSTRUCTOR})
@Repeatable(MailCodes.class)
public @interface MailCode {
    int value();
}
