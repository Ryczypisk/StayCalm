package eu.misnet.staycalm;

import android.app.Fragment;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */


public class FragmentShowExercise extends Fragment {

    public FragmentShowExercise() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_show_exercise, container, false);
    }

    @Override
    public void onStart(){
        super.onStart();
        setExerciseText();
    }

    public void setExerciseText() {
        TextView exerciseName = (TextView) getActivity().findViewById(R.id.fragment_show_exercise_name_text_view);
        exerciseName.setText(ExerciseContent.getExercise().getExerciseName());
        TextView exerciseInstruction = (TextView) getActivity().findViewById(R.id.fragment_show_exercise_instruction_text_view);
        exerciseInstruction.setText(ExerciseContent.getExercise().getExerciseInstruction());
        exerciseInstruction.setMovementMethod(new ScrollingMovementMethod());
    }
}
