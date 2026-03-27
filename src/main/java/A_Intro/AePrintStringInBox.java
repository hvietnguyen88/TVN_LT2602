package A_Intro;

public class AePrintStringInBox {

    /**
     * Prints a string inside a dynamically sized box.
     *
     * Rules:
     * - Box uses +, -, |
     * - One space padding on each side of the content
     * - Null or empty input prints an empty box
     */
    public static void printInBox(String numberString) {
        // Normalize input (handle null safely)
        String content = (numberString == null) ? "" : numberString;

        int length = content.length();
        String horizontal = "-".repeat(length + 2);
        String border = "+" + horizontal + "+";

        System.out.println(border);
        System.out.println("| " + content + " |");
        System.out.println(border);
    }
}