package A_Intro;

/**
 * Utility class for counting vowels in a string.
 *
 * <p>Vowel detection is delegated to {@link AaIsVowel#isVowel(String)},
 * which recognizes the characters a, e, i, o, and u regardless of case.</p>
 *
 * @see AaIsVowel
 */
public class AbVowelCounter {

    /**
     * Counts the number of vowels in the given string.
     *
     * <p>Each character in {@code inputString} is evaluated individually
     * using {@link AaIsVowel#isVowel(String)}. Both uppercase and lowercase
     * vowels are counted.</p>
     *
     * <p>Examples:</p>
     * <pre>
     *   countVowels("hello")  // returns 2
     *   countVowels("rhythm") // returns 0
     *   countVowels("")       // returns 0
     *   countVowels(null)     // returns 0
     * </pre>
     *
     * @param inputString the string to evaluate; may be {@code null}
     * @return the number of vowels found, or {@code 0} if the input is
     *         {@code null} or contains no vowels
     */
    public static int countVowels(String inputString) {
        if (inputString == null) {
            return 0;
        }

        int count = 0;
        for (char c : inputString.toCharArray()) {
            if (AaIsVowel.isVowel(String.valueOf(c))) {
                count++;
            }
        }
        return count;
    }
}