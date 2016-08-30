package spring.quoters.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 30/08/2016.
 */
@Component
@Aspect
public class QuoterAspect {

    @Before("execution(* spring.quoters..*.say*(..))")
    public void doBeforeSayMethods(){
        System.out.println("А теперь цитата:");
    }
}
