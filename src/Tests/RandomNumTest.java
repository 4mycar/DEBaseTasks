package Tests;

import BaseTasks.Cycle;
import BaseTasks.RandomNum;
import org.junit.Test;

import static org.junit.Assert.*;

public class RandomNumTest {

    @Test //Вывести на консоль случайное число.
    public void get1RandomNum() {
        int r = RandomNum.getRandomNumsWithRange(1,1000,1)[0];
        boolean q = r >= 1 && r <= 1000;
        assertTrue(q);
    }

    @Test // Вывести на консоль 10 случайных чисел.
    public void get10RandomNums() {
        int[] r = RandomNum.getRandomNumsWithRange(1,1000,10);
        boolean q = r.length == 10;
        assertTrue(q);

    }

    @Test //Вывести на консоль 10 случайных чисел, каждое в диапазоне от 0 до 10.
    public void get10RandomNumsWithRange0_10() {
        int[] r = RandomNum.getRandomNumsWithRange(0,10,10);
        boolean q = r.length == 10;
        assertTrue(q);
        for (int elem:r) {
            q = elem >= 0 && elem <= 10;
            assertTrue(q);
        }
    }

    @Test //Вывести на консоль 10 случайных чисел, каждое в диапазоне от 20 до 50.
    public void get10RandomNumsWithRange20_50() {
        int[] r = RandomNum.getRandomNumsWithRange(20,50,10);
        boolean q = r.length == 10;
        assertTrue(q);
        for (int elem:r) {
            q = elem >= 20 && elem <= 50;
            assertTrue(q);
        }
    }

    @Test //Вывести на консоль 10 случайных чисел, каждое в диапазоне от -10 до 10.
    public void get10RandomNumsWithRange_minus10_10() {
        int[] r = RandomNum.getRandomNumsWithRange(-10,10,10);
        boolean q = r.length == 10;
        assertTrue(q);
        for (int elem:r) {
            q = elem >= -10 && elem <= 10;
            assertTrue(q);
        }
    }

    @Test //Вывести на консоль случайное количество (в диапазоне от 3 до 15) случайных чисел, каждое в диапазоне от -10 до 35.
    public void getRandCount_3_15_OfRandNumsWithRange_minus10_35() {
        int[] r = RandomNum.getRandomNumsWithRange(-10,35, RandomNum.getRandomNumsWithRange(3,15,1)[0]);
        boolean q = r.length >= 3 && r.length <= 15;
        assertTrue(q);
        for (int elem:r) {
            q = elem >= -10 && elem <= 35;
            assertTrue(q);
        }
    }
}