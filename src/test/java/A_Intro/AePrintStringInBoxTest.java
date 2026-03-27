package A_Intro;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link AePrintStringInBox}.
 *
 * <p>
 * This class tests various cases of printing a string inside a box:
 * - Single characters
 * - Multiple characters
 * - Null input
 * - Empty string
 * - Strings containing only spaces
 * </p>
 *
 * <p>
 * Each test captures console output and asserts that the box is printed correctly.
 * Tests are executed in the order they appear in the class.
 * </p>
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AePrintStringInBoxTest {

    /** Helper method to capture System.out output */
    private String capturePrint(Runnable runnable) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        try {
            runnable.run();
        } finally {
            System.setOut(originalOut); // Restore original System.out
        }

        return out.toString();
    }

    @Test
    @Order(1)
    void testLength1String() {
        String output = capturePrint(() -> AePrintStringInBox.printInBox("5"));
        String expected = """
                +---+
                | 5 |
                +---+
                """;
        assertEquals(expected, output);
    }

    @Test
    @Order(2)
    void testLength2String() {
        String output = capturePrint(() -> AePrintStringInBox.printInBox("55"));
        String expected = """
                +----+
                | 55 |
                +----+
                """;
        assertEquals(expected, output);
    }

    @Test
    @Order(3)
    void testLength3String() {
        String output = capturePrint(() -> AePrintStringInBox.printInBox("555"));
        String expected = """
                +-----+
                | 555 |
                +-----+
                """;
        assertEquals(expected, output);
    }

    @Test
    @Order(4)
    void testNull() {
        String output = capturePrint(() -> AePrintStringInBox.printInBox(null));
        String expected = """
                +--+
                |  |
                +--+
                """;
        assertEquals(expected, output);
    }

    @Test
    @Order(5)
    void testEmptyString() {
        String output = capturePrint(() -> AePrintStringInBox.printInBox(""));
        String expected = """
                +--+
                |  |
                +--+
                """;
        assertEquals(expected, output);
    }

    @Test
    @Order(6)
    void test1SpaceString() {
        String output = capturePrint(() -> AePrintStringInBox.printInBox(" "));
        String expected = """
                +---+
                |   |
                +---+
                """;
        assertEquals(expected, output);
    }

    @Test
    @Order(7)
    void test3SpaceString() {
        String output = capturePrint(() -> AePrintStringInBox.printInBox("   "));
        String expected = """
                +-----+
                |     |
                +-----+
                """;
        assertEquals(expected, output);
    }
}