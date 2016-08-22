package immutable;

import lombok.*;

/**
 * Created by Jeka on 22/08/2016.
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Value
@Builder
public final class Employee2 {
    @NonNull
    private String name;
    @NonNull
    private Integer salary;
    private int bonus;

    public Employee2 setName(String name) {
        return new Employee2(name, salary, bonus);
    }

    public Employee2 addBonus(int delta) {
        return new Employee2(name, salary, bonus + delta);
    }


}
