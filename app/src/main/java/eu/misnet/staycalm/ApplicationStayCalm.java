package eu.misnet.staycalm;

import android.app.Application;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by MChojaczyk on 2015-09-08.
 * ToDo:
 * 0. publikacja: https://play.google.com/apps/publish/?dev_acc=10320453111401279897#ContentRatingPlace:p=tmp.10320453111401279897.1441724885135
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
