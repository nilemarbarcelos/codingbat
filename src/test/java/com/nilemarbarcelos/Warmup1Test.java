package com.nilemarbarcelos;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class Warmup1Test {

    private static Warmup1 warmup;

    @BeforeClass
    public static void setup() {
        warmup = new Warmup1();
    }

    @Test
    public void sleepIn() {
        assertTrue(warmup.sleepIn(false, false));
        assertFalse(warmup.sleepIn(true, false));
        assertTrue(warmup.sleepIn(false, true));
    }

    @Test
    public void monkeyTrouble() {
        assertTrue(warmup.monkeyTrouble(true, true));
        assertTrue(warmup.monkeyTrouble(false, false));
        assertFalse(warmup.monkeyTrouble(true, false));
    }

    @Test
    public void sumDouble() {
        assertEquals(warmup.sumDouble(1, 2), 3);
        assertEquals(warmup.sumDouble(3, 2), 5);
        assertEquals(warmup.sumDouble(2, 2), 8);
    }

    @Test
    public void diff21() {
        assertEquals(warmup.diff21(19), 2);
        assertEquals(warmup.diff21(10), 11);
        assertEquals(warmup.diff21(21), 0);
    }

    @Test
    public void parrotTrouble() {
        assertTrue(warmup.parrotTrouble(true, 6));
        assertFalse(warmup.parrotTrouble(true, 7));
        assertFalse(warmup.parrotTrouble(false, 6));
    }

    @Test
    public void makes10() {
        assertTrue(warmup.makes10(9, 10));
        assertFalse(warmup.makes10(9, 9));
        assertTrue(warmup.makes10(1, 9));
    }
}
