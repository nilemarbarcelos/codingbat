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
        assertEquals(3, warmup.sumDouble(1, 2));
        assertEquals(5, warmup.sumDouble(3, 2));
        assertEquals(8, warmup.sumDouble(2, 2));
    }

    @Test
    public void diff21() {
        assertEquals(2, warmup.diff21(19));
        assertEquals(11, warmup.diff21(10));
        assertEquals(0, warmup.diff21(21));
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

    @Test
    public void nearHundred() {
        assertTrue(warmup.nearHundred(93));
        assertTrue(warmup.nearHundred(90));
        assertFalse(warmup.nearHundred(89));
    }

    @Test
    public void posNeg() {
        assertTrue(warmup.posNeg(1, -1, false));
        assertTrue(warmup.posNeg(-1, 1, false));
        assertTrue(warmup.posNeg(-4, -5, true));
    }

    @Test
    public void notString() {
        assertEquals("not candy", warmup.notString("candy"));
        assertEquals("not x", warmup.notString("x"));
        assertEquals("not bad", warmup.notString("not bad"));
    }

    @Test
    public void missingChar() {
        assertEquals("ktten", warmup.missingChar("kitten", 1));
        assertEquals("itten", warmup.missingChar("kitten", 0));
        assertEquals("kittn", warmup.missingChar("kitten", 4));
    }

    @Test
    public void frontBack() {
        assertEquals("eodc", warmup.frontBack("code"));
        assertEquals("a", warmup.frontBack("a"));
        assertEquals("ab", warmup.frontBack("ba"));
    }

    @Test
    public void front3() {
        assertEquals("JavJavJav", warmup.front3("Java"));
        assertEquals("ChoChoCho", warmup.front3("Chocolate"));
        assertEquals("abcabcabc", warmup.front3("abc"));
    }

    @Test
    public void backAround() {
        assertEquals("tcatt", warmup.backAround("cat"));
        assertEquals("oHelloo", warmup.backAround("Hello"));
        assertEquals("aaa", warmup.backAround("a"));
    }

    @Test
    public void or35() {
        assertTrue(warmup.or35(3));
        assertTrue(warmup.or35(10));
        assertFalse(warmup.or35(8));
    }

    @Test
    public void front22() {
        assertEquals("kikittenki", warmup.front22("kitten"));
        assertEquals("HaHaHa", warmup.front22("Ha"));
        assertEquals("ababcab", warmup.front22("abc"));
    }

    @Test
    public void startHi() {
        assertTrue(warmup.startHi("hi there"));
        assertTrue(warmup.startHi("hi"));
        assertFalse(warmup.startHi("hello hi"));
    }

    @Test
    public void icyHot() {
        assertTrue(warmup.icyHot(120, -1));
        assertTrue(warmup.icyHot(-1, 120));
        assertFalse(warmup.icyHot(2, 120));
    }

    @Test
    public void in1020() {
        assertTrue(warmup.in1020(12, 99));
        assertTrue(warmup.in1020(21, 12));
        assertFalse(warmup.in1020(8, 99));
    }

    @Test
    public void hasTeen() {
        assertTrue(warmup.hasTeen(13, 20, 10));
        assertTrue(warmup.hasTeen(20, 19, 10));
        assertTrue(warmup.hasTeen(20, 10, 13));
    }

    @Test
    public void loneTeen() {
        assertTrue(warmup.loneTeen(13, 99));
        assertTrue(warmup.loneTeen(21, 19));
        assertFalse(warmup.loneTeen(13, 13));
    }

    @Test
    public void delDel() {
        assertEquals("abc", warmup.delDel("adelbc"));
        assertEquals("aHello", warmup.delDel("adelHello"));
        assertEquals("adedbc", warmup.delDel("adedbc"));
    }
}
