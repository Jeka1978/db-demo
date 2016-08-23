package school;

import lombok.AllArgsConstructor;

import java.util.Random;

/**
 * Created by Jeka on 23/08/2016.
 */
public class GeneratorAssistantImpl implements GeneratorAssistant {
    private int max;
    private Random random = new Random();

    public GeneratorAssistantImpl(int max) {
        this.max = max;
    }

    @Override
    public Exercise generateTemplate() {
        Exercise exercise = new Exercise();
        exercise.setA(random.nextInt(max));
        exercise.setB(random.nextInt(max));
        return exercise;
    }
}
