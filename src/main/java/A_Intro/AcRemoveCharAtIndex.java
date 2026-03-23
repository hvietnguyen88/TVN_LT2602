package A_Intro;

/**
 * Utility class for string manipulation operations.
 *
 * <p>This class provides methods for modifying strings based on character
 * position, such as removing a character at a specified index.</p>
 */
public class AcRemoveCharAtIndex {

    /**
     * Removes the character at the specified index from the input string.
     *
     * <p>The removal is position-based and case-sensitive. The original string
     * is not modified; a new string is returned.</p>
     *
     * <p>Edge case behavior:</p>
     * <ul>
     *   <li>If {@code inputString} is {@code null} or empty, returns {@code ""}.</li>
     *   <li>If {@code index} is out of bounds (less than 0 or greater than or
     *       equal to the length of the string), returns the original string unmodified.</li>
     * </ul>
     *
     * <p>Examples:</p>
     * <pre>{@code
     * removeCharAtIndex("hello", 1)  // returns "hllo"
     * removeCharAtIndex("hello", 0)  // returns "ello"
     * removeCharAtIndex("hello", 9)  // returns "hello"  (out of bounds)
     * removeCharAtIndex("", 0)       // returns ""
     * removeCharAtIndex(null, 0)     // returns ""
     * }</pre>
     *
     * @param inputString the string from which a character will be removed
     * @param index       the zero-based position of the character to remove
     * @return a new string with the character at {@code index} removed,
     *         or the original string if {@code index} is out of bounds,
     *         or {@code ""} if {@code inputString} is null or empty
     */
    public static String removeCharAtIndex(String inputString, int index) {
        if (inputString == null || inputString.isEmpty()) {
            return "";
        }
        if (index < 0 || index >= inputString.length()) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            if (i != index) {
                sb.append(inputString.charAt(i));
            }
        }
        return sb.toString();
    }
}