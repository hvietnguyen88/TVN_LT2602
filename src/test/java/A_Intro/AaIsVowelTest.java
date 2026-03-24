package A_Intro;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link AaIsVowel#isVowel(String)}.
 *
 * <p>Verifies vowel detection for lowercase, uppercase, and edge-case inputs.</p>
 *
 * @see AaIsVowel
 */
public class AaIsVowelTest {

    /**
     * Tests that all lowercase vowels are recognized.
     */
    @Test
    public void testLowercaseVowels() {
        assertTrue(AaIsVowel.isVowel("a"));
        assertTrue(AaIsVowel.isVowel("e"));
        assertTrue(AaIsVowel.isVowel("i"));
        assertTrue(AaIsVowel.isVowel("o"));
        assertTrue(AaIsVowel.isVowel("u"));
    }

    /**
     * Tests that all uppercase vowels are recognized.
     */
    @Test
    public void testUppercaseVowels() {
        assertTrue(AaIsVowel.isVowel("A"));
        assertTrue(AaIsVowel.isVowel("E"));
        assertTrue(AaIsVowel.isVowel("I"));
        assertTrue(AaIsVowel.isVowel("O"));
        assertTrue(AaIsVowel.isVowel("U"));
    }

    /**
     * Tests that non-vowel and edge-case inputs return {@code false}.
     */
    @Test
    public void testEdgeCases() {
        assertFalse(AaIsVowel.isVowel("b"));
        assertFalse(AaIsVowel.isVowel(""));
        assertFalse(AaIsVowel.isVowel("  "));
        assertFalse(AaIsVowel.isVowel("ae"));
        assertFalse(AaIsVowel.isVowel(null));
        assertFalse(AaIsVowel.isVowel("1"));
    }
}