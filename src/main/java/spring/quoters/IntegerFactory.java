package spring.quoters;

import lombok.AllArgsConstructor;

import java.util.Random;

/**
 * Created by Evegeny on 29/08/2016.
 */
@AllArgsConstructor
public class IntegerFactory {


    private int max;

    public int getInt() {
        Random random = new Random();
        return random.nextInt(max);
    }
}
