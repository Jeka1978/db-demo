package spring.quoters;

import lombok.Setter;

/**
 * Created by Evegeny on 26/08/2016.
 */
@Setter
public class ShakespearQuoter implements Quoter {
    private String message;

    @Override
    public void sayQuote() {
        System.out.println(message);
    }
}
