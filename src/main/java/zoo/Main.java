package zoo;

/**
 * Created by Jeka on 22/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = AnimalFactory.getInstance();
        for (int i = 0; i < 10; i++) {
            factory.createRandomAnimal().makeVoice();
        }
    }
}
