package davidherrerojimenez.marvelcharacters.view.ui.presenter;

/**
 * Project name: MarvelCharacters
 * Package name: davidherrerojimenez.marvelcharacters.view.ui.presenter
 * <p>
 * Created by dherrero on 3/09/17.
 */

public class Presenter<T extends View> {

    private T view;


    public void initialise(){}

    public void finish(){}

    public T getView() {
        return view;
    }

    public void setView(T view) {
        this.view = view;
    }


}
