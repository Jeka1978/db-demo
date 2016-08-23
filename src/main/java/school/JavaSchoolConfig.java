package school;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeka on 23/08/2016.
 */
public class JavaSchoolConfig implements SchoolConfig {
    private List<ExerciseGenerator> exerciseGenerators = new ArrayList<>();
    @Override
    public List<ExerciseGenerator> getExerciseGenerators() {
        exerciseGenerators.add(new KinderGardenPlusExerciseGenerator());
        exerciseGenerators.add(new KinderGardenMinusExerciseGenerator());
        return exerciseGenerators;
    }
}
