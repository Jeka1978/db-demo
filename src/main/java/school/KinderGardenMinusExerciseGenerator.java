package school;

import java.util.Random;

/**
 * Created by Jeka on 23/08/2016.
 */
public class KinderGardenMinusExerciseGenerator implements ExerciseGenerator {
    private Random random = new Random();
    @Override
    public Exercise generate() {
        Exercise exercise = new Exercise();
        exercise.setA(random.nextInt(10));
        exercise.setB(random.nextInt(exercise.getA()));
        exercise.setOperation(Operation.MINUS);
        exercise.setAnswer(exercise.getA()-exercise.getB());
        return exercise;

    }
}
