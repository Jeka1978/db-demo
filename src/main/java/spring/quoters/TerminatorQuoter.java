package spring.quoters;

import factory.Benchmark;
import lombok.Setter;

import java.util.List;

/**
 * Created by Evegeny on 26/08/2016.
 */
@Setter
@Benchmark
@Transactional
public class TerminatorQuoter implements Quoter {
    private List<String> messages;
    @Override
    public void sayQuote() {
       messages.forEach(System.out::println);
    }
}
