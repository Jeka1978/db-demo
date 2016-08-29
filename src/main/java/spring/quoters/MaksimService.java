package spring.quoters;

import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 29/08/2016.
 */
@Component
@DeprecatedClass(Egor.class)
public class MaksimService {
    public void init(){
        System.out.println("maksim");
    }
}
