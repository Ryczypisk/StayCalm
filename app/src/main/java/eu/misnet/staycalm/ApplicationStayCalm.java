package eu.misnet.staycalm;

import android.app.Application;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by MChojaczyk on 2015-09-08.
 */
public class ApplicationStayCalm extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        ExerciseContent.setContext(this);
    }
}
