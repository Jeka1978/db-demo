package zoo;

/**
 * Created by Jeka on 22/08/2016.
 */
public class Cat implements Animal {
    static {
        System.out.println(123);
    }
    @Override
    public void makeVoice() {
        System.out.println("mau mau");
    }
}
