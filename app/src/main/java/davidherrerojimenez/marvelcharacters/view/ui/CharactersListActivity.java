package davidherrerojimenez.marvelcharacters.view.ui;

import android.support.annotation.Nullable;
import android.os.Bundle;

import java.util.List;

import javax.inject.Inject;

import davidherrerojimenez.marvelcharacters.R;
import davidherrerojimenez.marvelcharacters.data.marvelapi.MarvelApiClient;
import davidherrerojimenez.marvelcharacters.di.MarvelCharactersApplication;
import davidherrerojimenez.marvelcharacters.domain.Character;
import davidherrerojimenez.marvelcharacters.view.ui.base.BaseActivity;

import static davidherrerojimenez.marvelcharacters.R.style.*;

public class CharactersListActivity extends BaseActivity {

    @Inject
    MarvelApiClient marvelApiClient;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        marvelApiClient.build("spy");
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_characters_list;
    }

    @Override
    protected int getThemeResId() {

        int style = AppTheme;
        return style;
    }

    @Override
    protected void onPrepareActivity() {

        super.onPrepareActivity();


    }

}
