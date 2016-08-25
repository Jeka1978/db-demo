package threads;

/**
 * Created by Evegeny on 25/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println(123);
        });
        thread.start();
        Thread thread2 = new Thread(() -> {
            System.out.println(666);
        });
        thread2.start();
    }
}
