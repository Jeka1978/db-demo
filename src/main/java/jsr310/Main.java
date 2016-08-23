package jsr310;

import org.joda.time.DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Created by Jeka on 23/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime beforeY = now.minusDays(2);
        long between = ChronoUnit.MINUTES.between(beforeY, now);
        System.out.println(between);



    }
}
