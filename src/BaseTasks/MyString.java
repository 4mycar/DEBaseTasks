package BaseTasks;

import java.util.Arrays;

import static java.lang.String.*;

public class MyString {

    public MyString(){
//        Вывести в одну строку символы:
//        1. английского алфавита от ‘A’ до ‘Z’
//        2. английского алфавита от ‘z’ до ‘a’
//        3. русского алфавита от ‘а’ до ‘я’
//        4. цифры от ‘0’ до ‘9’
//        5. печатного диапазона таблицы ASCII
        System.out.println(getASCIICharsWithRange('A','Z'));
        System.out.println(getASCIICharsWithRange('z','a'));
        System.out.println(getASCIICharsWithRange('а','я'));
        System.out.println(getASCIICharsWithRange('0','9'));
        System.out.println(getASCIICharsWithRange(' ','~'));
//        2. Написать и протестировать функции преобразования:
//          ● целого числа в строку
        String str1 = Integer.toString(123);
//          ● вещественного числа в строку
        String str2 = Double.toString(1.23);
//          ● строки в целое число
        int i1 = Integer.parseInt("123");
//          ● строки в вещественное число
        double d1 = Double.parseDouble("1.23");
//        3. Написать и протестировать функции работы со строками:
//          ● Дана строка, состоящая из слов, разделенных пробелами и знаками препинания.
//          Определить длину самого короткого слова.
        String testStr = "Перевернуть$ строку, т.е. посл%едние ^ символы должны стать первыми,а первые -последними";
        getShortestWordLength(testStr);
//          ● Дан массив слов. Заменить последние три символа слов, имеющих заданную
//        длину на символ
        String[] testStrArr = testStr.split(" ");
        System.out.println(Arrays.toString(replaceLast3Char (testStrArr,6)));
//          ● Добавить в строку пробелы после знаков препинания, если они там отсутствуют.
        System.out.println(formatStringWithSpaces(testStr));
//          ● Оставить в строке только один экземпляр каждого встречающегося символа.
        System.out.println(removeDoubledCharsFromString(testStr));
//          ● Подсчитать количество слов во введенной пользователем строке.
        System.out.println(getCountOfWordsInString(testStr));
//          ● Удалить из строки ее часть с заданной позиции и заданной длины.
        System.out.println(deletePartOfString(testStr, 10,15));
//          ● Перевернуть строку, т.е. последние символы должны стать первыми, а первые
//                 последними.
        System.out.println(reverseString("яибофобия - боязнь палиндромов"));
//          ● В заданной строке удалить последнее слово
        System.out.println(deleteLastWordFromString(testStr));

    }

    public static String getASCIICharsWithRange (char from, char to) {
        StringBuilder sb = new StringBuilder();
        if (from<=to) {
            for (char i = from; i <= to; i++) {
                sb.append(i);
            }
        } else {
            for (char i = from; i >= to; i--) {
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public static int getShortestWordLength(String str) {

        str=str.replaceAll("[,-./$%:;<=>?^!]","").replaceAll("  "," ");
        String[] words = str.split(" ");
        int len = words[0].length();
        int n = words.length;
        for (int i = 1; i < n; i++) {
            if ( words[i].length() < len) {
                len = words[i].length();
            }
        }
        return len;
    }

    public static String[] replaceLast3Char(String[] words, int len) {
        int n = words.length;
        for (int i = 0; i < n; i++) {
            if (words[i].length() == len) {
                words[i] = words[i].substring(0, len - 3) + '$';
            }
        }
        return words;
    }

    public static String formatStringWithSpaces(String str) {
        int n = str.length();
        for (int i = 0; i < n - 1; i++) {
            char chr = str.charAt(i);
            if (((chr < '0' && chr >= '!') || (chr < 'A' && chr > '9'))&&(str.charAt(i + 1) != ' ')) {
                str = str.replace(Character.toString(chr), (chr + " "));
            }
        }
        return str;
    }

    public static String removeDoubledCharsFromString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        int n = str.length();
        for (int i = 1; i < n; i++) {
            char chr = str.charAt(i);
            if (sb.indexOf(valueOf(chr)) ==-1){
                sb.append(chr);
            }
        }
        return sb.toString();
    }

    public static int getCountOfWordsInString(String str) {
        str=str.replaceAll("[,-./$%:;<=>?^!]","").replaceAll("  "," ");
        String[] words = str.split(" ");
        return words.length;
    }

    public static String deletePartOfString(String str, int start, int length) {
        return str.replace(str.substring(start, (start + length)), "");
    }

    public static String reverseString(String str) {
        return new StringBuilder().append(str).reverse().toString();
    }

    public static String deleteLastWordFromString(String str) {
        int n = str.length();
        for (int i = n - 2; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                n=i;
                break;
            }
        }
        return str.substring(0, n);
    }


}
