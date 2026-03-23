package tvn.lt2602.A_Intro;

import org.junit.Assert;
import org.junit.Test;

public class AaIsVowelTest {
    @Test
    public void test001 () {
        boolean rs1 = AaIsVowel.isVowel("a");
        Assert.assertTrue(rs1);
        boolean rs2 = AaIsVowel.isVowel("e");
        Assert.assertTrue(rs2);
        boolean rs3 = AaIsVowel.isVowel("i");
        Assert.assertTrue(rs3);
        boolean rs4 = AaIsVowel.isVowel("o");
        Assert.assertTrue(rs4);
        boolean rs5 = AaIsVowel.isVowel("u");
    }

    @Test
    public void test002 () {
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

    @Test
    public void test003 () {
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
