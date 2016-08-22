package demo1;

/**
 * Created by Jeka on 22/08/2016.
 */
public class Superman implements Swimable,Flyable {

    @Override
    public void work() {
        Swimable.super.work();
    }
}
