package tvn.lt2602.A_Intro;

public class AaIsVowel {
    public static boolean isVowel(String charInput) {
        if (charInput == null || charInput.length() != 1) {
            return false;
        }
        String newChar = charInput.toLowerCase();
        if (newChar.equals("a") ||
                newChar.equals("e") ||
                newChar.equals("i") ||
                newChar.equals("o") ||
                newChar.equals("u")) {
            return true;
        }
        return false;
    }
}
