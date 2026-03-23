package A_Intro;

/**
 * Utility class for checking if a character is a vowel.
 */
public class AaIsVowel {
    /**
     * Determines whether the given inputString is a single vowel character (case-insensitive).
     *
     * @param inputString a String containing exactly one character to check
     * @return true if inputString is a single vowel (a, e, i, o, u), false otherwise
     * @throws NullPointerException if inputString is null (handled gracefully, returns false)

     * Examples:
     * <ul>
     *   <li>isVowel("a") returns true</li>
     *   <li>isVowel("A") returns true</li>
     *   <li>isVowel("b") returns false</li>
     *   <li>isVowel("ab") returns false (multiple characters)</li>
     *   <li>isVowel(null) returns false</li>
     *   <li>isVowel("") returns false (empty string)</li>
     * </ul>
     */
    public static boolean isVowel(String inputString) {
        if (inputString == null || inputString.length() != 1) {
            return false;
        }
        return inputString.toLowerCase().matches("[aeiou]");
    }
}
