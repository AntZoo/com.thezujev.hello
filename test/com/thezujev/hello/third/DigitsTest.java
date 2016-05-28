package com.thezujev.hello.third;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by zujevant on 28-May-16.
 */
public class DigitsTest {

    private static Digits digi;

    @BeforeClass
    public static void OneTimeSetup() throws Exception { digi = new Digits(); }

    @Test
    public void digitsSumCycle() throws Exception {
        assertEquals(55, digi.digitsSumCycle(10));
    }

    @Test
    public void factorialCycle() throws Exception {
        assertEquals(3628800, digi.factorialCycle(10));
    }

    @Test
    public void digitsSumRecursion() throws Exception {
        assertEquals(55, digi.digitsSumRecursion(10));
    }

    @Test
    public void factorialRecursion() throws Exception {
        assertEquals(3628800, digi.factorialRecursion(10));
    }

    @Test
    public void factorialCycleEqualsRecursion() throws Exception {
        assertEquals(digi.factorialCycle(13), digi.factorialRecursion(13));
    }

    @Test
    public void digitsSumCycleEqualsRecursion() throws Exception {
        assertEquals(digi.digitsSumCycle(100), digi.digitsSumRecursion(100));
    }

    @Test
    public void largeFactorialRecursion() throws Exception {
        assertEquals(0, digi.factorialRecursion(1000));
    }

    @Test
    public void largeFactorialCycle() throws Exception {
        assertEquals(0, digi.factorialCycle(1000));
    }

    @Test
    public void largeSumRecursion() throws Exception {
        assertEquals(500500, digi.digitsSumRecursion(1000));
    }

    @Test
    public void largeSumCycle() throws Exception {
        assertEquals(500500, digi.digitsSumCycle(1000));
    }

    @Test
    public void zeroFactorialRecursion() throws Exception {
        assertEquals(0, digi.factorialRecursion(0));
    }

    @Test
    public void zeroFactorialCycle() throws Exception {
        assertEquals(0, digi.factorialCycle(0));
    }

    @Test
    public void zeroSumRecursion() throws Exception {
        assertEquals(0, digi.digitsSumRecursion(0));
    }

    @Test
    public void zeroSumCycle() throws Exception {
        assertEquals(0, digi.digitsSumCycle(0));
    }

    @Test
    public void oneFactorialRecursion() throws Exception {
        assertEquals(1, digi.factorialRecursion(1));
    }

    @Test
    public void oneFactorialCycle() throws Exception {
        assertEquals(1, digi.factorialCycle(1));
    }

    @Test
    public void oneSumRecursion() throws Exception {
        assertEquals(1, digi.digitsSumRecursion(1));
    }

    @Test
    public void oneSumCycle() throws Exception {
        assertEquals(1, digi.digitsSumCycle(1));
    }
}