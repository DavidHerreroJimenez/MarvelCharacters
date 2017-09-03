package davidherrerojimenez.marvelcharacters.data.utils;

/**
 * Project name: MarvelCharacters
 * Package name: davidherrerojimenez.marvelcharacters.data.utils
 * <p>
 * Created by dherrero on 3/09/17.
 */

public class TimeUtils {

    public static String getTimestampString(){

        Long tsLong = System.currentTimeMillis() / 1000;
        return tsLong.toString();
    }
}
