package spring.quoters.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 30/08/2016.
 */
@Component
@Aspect
public class QuoterAspect {

    @Pointcut("execution(* spring.quoters..*.say*(..))")
    public void sayMethods() {
    }

    @Pointcut("@annotation(Deprecated)")
    public void deprecatedMethods() {
    }

    @Pointcut("sayMethods()&&deprecatedMethods()")
    public void sayDeprecated(){}


    @Before(value = "sayMethods()&&deprecatedMethods()")
    public void doBeforeSayMethods(JoinPoint jp) {
        String simpleName = jp.getTarget().getClass().getSimpleName();
        System.out.println("А теперь цитата " + simpleName + " : ");
    }
}
