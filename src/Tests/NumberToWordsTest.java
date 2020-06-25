package Tests;

import BaseTasks.MyArray;
import BaseTasks.NumberToWords;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberToWordsTest {

    @Test
    public void getWordsUsingNumber() {
        assertEquals("девятьсот четырнадцать миллиардов девяносто восемь миллионов четыреста тридцать девять тысяч пятьсот девятнадцать",
                NumberToWords.getWordsUsingNumber(914_098_439_519L));
        assertEquals("(минус) двести восемьдесят семь тысяч семьсот одиннадцать",
                        NumberToWords.getWordsUsingNumber(-287_711L));
        assertEquals("ноль",
                        NumberToWords.getWordsUsingNumber(0));
        assertEquals("один миллиард девяносто три миллиона четыреста две тысячи пятьсот восемьдесят один",
                NumberToWords.getWordsUsingNumber(1_093_402_581L));
    }
}