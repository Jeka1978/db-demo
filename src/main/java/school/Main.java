package school;

/**
 * Created by Jeka on 23/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        Examinator examinator = new Examinator();
        for (int i = 0; i < 20; i++) {
            System.out.println(examinator.generateExercise());

        }
    }
}
