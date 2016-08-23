package school;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Jeka on 23/08/2016.
 */
public class Examinator {
    private List<ExerciseGenerator> exerciseGenerators;
    private SchoolConfig schoolConfig = new JavaSchoolConfig();
    private Random random = new Random();

    public Examinator() {
        exerciseGenerators = schoolConfig.getExerciseGenerators();
    }

    public Exercise generateExercise() {
        ExerciseGenerator generator = exerciseGenerators.get(random.nextInt(exerciseGenerators.size()));
        return generator.generate();
    }
}














