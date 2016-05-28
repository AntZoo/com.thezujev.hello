package com.thezujev.hello.third;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for palindromes.
 * Created by zujevant on 29-May-16.
 */
public class PalindromeTest {
    private static Palindrome pal;
    private String pali = "A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!".replaceAll("\\W", "").toLowerCase();
    private String nonPal = "This is not a palindrome!".replaceAll("\\W", "").toLowerCase();
    private String cyrPal = "А роза упала на лапу Азора.".replaceAll("\\W", "").toLowerCase();
    private String digiPal = "1 2 3 4 5".replaceAll("\\W", "").toLowerCase();

    @BeforeClass
    public static void OneTimeSetup() throws Exception { pal = new Palindrome(); };

    @Test
    public void easySolutionPal() throws Exception {
        assertEquals(true, pal.easySolution(pali));
    }

    @Test
    public void recursiveSolutionPal() throws Exception {
        assertEquals(true, pal.recursiveSolution(pali));
    }

    @Test
    public void easySolutionNonPal() throws Exception {
        assertEquals(false, pal.easySolution(nonPal));
    }

    @Test
    public void recursiveSolutionNonPal() throws Exception {
        assertEquals(false, pal.recursiveSolution(nonPal));
    }

    @Test
    public void easySolutionCyrillicPal() throws Exception {
        assertEquals(true, pal.easySolution(cyrPal));
    }

    @Test
    public void recursiveSolutionCyrillicPal() throws Exception {
        assertEquals(true, pal.recursiveSolution(cyrPal));
    }

    @Test
    public void easySolutionDigiPal() throws Exception {
        assertEquals(false, pal.easySolution(digiPal));
    }

    @Test
    public void recursiveSolutionDigiPal() throws Exception {
        assertEquals(false, pal.recursiveSolution(digiPal));
    }
}