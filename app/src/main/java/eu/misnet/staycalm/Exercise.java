package eu.misnet.staycalm;

/**
 * Created by MChojaczyk on 2015-09-08.
 */
public class Exercise {
    private String exerciseName;
    private String exerciseHint;

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public String getExerciseInstruction() {
        return exerciseHint;
    }

    public void setExerciseHint(String exerciseHint) {
        this.exerciseHint = exerciseHint;
    }

    public Exercise(String exerciseName, String exerciseHint) {
        this.exerciseName = exerciseName;
        this.exerciseHint = exerciseHint;
    }
}

