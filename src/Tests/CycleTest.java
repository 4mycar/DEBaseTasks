package Tests;

import BaseTasks.Condition;
import BaseTasks.Cycle;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CycleTest {

    @Test
    public void getCountAndSumEvenNumsByRange() {
        assertEquals("Range from 1 to 99 has 49 even nums, sum is 2450", Cycle.getCountAndSumEvenNumsByRange(1,99));
    }

    @Test
    public void isPrimeNum() {
        assertTrue(Cycle.isPrimeNum(5));
        assertTrue(Cycle.isPrimeNum(1));
        assertFalse(Cycle.isPrimeNum(96));
    }

    @Test
    public void getSqrtByNumber() {
        assertEquals(12, Cycle.getSqrtByNumber(144));
        assertEquals(13, Cycle.getSqrtByNumber(170));

    }

    @Test
    public void getFactorialByNumber() {
        assertEquals(720, Cycle.getFactorialByNumber(6));
        assertEquals(1, Cycle.getFactorialByNumber(0));

    }

    @Test
    public void getSumOfDightsByNumber() {
        assertEquals(13, Cycle.getSumOfDightsByNumber(3217));
        assertEquals(5, Cycle.getSumOfDightsByNumber(5));

    }

    @Test
    public void reverseDightsInNumber() {
        assertEquals(497528, Cycle.reverseDightsInNumber(825794));
        assertEquals(-497528, Cycle.reverseDightsInNumber(-825794));
        assertEquals(7, Cycle.reverseDightsInNumber(7));

    }
}