package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {

    // If the word starts with a vowe, then return the original string with "way" appended.
    public String addWay(String str) {
        return str + "way";
    }

    // If the word starts with a consonant, then shift consonants from the beginning of the word to the end of the
    // word until the first vowel. Then, return the newly shifted string with "ay" appended.
    public String addFirstLetterPlusAy(String str) {
        return str.substring(VowelUtils.getIndexOfFirstVowel(str)) +
                str.substring(0, VowelUtils.getIndexOfFirstVowel(str)) + "ay";
    }

    //If the word has no vowels, then return the original string plus "ay".
    public String addAy(String str) {
        return str + "ay";

    }
    public String translate(String str) {
        String[] arr = str.split(" ");
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < arr.length - 1; i++) {
            if(VowelUtils.startsWithVowel(str))
                result.append(addWay(arr[i])).append(" ");
            if(!VowelUtils.startsWithVowel(str) && VowelUtils.hasVowels(str))
                result.append(addFirstLetterPlusAy(arr[i])).append(" ");
            if(!VowelUtils.hasVowels(str))
                result.append(addAy(arr[i])).append(" ");
        }

        // Similar to the for loop above but to make sure a blank space is not appended
        if(VowelUtils.startsWithVowel(str))
            result.append(addWay(arr[arr.length - 1]));
        if(!VowelUtils.startsWithVowel(str) && VowelUtils.hasVowels(str))
            result.append(addFirstLetterPlusAy(arr[arr.length - 1]));
        if(!VowelUtils.hasVowels(str))
            result.append(addAy(arr[arr.length - 1]));

        return String.valueOf(result);
    }
}
