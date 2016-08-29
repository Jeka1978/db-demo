package spring.quoters;

import factory.InjectRandomInt;
import lombok.Setter;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 26/08/2016.
 */
@Setter
public class ShakespearQuoter implements Quoter {

    private String message;
    @InjectRandomInt(min = 3,max = 6)
    private int repeat;

    @PostConstruct
    public void init() {
        System.out.println(repeat);
    }

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}
