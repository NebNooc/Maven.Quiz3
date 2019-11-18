package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        Set<String> set = new LinkedHashSet<>();

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++) {
            set.add(StringUtils.capitalizeNthCharacter(str, i));
        }
        String[] result = new String[str.length()];
        set.toArray(result);
        return result;
    }
}
