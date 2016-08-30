package springaop;/**
 * Created by Evegeny on 30/08/2016.
 */

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
public @interface Secured {
}
