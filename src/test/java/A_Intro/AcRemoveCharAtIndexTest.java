package A_Intro;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for {@link AcRemoveCharAtIndex#removeCharAtIndex(String, int)}.
 */
@DisplayName("AcRemoveCharAtIndex")
class AcRemoveCharAtIndexTest {

    @Nested
    @DisplayName("Standard cases")
    class StandardCases {

        @ParameterizedTest(name = "removeCharAtIndex(\"{0}\", {1}) == \"{2}\"")
        @CsvSource({
                "Hello, 0, ello",   // remove first char
                "java,  2, jaa",    // remove middle char
                "Hello, 4, Hell"    // remove last char
        })
        @DisplayName("Removes the character at the given index")
        void removesCharAtIndex(String input, int index, String expected) {
            assertEquals(expected, AcRemoveCharAtIndex.removeCharAtIndex(input, index));
        }
    }

    @Nested
    @DisplayName("Edge cases")
    class EdgeCases {

        @Test
        @DisplayName("Empty string returns empty string")
        void emptyStringReturnsEmpty() {
            assertEquals("", AcRemoveCharAtIndex.removeCharAtIndex("", 0));
        }

        @Test
        @DisplayName("Null input returns empty string")
        void nullInputReturnsEmpty() {
            assertEquals("", AcRemoveCharAtIndex.removeCharAtIndex(null, 0));
        }

        @Test
        @DisplayName("Whitespace string removes one space at index")
        void whitespaceStringRemovesOneSpace() {
            assertEquals("  ", AcRemoveCharAtIndex.removeCharAtIndex("   ", 2));
        }

        @Test
        @DisplayName("Index >= length returns original string")
        void indexTooLargeReturnsOriginal() {
            assertEquals("Hello", AcRemoveCharAtIndex.removeCharAtIndex("Hello", 5));
        }

        @Test
        @DisplayName("Negative index returns original string")
        void negativeIndexReturnsOriginal() {
            assertEquals("Hello", AcRemoveCharAtIndex.removeCharAtIndex("Hello", -1));
        }
    }
}