package springannotations.screensaver;

import factory.Benchmark;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by Evegeny on 29/08/2016.
 */
public class MyService {
    private final int x;
    private Random random = new Random();

    public MyService() {
        this.x = random.nextInt(1000);
    }

    public void a(){

        System.out.println("AAAaaaaaaaaa"+x);
    }

    @Benchmark
    public void b(){
        System.out.println("BBBBBBBBbbbbbb"+x);
    }
}
