package A_Intro;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link AbVowelCounter#countVowels(String)}.
 *
 * <p>Verifies vowel counting across typical, mixed-case, and edge-case inputs.</p>
 *
 * @see AbVowelCounter
 */
public class AbVowelCounterTest {

    /**
     * Tests that vowels are counted correctly in typical string inputs.
     */
    @Test
    public void testTypicalInputs() {
        assertEquals(1, AbVowelCounter.countVowels("An"));
        assertEquals(2, AbVowelCounter.countVowels("hello"));
        assertEquals(5, AbVowelCounter.countVowels("Education"));
        assertEquals(0, AbVowelCounter.countVowels("rhythm"));
    }

    /**
     * Tests that edge-case inputs return {@code 0}.
     */
    @Test
    public void testEdgeCases() {
        assertEquals(0, AbVowelCounter.countVowels(""));
        assertEquals(0, AbVowelCounter.countVowels("  "));
        assertEquals(0, AbVowelCounter.countVowels(null));
        assertEquals(0, AbVowelCounter.countVowels("123&^*&"));
    }
}