package eu.misnet.staycalm;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.Menu;
import android.view.MenuItem;

/*
*
* */

public class ActivityShowExercise extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_exercise);

        // Check whether the activity is using the layout version with
        // the fragment_container FrameLayout. If so, we must add the first fragment
        if (findViewById(R.id.activity_show_exercise) != null){

            // However, if we're being restored from a previous state,
            // then we don't need to do anything and should return or else
            // we could end up with overlapping fragments.
            if (savedInstanceState != null) {
                return;
            }

            // Create an instance of ExerciseFragment
            FragmentShowExercise exerciseFragment = new FragmentShowExercise();

            // Add the fragment to the 'fragment_container' FrameLayout
            getFragmentManager().beginTransaction().add(R.id.fragment_exercise_container, exerciseFragment).commit();

            // Add content to fragment
            setExercise();
        }
    }

    void setExercise(){
        // Capture the article fragment from the activity layout
        FragmentShowExercise exerciseFragment = (FragmentShowExercise) getFragmentManager().findFragmentById(R.id.activity_show_exercise);

        if (exerciseFragment != null){
            exerciseFragment.setExerciseText();
            exerciseFragment.setExerciseText();
        }
    }

    @Override public boolean onTouchEvent(MotionEvent e){
        switch(e.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                showNextExercise();
                break;
            case MotionEvent.ACTION_MOVE:
                break;
            case MotionEvent.ACTION_UP:
                break;
        }
        return true;
    }

    private void showNextExercise() {
        ExerciseContent.setNextExerciseContent();
        FragmentShowExercise exerciseFragment = new FragmentShowExercise();
        getFragmentManager().beginTransaction().replace(R.id.fragment_exercise_container,exerciseFragment).commit();
    }
}
