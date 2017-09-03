package davidherrerojimenez.marvelcharacters.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;
import davidherrerojimenez.marvelcharacters.data.marvelapi.MarvelApiClient;
import davidherrerojimenez.marvelcharacters.view.ui.CharactersListActivity;
import davidherrerojimenez.marvelcharacters.view.ui.base.BaseActivity;

/**
 * Project name: MarvelCharacters
 * Package name: davidherrerojimenez.marvelcharacters.di.module
 * <p>
 * Created by dherrero on 3/09/17.
 */

@Module
public abstract class MarvelApiClientModule {

    @ContributesAndroidInjector
    abstract CharactersListActivity contributeActivityInjector();
}
