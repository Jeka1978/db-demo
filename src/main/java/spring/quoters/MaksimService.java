package spring.quoters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 29/08/2016.
 */
@Component
public class MaksimService {

    @Autowired
    private MaksimService maksimService;

    @PostConstruct
    public void init(){
        System.out.println("maksim");
        System.out.println(maksimService);
    }
}
