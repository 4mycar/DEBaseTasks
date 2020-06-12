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
}