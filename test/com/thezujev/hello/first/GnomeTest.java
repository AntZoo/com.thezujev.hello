package com.thezujev.hello.first;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zujevant on 24.5.2016.
 */
public class GnomeTest {

    private static Gnome gnome;

    @BeforeClass
    public static void OneTimeSetup() {
        gnome = new Gnome();
    }

    @Test
    public void getRandomNumber() throws Exception {
        assertEquals(gnome.randomNumber, gnome.getRandomNumber());
    }

    @Test
    public void getPredefinedRandomNumber() throws Exception {
        gnome.randomNumber = 55;
        assertEquals("My random number is 55.", gnome.tellRandomNumber());
        gnome.generateRandomNumber();
    }

    @Test
    public void greet() throws Exception {
        assertEquals("Hello World!", gnome.greet());
    }

    @Test
    public void tellRandomNumber() throws Exception {
        assertEquals("My random number is " + gnome.randomNumber + ".", gnome.tellRandomNumber());
    }

    @Test
    public void drawOneLevelChristmasTree() throws Exception {
        assertEquals("*\n*", gnome.drawChristmasTree(1));
    }

    @Test
    public void drawFiveLevelChristmasTree() throws Exception {
        assertEquals("    *\n   ***\n  *****\n *******\n*********\n    *", gnome.drawChristmasTree(5));
    }

    @Test
    public void drawZeroLevelChristmasTree() throws Exception {
        assertEquals("", gnome.drawChristmasTree(0));
    }

    @Test
    public void drawNegativeLevelChristmasTree() throws Exception {
        assertEquals("", gnome.drawChristmasTree(-1));
    }
}