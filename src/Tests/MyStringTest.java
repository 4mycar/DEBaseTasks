package Tests;

import BaseTasks.MyString;
import org.junit.Test;
import static BaseTasks.MyString.*;
import static org.junit.Assert.*;

public class MyStringTest {

    String testStr = "Перевернуть$ строку, т.е. посл%едние ^ символы должны стать первыми,а первые -последними";
    String[] testStrArr = testStr.split(" ");

    @Test
    public void getASCIICharsWithRange() {
        assertEquals("zyxwvutsrqponmlkjihgfedcba", MyString.getASCIICharsWithRange('z','a'));
        assertEquals("0123456789", MyString.getASCIICharsWithRange('0','9'));
    }

    @Test
    public void getShortestWordLength() {
        assertEquals(2, MyString.getShortestWordLength(testStr));
    }

    @Test
    public void replaceLast3Char() {
    assertArrayEquals(new String[]{"Перевернуть$", "строку,", "т.е.", "посл%едние", "^", "символы", "дол$",
        "стать", "первыми,а", "пер$", "-последними"}, MyString.replaceLast3Char (testStrArr,6));
    }

    @Test
    public void formatStringWithSpaces() {
        assertEquals("Перевернуть$ строку,  т. е.  посл% едние ^ символы должны стать первыми, а первые - последними",
                MyString.formatStringWithSpaces(testStr));
    }

    @Test
    public void removeDoubledCharsFromString() {
        assertEquals("Первнуть$ сок,.пл%ди^мыжа-",
                MyString.removeDoubledCharsFromString(testStr));
    }

    @Test
    public void getCountOfWordsInString() {
        assertEquals(10,
                MyString.getCountOfWordsInString(testStr));
    }

    @Test
    public void deletePartOfString() {
        assertEquals("Перевернут посл%едние ^ символы должны стать первыми,а первые -последними",
                MyString.deletePartOfString(testStr, 10,15));
    }

    @Test
    public void reverseString() {
        assertEquals("воморднилап ьнзяоб - яибофобия",
                MyString.reverseString("яибофобия - боязнь палиндромов"));
    }

    @Test
    public void deleteLastWordFromString() {
        assertEquals("Перевернуть$ строку, т.е. посл%едние ^ символы должны стать первыми,а первые",
                MyString.deleteLastWordFromString(testStr));
    }
}