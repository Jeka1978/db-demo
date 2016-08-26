package spring.quoters;/**
 * Created by Evegeny on 26/08/2016.
 */

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
public @interface Transactional {
}
