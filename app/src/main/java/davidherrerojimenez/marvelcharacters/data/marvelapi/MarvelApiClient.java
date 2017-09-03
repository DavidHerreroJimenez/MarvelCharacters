package davidherrerojimenez.marvelcharacters.data.marvelapi;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import davidherrerojimenez.marvelcharacters.domain.Character;
import davidherrerojimenez.marvelcharacters.domain.CharacterDataWrapper;
import davidherrerojimenez.marvelcharacters.domain.CharacterDataContainer;
import davidherrerojimenez.marvelcharacters.data.utils.Constants;
import davidherrerojimenez.marvelcharacters.data.utils.Hash;
import davidherrerojimenez.marvelcharacters.data.utils.TimeUtils;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Project name: MarvelCharacters
 * Package name: davidherrerojimenez.marvelcharacters.data.restclient
 * <p>
 * Created by dherrero on 3/09/17.
 */

public class MarvelApiClient {

    private static final String TAG = "MarvelApiClient";

    private static String timestamp;
    private static String publicKey;
    private static String privateKey;
    private static String hash;

    @Inject
    public MarvelApiClient() {

        setPublicKey();
        setPrivateKey();
        setTimestamp();
        setHash();

    }


    public void build(String charSequence){



        OkHttpClient.Builder builder = new OkHttpClient.Builder().addInterceptor(new AuthenticationInterceptor(publicKey, hash, timestamp));

        OkHttpClient client = builder.build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.baseUrl)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CharactersService service = retrofit.create(CharactersService.class);

        setCall(service, charSequence);


    }

    private void setCall(CharactersService service, String charSequence){

        Call<CharacterDataWrapper> Characters= service.getCharacterDataWrapper(charSequence);

        Characters.enqueue(new Callback<CharacterDataWrapper>() {
            @Override
            public void onResponse(Call<CharacterDataWrapper> call, Response<CharacterDataWrapper> response) {
                if(response != null && response.body() != null) {

                    CharacterDataContainer data = response.body().getData();

                    if (data != null) {
                        List<Character> listCharactersFromApi = data.getResults();

                        // it's ok

                    }else{
                        List<Character> listCharactersFromApi = new ArrayList<Character>();

                    }
                }

            }

            @Override
            public void onFailure(Call<CharacterDataWrapper> call, Throwable t) {

                if (t != null){
                    if(t.getMessage() != null )
                        System.out.println(t.getMessage());
                }
            }

        });

    }


    private void setHash(){

        String toHash = timestamp + privateKey + publicKey;


        hash = Hash.md5(toHash);

    }

    private void setTimestamp(){
        timestamp = TimeUtils.getTimestampString();
    }

    private void setPublicKey(){
        publicKey = Constants.publicKey;

    }

    private void setPrivateKey(){
        privateKey = Constants.privateKey;
    }

}
