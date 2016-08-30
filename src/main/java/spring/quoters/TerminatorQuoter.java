package spring.quoters;

import factory.Benchmark;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Evegeny on 26/08/2016.
 */
@Benchmark
@Transactional
@Component
@Qualifier("books")
public class TerminatorQuoter implements Quoter {


    private List<String> messages;

    @Value("${terminator}")
    public void setMessages(String[] messages,@Value("${JAVA_HOME}") String javaHome) {
        System.out.println("javaHome = " + javaHome);
        this.messages = new ArrayList<>(Arrays.asList(messages));
    }

    public void killAll() {
        System.out.println("You are terminated...");
    }

    @Override
    @Deprecated
    public void sayQuote() {
       messages.forEach(System.out::println);
    }


    public static void main(String[] args) {
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("Math.random()");
        System.out.println("expression = " + expression.getValue()  );
    }










}
