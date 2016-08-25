package threads;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Evegeny on 25/08/2016.
 */
public class Main2 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit((Runnable) () -> {
            while (true) {
                System.out.println(111);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        executorService.submit((Runnable) () -> {
            while (true) {
                System.out.println(222);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });executorService.submit((Runnable) () -> {
            while (true) {
                System.out.println(333);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}


