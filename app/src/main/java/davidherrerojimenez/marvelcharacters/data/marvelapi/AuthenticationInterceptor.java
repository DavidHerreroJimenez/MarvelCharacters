package davidherrerojimenez.marvelcharacters.data.marvelapi;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Project name: MarvelCharacters
 * Package name: davidherrerojimenez.marvelcharacters.data.restclient
 *
 * Created by dherrero on 3/09/17.
 */

public class AuthenticationInterceptor implements Interceptor {

    private String publicKey,hash,ts;

    private static final String APIKEY = "apikey", TIMESTAMP = "ts", HASH = "hash";

    public AuthenticationInterceptor(String publicKey, String hash, String ts) {

        this.publicKey = publicKey;
        this.hash = hash;
        this.ts = ts;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        HttpUrl url = request.url()
                .newBuilder()
                .addQueryParameter(APIKEY, publicKey)
                .addQueryParameter(TIMESTAMP, ts)
                .addQueryParameter(HASH,hash)

                .build();
        request = request.newBuilder().url(url).build();
        return chain.proceed(request);
    }
}
