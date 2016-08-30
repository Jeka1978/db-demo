package springconditionals;/**
 * Created by Evegeny on 30/08/2016.
 */

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Conditional(OnProdCondition.class)
public @interface Prod {
}
