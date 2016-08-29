package spring.quoters;

import factory.Benchmark;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import javax.annotation.PreDestroy;
import java.util.List;

/**
 * Created by Evegeny on 26/08/2016.
 */
@Setter
@Benchmark
@Transactional
@DeprecatedClass(T1000.class)
public class TerminatorQuoter implements Quoter {

    private List<String> messages;

    public void killAll() {
        System.out.println("You are terminated...");
    }

    @Override
    public void sayQuote() {
       messages.forEach(System.out::println);
    }


    public static void main(String[] args) {
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("Math.random()");
        System.out.println("expression = " + expression.getValue()  );
    }










}
