package immutable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by Jeka on 22/08/2016.
 */
@AllArgsConstructor
@Getter
@ToString
public final class Employee {
    private final String name;
    private final int salary;
    private final int bonus;
    private final int age;

    public Employee setName(String name) {
        return new Employee(name, salary, bonus);
    }

    public Employee addBonus(int delta) {
        return new Employee(name, salary, bonus + delta);
    }


}
