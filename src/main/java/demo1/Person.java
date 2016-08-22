package demo1;

import lombok.*;

import java.io.Serializable;
import java.util.function.Consumer;

/**
 * Created by Jeka on 22/08/2016.
 */

@Data
public class Person implements Serializable{
    private transient int age;
    private String name = "Fedor";
    private int salary;

    static {
        System.out.println("static block");
    }

    public void doX(String name, int... nums){

        age = nums[0];
        setAge(12);
    }

    {

        Comparable comparable = new Comparable<Integer>() {
            {

            }
            @Override
            public int compareTo(Integer o) {
                return 0;
            }
        };
        System.out.println("Initializer");
    }



}