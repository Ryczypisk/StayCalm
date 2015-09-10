package eu.misnet.staycalm;

/**
 * Created by MChojaczyk on 2015-09-08.
 */
import android.content.Context;
import android.content.res.Resources;

public class ExerciseContent {

    private static int currentExerciseNumber = 0;
    private static int startExerciseNumber = 5; // todo: generate random number
    private static Resources resources;
    private static String[] exerciseNames;
    private static String[] exerciseHints;
    public static Exercise exercise;

    public static void setContext(Context context) {
        resources = context.getResources();
        exerciseNames = resources.getStringArray(R.array.exercise_names);
        exerciseHints = resources.getStringArray(R.array.exercise_instructions);
        exercise = new Exercise(exerciseNames[startExerciseNumber], exerciseHints[startExerciseNumber]);
    }

    public static Exercise getExercise() {
        return exercise;
    }

    public static void setNextExerciseContent() {
        if (currentExerciseNumber < exerciseNames.length -1){
            currentExerciseNumber++;
        } else {
            currentExerciseNumber = 0;
        }
        exercise.setExerciseName(exerciseNames[currentExerciseNumber]);
        exercise.setExerciseHint(exerciseHints[currentExerciseNumber]);
    }
}
