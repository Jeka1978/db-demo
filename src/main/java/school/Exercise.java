package school;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Jeka on 23/08/2016.
 */
@Data
@Setter
public class Exercise {
    private int a;
    private int b;
    private Operation operation;
    private int answer;


    @Override
    public String toString() {
        return a + " " + operation + " " + b + " = " + answer;
    }
}










