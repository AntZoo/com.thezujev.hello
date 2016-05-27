package com.thezujev.hello.second;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for WeekDay
 * Created by zujevant on 24.5.2016.
 */
public class WeekDayTest {

    private static WeekDay wd;

    @BeforeClass
    public static void OneTimeSetup() { wd = new WeekDay(); }

    @Test
    public void getMonday() throws Exception {
        assertEquals("That's a Monday!", wd.resolveDay(1));
    }

    @Test
    public void getZeroDay() throws Exception {
        try {
            assertEquals("A day cannot have an index of zero.", wd.resolveDay(0));
        } catch (Exception e) {
            // do nothing, success
        }
    }

    @Test
    public void getLargeDay() throws Exception {
        try {
            assertEquals("A week only has seven days. :(", wd.resolveDay(100));
        } catch (Exception e) {
            // do nothing, success
        }
    }
}