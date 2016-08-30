package springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Evegeny on 30/08/2016.
 */
@Component
@Aspect
@EnableAspectJAutoProxy
public class SecurityAspect {

    @Around("@annotation(Secured)")
    public Object doSecured(ProceedingJoinPoint pjp) throws Throwable {
        Random random = new Random();
        Object[] args = pjp.getArgs();
        Integer arg = (Integer) args[0];
        if (random.nextInt(3) != 2) {
            return pjp.proceed(new Object[]{arg*2});
        }else {
            throw new IllegalAccessException("not allowed here try again");
        }
    }

}
