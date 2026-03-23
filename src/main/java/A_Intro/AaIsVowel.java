package A_Intro;

/**
 * Utility class for checking if a character is a vowel.
 */
public class AaIsVowel {
    /**
     * Determines whether the given input is a single vowel character (case-insensitive).
     *
     * @param input a String containing exactly one character to check
     * @return true if input is a single vowel (a, e, i, o, u), false otherwise
     * @throws NullPointerException if input is null (handled gracefully, returns false)

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
    public static boolean isVowel(String input) {
        if (input == null || input.length() != 1) {
            return false;
        }
        return input.toLowerCase().matches("[aeiou]");
    }
}
