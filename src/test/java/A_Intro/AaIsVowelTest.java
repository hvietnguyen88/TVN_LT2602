package A_Intro;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link AaIsVowel#isVowel(String)}.
 *
 * <p>Verifies that the method correctly identifies vowel characters
 * (a, e, i, o, u) regardless of case, and returns {@code false} for
 * all non-vowel, empty, whitespace, multi-character, numeric, and
 * {@code null} inputs.</p>
 *
 * @see AaIsVowel
 */
public class AaIsVowelTest {

    /**
     * Tests that each lowercase vowel (a, e, i, o, u) is recognized as a vowel.
     *
     * <p><b>Note:</b> The assertion for {@code "u"} is currently missing.
     * {@code Assert.assertTrue(rs5)} should be added.</p>
     */
    @Test
    public void test001() {
        boolean rs1 = AaIsVowel.isVowel("a");
        Assert.assertTrue(rs1);
        boolean rs2 = AaIsVowel.isVowel("e");
        Assert.assertTrue(rs2);
        boolean rs3 = AaIsVowel.isVowel("i");
        Assert.assertTrue(rs3);
        boolean rs4 = AaIsVowel.isVowel("o");
        Assert.assertTrue(rs4);
        boolean rs5 = AaIsVowel.isVowel("u");
        Assert.assertTrue(rs5);
    }

    /**
     * Tests that each uppercase vowel (A, E, I, O, U) is recognized as a vowel.
     */
    @Test
    public void test002() {
        boolean rs1 = AaIsVowel.isVowel("A");
        Assert.assertTrue(rs1);
        boolean rs2 = AaIsVowel.isVowel("E");
        Assert.assertTrue(rs2);
        boolean rs3 = AaIsVowel.isVowel("I");
        Assert.assertTrue(rs3);
        boolean rs4 = AaIsVowel.isVowel("O");
        Assert.assertTrue(rs4);
        boolean rs5 = AaIsVowel.isVowel("U");
        Assert.assertTrue(rs5);
    }

    /**
     * Tests that non-vowel and edge-case inputs return {@code false}.
     *
     * <p>Covers the following cases:</p>
     * <ul>
     *   <li>A consonant ({@code "b"})</li>
     *   <li>An empty string ({@code ""})</li>
     *   <li>A whitespace-only string ({@code "  "})</li>
     *   <li>A multi-character string ({@code "ae"})</li>
     *   <li>A {@code null} input</li>
     *   <li>A numeric character ({@code "1"})</li>
     * </ul>
     */
    @Test
    public void test003() {
        boolean rs1 = AaIsVowel.isVowel("b");
        Assert.assertFalse(rs1);
        boolean rs2 = AaIsVowel.isVowel("");
        Assert.assertFalse(rs2);
        boolean rs3 = AaIsVowel.isVowel("  ");
        Assert.assertFalse(rs3);
        boolean rs4 = AaIsVowel.isVowel("ae");
        Assert.assertFalse(rs4);
        boolean rs5 = AaIsVowel.isVowel(null);
        Assert.assertFalse(rs5);
        boolean rs6 = AaIsVowel.isVowel("1");
        Assert.assertFalse(rs6);
    }
}