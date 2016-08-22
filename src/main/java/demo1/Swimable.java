package demo1;

/**
 * Created by Jeka on 22/08/2016.
 */
public interface Swimable {
    default void work(){
        System.out.println("WORKING...");
    }
}
