package davidherrerojimenez.marvelcharacters.view.ui.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import dagger.android.AndroidInjection;
import davidherrerojimenez.marvelcharacters.view.ui.presenter.View;

/**
 * Project name: MarvelCharacters
 * Package name: davidherrerojimenez.marvelcharacters.view.ui.base
 * <p>
 * Created by dherrero on 3/09/17.
 */

public abstract class BaseActivity extends AppCompatActivity implements View {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {


        AndroidInjection.inject(this);

        setTheme(getThemeResId());

        super.onCreate(savedInstanceState);

        setContentView(getLayoutResId());

        bindViews();

        onPreparePresenter();

        onPrepareActivity();
    }


    protected void onPrepareActivity(){}

    protected void onPreparePresenter(){}

    private void bindViews(){
        ButterKnife.bind(this);
    }

    @LayoutRes
    protected abstract int getLayoutResId();

    @LayoutRes
    protected abstract int getThemeResId();

}
