package Tests;

import BaseTasks.MyArray;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayTest {
    private int[] array = {9, 2, 7, 3, 1, 2, 5, 4, 6};

    @Test
    public void getMinElementInArray() {
        assertEquals(1, MyArray.getMinElementInArray(array));
    }

    @Test
    public void getMaxElementInArray() {
        assertEquals(9, MyArray.getMaxElementInArray(array));
    }

    @Test
    public void getIndexOfMinElementInArray() {
        assertEquals(4, MyArray.getIndexOfMinElementInArray(array));
    }

    @Test
    public void getSumOfOddIndexesInArray() {
        //2+3+2+4=11
        assertEquals(11, MyArray.getSumOfOddIndexesInArray(array));
    }

    @Test
    public void getCountOfOddNumsInArray() {
        assertEquals(5, MyArray.getCountOfOddNumsInArray(array));
    }

    @Test
    public void getMidReversedArray() {
        //{9, 2, 7, 3, 1, 2, 5, 4, 6} -> {2, 5, 4, 6, 1, 9, 2, 7, 3}
        assertArrayEquals(new int[]{2, 5, 4, 6, 1, 9, 2, 7, 3}, MyArray.getMidReversedArray(array));
    }

    @Test
    public void getReversedArray() {
        //{9, 2, 7, 3, 1, 2, 5, 4, 6} -> {6, 4, 5, 2, 1, 3, 7, 2, 9}
        assertArrayEquals(new int[]{6, 4, 5, 2, 1, 3, 7, 2, 9}, MyArray.getReversedArray(array));
    }

    @Test
    public void getSortedArrayWithBubble() {
        //{9, 2, 7, 3, 1, 2, 5, 4, 6} -> {1, 2, 2, 3, 4, 5, 6, 7, 9}
        assertArrayEquals(new int[]{1, 2, 2, 3, 4, 5, 6, 7, 9}, MyArray.getSortedArrayWithBubble(array));
    }

    @Test
    public void getSortedArrayWithSelect() {
        //{9, 2, 7, 3, 1, 2, 5, 4, 6} -> {1, 2, 2, 3, 4, 5, 6, 7, 9}
        assertArrayEquals(new int[]{1, 2, 2, 3, 4, 5, 6, 7, 9}, MyArray.getSortedArrayWithSelect(array));
    }

    @Test
    public void getSortedArrayWithInsertion() {
        //{9, 2, 7, 3, 1, 2, 5, 4, 6} -> {1, 2, 2, 3, 4, 5, 6, 7, 9}
        assertArrayEquals(new int[]{1, 2, 2, 3, 4, 5, 6, 7, 9}, MyArray.getSortedArrayWithInsertion(array));
    }
}