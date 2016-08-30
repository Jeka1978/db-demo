package springaop;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 30/08/2016.
 */
@Service
public class MyService {

    @Secured
    public void doWork(int x){
        System.out.println("Lanisters always pay "+x+" debts");
    }
}
