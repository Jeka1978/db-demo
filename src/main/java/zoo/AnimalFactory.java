package zoo;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Created by Jeka on 22/08/2016.
 */
public class AnimalFactory {
    private static AnimalFactory ourInstance = new AnimalFactory();

    public static AnimalFactory getInstance() {
        return ourInstance;
    }

    private Reflections reflections = new Reflections();
    private List<Class<? extends Animal>> animalsTypes = new ArrayList<>();

    private Random random = new Random();

    private AnimalFactory() {
        Set<Class<? extends Animal>> classes = reflections.getSubTypesOf(Animal.class);
        for (Class<? extends Animal> animalClass : classes) {
            if (!Modifier.isAbstract(animalClass.getModifiers())) {
                animalsTypes.add(animalClass);
            }
        }
    }

    @SneakyThrows
    public Animal createRandomAnimal() {
        int i = random.nextInt(animalsTypes.size());
        return animalsTypes.get(i).newInstance();
    }
}
