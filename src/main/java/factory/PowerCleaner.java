package factory;

import org.springframework.core.annotation.Order;

/**
 * Created by Jeka on 24/08/2016.
 */
public class PowerCleaner implements Cleaner {
    @InjectRandomInt(min=3,max=7)
    private int repeat;
    @Override
    @Benchmark
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("VVVVVVVVVVvv");
        }
    }
}
