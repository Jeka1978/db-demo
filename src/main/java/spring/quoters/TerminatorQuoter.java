package spring.quoters;

import factory.Benchmark;
import lombok.Setter;

import javax.annotation.PreDestroy;
import java.util.List;

/**
 * Created by Evegeny on 26/08/2016.
 */
@Setter
@Benchmark
@Transactional
public class TerminatorQuoter implements Quoter {
    private List<String> messages;

    public void killAll() {
        System.out.println("You are terminated...");
    }

    @Override
    public void sayQuote() {
       messages.forEach(System.out::println);
    }
}
