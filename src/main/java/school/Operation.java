package school;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by Jeka on 23/08/2016.
 */
@AllArgsConstructor
@Getter
public enum Operation implements Serializable {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String sign;


    @Override
    public String toString() {
        return sign;
    }
}
