package davidherrerojimenez.marvelcharacters.data.marvelapi;

import davidherrerojimenez.marvelcharacters.domain.CharacterDataWrapper;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/**
 * Project name: MarvelCharacters
 * Package name: davidherrerojimenez.marvelcharacters.data.restclient
 *
 * Created by dherrero on 3/09/17.
 */

public interface CharactersService {

    @Headers("Accept: */*")
    @GET("characters")
    Call<CharacterDataWrapper> getCharacterDataWrapper(@Query("nameStartsWith") String stringToFind);
}
