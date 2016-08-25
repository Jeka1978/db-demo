package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by Evegeny on 25/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee(10), new Employee(12), new Employee(13));
        int sum = employees.stream().mapToInt(Employee::getSalary).sum();
        System.out.println(sum);
    }
}
