package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {

    private static String[] vowels = {"a", "A", "e", "E", "i", "I", "o", "O", "u", "U"};

    public static Boolean hasVowels(String word) {
        for(String vowel: vowels) {
            if(word.contains(vowel))
                return true;
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Integer indexOfFirstVowel = -1;

        if(hasVowels(word))
            indexOfFirstVowel = word.length();

        for(String vowel: vowels) {
            if(word.contains(vowel) && word.indexOf(vowel) < indexOfFirstVowel)
                    indexOfFirstVowel = word.indexOf(vowel);
        }
        return indexOfFirstVowel;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        String string = String.valueOf(character);
        return hasVowels(string);
    }
}
