package eu.misnet.staycalm;

import android.app.Application;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by MChojaczyk on 2015-09-08.
 * ToDo:
 * 1. Swipowanie pomiędzy podpowiedziami http://developer.android.com/training/implementing-navigation/lateral.html#horizontal-paging
 * 2. Przypomnienia raz dziennie + ustawienia wł/wył
 * 3. ustawienia kiedy przypomnienia
 */
public class ApplicationStayCalm extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        ExerciseContent.setContext(this);
    }
}
