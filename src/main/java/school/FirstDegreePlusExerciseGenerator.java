package school;

import java.util.Random;

/**
 * Created by Jeka on 23/08/2016.
 */
public class FirstDegreePlusExerciseGenerator implements ExerciseGenerator {

    private GeneratorAssistant assistant
            = new GeneratorAssistantImpl(100);

    @Override
    public Exercise generate() {
        Exercise exercise = assistant.generateTemplate();
        exercise.setOperation(Operation.PLUS);
        exercise.setAnswer(exercise.getA()+exercise.getB());
        return exercise;
    }
}
