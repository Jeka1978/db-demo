package immutable;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by Jeka on 22/08/2016.
 */
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public final class Employee {
    private final String name;
    private final int salary;
    private final int bonus;

    public Employee setName(String name) {
        return new Employee(name, salary, bonus);
    }

    public Employee addBonus(int delta) {
        return new Employee(name, salary, bonus + delta);
    }

    public static class Builder {
        private String name;
        private Integer salary;
        private Integer bonus;

        private boolean alreadyUsed;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder salary(int salary) {
            this.salary = salary;
            return this;
        }

        public Builder bonus(int bonus) {
            this.bonus = bonus;
            return this;
        }

        public Employee build() {
            if (alreadyUsed) {
                throw new IllegalStateException("builder can't be used more than once");
            }
            alreadyUsed = true;
            validate();
            return new Employee(name, salary, bonus);
        }

        private void validate() {
            if (name == null || salary != null) {
                throw new IllegalStateException(Employee.class.getName()+ " not valid");
            }
        }
    }

}
