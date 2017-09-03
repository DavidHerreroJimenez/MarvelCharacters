package davidherrerojimenez.marvelcharacters.di;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import davidherrerojimenez.marvelcharacters.di.component.DaggerMarvelApiClientComponent;

/**
 * Project name: MarvelCharacters
 * Package name: davidherrerojimenez.marvelcharacters.di
 * <p>
 * Created by dherrero on 3/09/17.
 */

public class MarvelCharactersApplication  extends Application implements HasActivityInjector{

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();

        initializeInjector();
    }



    private void initializeInjector(){

        DaggerMarvelApiClientComponent.create().inject(this);
    }


    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }

}
