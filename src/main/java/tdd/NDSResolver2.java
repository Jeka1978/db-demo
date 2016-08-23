package tdd;

/**
 * Created by Jeka on 23/08/2016.
 */
public class NDSResolver2 {
    private static NDSResolver2 ourInstance = new NDSResolver2();

    public static NDSResolver2 getInstance() {
        return ourInstance;
    }

    private NDSResolver2() {
    }

    public double getNDS() {
        return 0.18;
    }
}
