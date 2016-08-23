package school;

/**
 * Created by Jeka on 23/08/2016.
 */
public class MultiplyFirstDegreeExerciseGenerator implements ExerciseGenerator {
    private GeneratorAssistant assistant =
            new GeneratorAssistantImpl(5);
    @Override
    public Exercise generate() {
        Exercise exercise = assistant.generateTemplate();
        exercise.setOperation(Operation.MULTIPLY);
        exercise.setAnswer(exercise.getA() * exercise.getB());
        return exercise;
    }
}
