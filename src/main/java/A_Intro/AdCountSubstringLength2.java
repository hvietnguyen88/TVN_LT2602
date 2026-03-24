package A_Intro;

/**
 * Provides a utility method for counting length-2 substrings within a string.
 */
public class AdCountSubstringLength2 {

    /**
     * Returns the number of substrings of length exactly 2 that can be formed
     * from consecutive characters in the input string.
     *
     * <p>For a string of length {@code n}, there are {@code n - 1} such substrings.
     * For example, {@code "abcd"} yields 3 substrings: {@code "ab"}, {@code "bc"}, {@code "cd"}.
     *
     * @param inputString the string to evaluate
     * @return the count of length-2 substrings, or {@code 0} if {@code inputString}
     *         is {@code null} or shorter than 2 characters
     */
    public static int countSubstringLength2(String inputString) {
        if (inputString == null || inputString.length() < 2) {
            return 0;
        }
        return inputString.length() - 1;
    }
}