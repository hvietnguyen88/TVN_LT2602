package A_Intro;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for {@link AcRemoveCharAtIndex#removeCharAtIndex(String, int)}.
 *
 * <p>Tests are grouped by behaviour: standard removal cases and edge cases
 * (empty string, whitespace, and {@code null} input).</p>
 */
public class AcRemoveCharAtIndexTest {

    /**
     * Verifies that the character at index 0 (first character) is correctly removed.
     */
    @Test
    public void removesFirstChar() {
        String result = AcRemoveCharAtIndex.removeCharAtIndex("Hello", 0);
        Assert.assertEquals("ello", result);
    }

    /**
     * Verifies that a character at a middle index is correctly removed.
     */
    @Test
    public void removesMiddleChar() {
        String result = AcRemoveCharAtIndex.removeCharAtIndex("java", 2);
        Assert.assertEquals("jaa", result);
    }

    /**
     * Verifies that the last character is correctly removed.
     */
    @Test
    public void removesLastChar() {
        String result = AcRemoveCharAtIndex.removeCharAtIndex("Education", 8);
        Assert.assertEquals("Educatio", result);
    }

    /**
     * Verifies that an out-of-bounds index (>= string length) returns the original string.
     */
    @Test
    public void indexTooLargeReturnsOriginal() {
        String result = AcRemoveCharAtIndex.removeCharAtIndex("Hello", 5);
        Assert.assertEquals("Hello", result);
    }

    /**
     * Verifies that a negative index returns the original string unmodified.
     */
    @Test
    public void negativeIndexReturnsOriginal() {
        String result = AcRemoveCharAtIndex.removeCharAtIndex("Hello", -1);
        Assert.assertEquals("Hello", result);
    }

    /**
     * Verifies that an empty string input returns an empty string.
     */
    @Test
    public void emptyStringReturnsEmpty() {
        String result = AcRemoveCharAtIndex.removeCharAtIndex("", 0);
        Assert.assertEquals("", result);
    }

    /**
     * Verifies that a whitespace-only string is treated as a normal string —
     * one space is removed at the given index, returning the remaining spaces.
     */
    @Test
    public void whitespaceStringRemovesOneSpace() {
        String result = AcRemoveCharAtIndex.removeCharAtIndex("   ", 2);
        Assert.assertEquals("  ", result); // 3 spaces → 2 spaces
    }

    /**
     * Verifies that a {@code null} input returns an empty string.
     */
    @Test
    public void nullInputReturnsEmpty() {
        String result = AcRemoveCharAtIndex.removeCharAtIndex(null, 0);
        Assert.assertEquals("", result);
    }
}