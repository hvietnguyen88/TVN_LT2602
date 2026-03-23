package A_Intro;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link AbVowelCounter#countVowels(String)}.
 *
 * <p>Verifies that vowels are counted correctly across a range of inputs,
 * including mixed-case strings, edge cases such as empty and whitespace-only
 * strings, {@code null}, and strings containing no vowels.</p>
 *
 * @see AbVowelCounter
 */
public class AbVowelCounterTest {

    /**
     * Tests that vowels are counted correctly in typical string inputs.
     *
     * <p>Covers the following cases:</p>
     * <ul>
     *   <li>{@code "An"} — one uppercase vowel, expects {@code 1}</li>
     *   <li>{@code "hello"} — two lowercase vowels, expects {@code 2}</li>
     *   <li>{@code "Education"} — five mixed-case vowels, expects {@code 5}</li>
     *   <li>{@code "rhythm"} — no vowels, expects {@code 0}</li>
     * </ul>
     */
    @Test
    public void test001() {
        int rs1 = AbVowelCounter.countVowels("An");
        Assert.assertEquals(1, rs1);
        int rs2 = AbVowelCounter.countVowels("hello");
        Assert.assertEquals(2, rs2);
        int rs3 = AbVowelCounter.countVowels("Education");
        Assert.assertEquals(5, rs3);
        int rs4 = AbVowelCounter.countVowels("rhythm");
        Assert.assertEquals(0, rs4);
    }

    /**
     * Tests that edge-case inputs return {@code 0}.
     *
     * <p>Covers the following cases:</p>
     * <ul>
     *   <li>An empty string ({@code ""})</li>
     *   <li>A whitespace-only string ({@code "  "})</li>
     *   <li>A {@code null} input</li>
     *   <li>A string containing only digits and special characters ({@code "123&^*&"})</li>
     * </ul>
     */
    @Test
    public void test002() {
        int rs1 = AbVowelCounter.countVowels("");
        Assert.assertEquals(0, rs1);
        int rs2 = AbVowelCounter.countVowels("  ");
        Assert.assertEquals(0, rs2);
        int rs3 = AbVowelCounter.countVowels(null);
        Assert.assertEquals(0, rs3);
        int rs4 = AbVowelCounter.countVowels("123&^*&");
        Assert.assertEquals(0, rs4);
    }
}