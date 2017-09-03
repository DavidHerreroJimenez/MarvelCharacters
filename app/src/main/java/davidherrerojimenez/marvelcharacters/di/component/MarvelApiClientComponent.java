package davidherrerojimenez.marvelcharacters.di.component;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import davidherrerojimenez.marvelcharacters.di.MarvelCharactersApplication;
import davidherrerojimenez.marvelcharacters.view.ui.CharactersListActivity;
import davidherrerojimenez.marvelcharacters.di.module.MarvelApiClientModule;
/**
 * Project name: MarvelCharacters
 * Package name: davidherrerojimenez.marvelcharacters.di.component
 * <p>
 * Created by dherrero on 3/09/17.
 */


@Component(modules = {AndroidInjectionModule.class, MarvelApiClientModule.class})
public interface MarvelApiClientComponent extends AndroidInjector<MarvelCharactersApplication> {

}
