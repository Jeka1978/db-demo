package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java8.Seniority.JUNIOR;
import static java8.Seniority.MIDDLE;
import static java8.Seniority.SENIOR;

/**
 * Created by Evegeny on 25/08/2016.
 */
public class MainWithCollectors {
    public static void main(String[] args) {
        Stream<Employee> stream = Stream.of(new Employee(1500), new Employee(1200)
                , new Employee(1300), new Employee(800), new Employee(6000));
        Map<Seniority, List<Employee>> map = stream.collect(
                Collectors.groupingBy(MainWithCollectors::resolveSeniority));
        System.out.println(map);
    }

    public static Seniority resolveSeniority(Employee employee) {
        if (employee.getSalary() < 1000) {
            return JUNIOR;
        }
        if (employee.getSalary() < 3000) {
            return MIDDLE;
        }
        return SENIOR;
    }
}
