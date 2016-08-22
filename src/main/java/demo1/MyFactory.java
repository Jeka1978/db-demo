package demo1;

/**
 * Created by Jeka on 22/08/2016.
 */
public class MyFactory {
    private static MyFactory ourInstance;

    static {
        ourInstance = new MyFactory();
    }

    public static MyFactory getInstance() {
        return ourInstance;
    }

    private MyFactory() {
    }
}
