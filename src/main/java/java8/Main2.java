package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Evegeny on 25/08/2016.
 */
public class Main2 {
    public static void main(String[] args) {
        List<Employee2> list = Arrays.asList(new Employee2(), new Employee2());
        IntStream intStream = list.stream().flatMapToInt(employee2 -> Arrays.stream(employee2.getSalaries()));
        int sum = intStream.sum();
    }
}
