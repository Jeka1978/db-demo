package springadvancedaop.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import springadvancedaop.business.DBRuntimeException;

import java.util.*;

/**
 * Created by Evegeny on 30/08/2016.
 */
@Component
@Aspect
@PropertySource("classpath:mails.properties")
@EnableAspectJAutoProxy
public class ExceptionHandlerAspect {
    @Value("${dbaMails}")
    private String[] mails;

    private Map<DBRuntimeException, Void> map = new WeakHashMap<>();


    @AfterThrowing(pointcut = "execution(* springadvancedaop.business..*.*(..))",throwing = "ex")
    public void handleDBException(DBRuntimeException ex) {
        if (!map.containsKey(ex)) {
            map.put(ex, null);
            for (String mail : mails) {
                System.out.println("sending to "+mail+" "+ex.getMessage());
            }
        }
    }

}









