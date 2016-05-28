package com.thezujev.hello.second;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by zujevant on 27-May-16.
 */
public class MultiplicationTest {

    private static Multiplication multi;

    @BeforeClass
    public static void OneTimeSetup() { multi = new Multiplication(); }

    @Test
    public void printMultiplicationsInTable() throws Exception {
        assertEquals("5   10  15  20  25  30  35  40  45  50", multi.printMultiplicationsInTable(5, 1).trim());
    }

}