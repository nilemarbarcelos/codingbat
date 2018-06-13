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

    @Test
    public void mixStart() {
        assertTrue(warmup.mixStart("mix snacks"));
        assertTrue(warmup.mixStart("pix snacks"));
        assertFalse(warmup.mixStart("piz snacks"));
    }

    @Test
    public void startOz() {
        assertEquals("oz", warmup.startOz("ozymandias"));
        assertEquals("z", warmup.startOz("bzoo"));
        assertEquals("o", warmup.startOz("oxx"));
    }

    @Test
    public void intMax() {
        assertEquals(3, warmup.intMax(1, 2, 3));
        assertEquals(3, warmup.intMax(1, 3, 2));
        assertEquals(3, warmup.intMax(3, 2, 1));
    }

    @Test
    public void close10() {
        assertEquals(8, warmup.close10(8, 13));
        assertEquals(8, warmup.close10(13, 8));
        assertEquals(0, warmup.close10(13, 7));
    }

    @Test
    public void in3050() {
        assertTrue(warmup.in3050(30, 31));
        assertFalse(warmup.in3050(30, 41));
        assertTrue(warmup.in3050(40, 50));
    }

    @Test
    public void max1020() {
        assertEquals(19, warmup.max1020(11, 19));
        assertEquals(19, warmup.max1020(19, 11));
        assertEquals(11, warmup.max1020(11, 9));
    }

    @Test
    public void stringE() {
        assertTrue(warmup.stringE("Hello"));
        assertTrue(warmup.stringE("Heelle"));
        assertFalse(warmup.stringE("Heelele"));
    }

    @Test
    public void lastDigit() {
        assertTrue(warmup.lastDigit(7, 17));
        assertFalse(warmup.lastDigit(6, 17));
        assertTrue(warmup.lastDigit(3, 113));
    }

    @Test
    public void endUp() {
        assertEquals("HeLLO", warmup.endUp("Hello"));
        assertEquals("hi thERE", warmup.endUp("hi there"));
        assertEquals("HI", warmup.endUp("hi"));
    }

    @Test
    public void everyNth() {
        assertEquals("Mrce", warmup.everyNth("Miracle", 2));
        assertEquals("aceg", warmup.everyNth("abcdefg", 2));
        assertEquals("adg", warmup.everyNth("abcdefg", 3));
    }

}
