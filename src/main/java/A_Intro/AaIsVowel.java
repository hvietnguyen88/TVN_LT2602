package A_Intro;

/**
 * Utility class for checking if a character (as a string) is a vowel.
 */
public class AaIsVowel {

    /**
     * Determines whether the given inputString is a single vowel character (a, e, i, o, u), case-insensitive.
     *
     * @param inputString a String containing exactly one character to check
     * @return true if inputString is a single vowel, false otherwise
     */
    public static boolean isVowel(String inputString) {
        if (inputString == null || inputString.length() != 1) {
            return false;
        }
        char c = Character.toLowerCase(inputString.charAt(0));
        return "aeiou".indexOf(c) >= 0;
    }
}