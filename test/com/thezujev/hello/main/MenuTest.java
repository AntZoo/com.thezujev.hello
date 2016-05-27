package com.thezujev.hello.main;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by zujevant on 27-May-16.
 */
public class MenuTest {
    private static Menu m;

    @BeforeClass
    public static void OneTimeSetup() { m = new Menu(); }

    @Test
    public void isExitTrue() throws Exception {
        assertEquals(true, m.isExit("q"));
    }

    @Test
    public void isExitFalse() throws Exception {
        assertEquals(false, m.isExit("test"));
    }

    @Test
    public void isHelpTrue() throws Exception {
        assertEquals(true, m.isHelp("?"));
    }

    @Test
    public void isHelpFalse() throws Exception {
        assertEquals(false, m.isHelp("test"));
    }

    @Test
    public void returnHelpMessage() throws Exception {
        assertEquals("HELP\n====\nTo select an assignment, please write it's number.\nTo view this help, type \"?\", \"h\" or \"help\".\nTo exit, send an empty line or write \"0\", \"e\", \"q\", \"quit\" or \"exit\".\n", m.returnHelpMessage());
    }
}