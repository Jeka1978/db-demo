package spring.quoters;

import lombok.ToString;

/**
 * Created by Evegeny on 26/08/2016.
 */
@ToString
public class Person {
    private String name;
    private String family;

    public Person(String имя, String фамилия) {
        this.name = имя;
        this.family = фамилия;
    }
}
