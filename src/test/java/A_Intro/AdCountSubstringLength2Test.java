package A_Intro;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for {@link AdCountSubstringLength2#countSubstringLength2(String)}.
 *
 * <p>Test coverage:
 * <ul>
 *   <li>Typical strings of varying lengths</li>
 *   <li>Edge cases: single character, empty string, and {@code null}</li>
 * </ul>
 */
public class AdCountSubstringLength2Test {

    /**
     * Verifies the correct count for typical and single character string inputs.
     *
     * <p>Test cases:
     * <ul>
     *   <li>{@code "ab"}    → 1</li>
     *   <li>{@code "abc"}   → 2</li>
     *   <li>{@code "hello"} → 4</li>
     *   <li>{@code "a"}     → 0</li>
     * </ul>
     *
     * @param input    the string passed to the method under test
     * @param expected the expected number of length-2 substrings
     */
    @ParameterizedTest
    @CsvSource({
            "ab,    1",
            "abc,   2",
            "hello, 4",
            "a,     0",
    })
    void testCountSubstringLength2(String input, int expected) {
        assertEquals(expected, AdCountSubstringLength2.countSubstringLength2(input));
    }

    /**
     * Verifies that both {@code null} and empty string inputs return {@code 0}.
     *
     * <p>Uses {@code @NullAndEmptySource} to run the test twice —
     * once with {@code null} and once with {@code ""}.
     *
     * @param input the edge case input: {@code null} or {@code ""}
     */
    @ParameterizedTest
    @NullAndEmptySource
    void testNullAndEmptyReturnsZero(String input) {
        assertEquals(0, AdCountSubstringLength2.countSubstringLength2(input));
    }
}