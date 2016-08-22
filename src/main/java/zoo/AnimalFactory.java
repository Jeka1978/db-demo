package zoo;

/**
 * Created by Jeka on 22/08/2016.
 */
public class AnimalFactory {
    private static AnimalFactory ourInstance = new AnimalFactory();

    public static AnimalFactory getInstance() {
        return ourInstance;
    }

    private AnimalFactory() {
    }

    public Animal createRandomAnimal() {
        //// TODO: 22/08/2016
        return null;
    }
}
