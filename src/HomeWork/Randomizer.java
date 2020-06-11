package HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class Randomizer {


    public static int getRandomNumWithRange(int start, int end)
    {
        int range = Math.abs(end - start)+1;
        return (int) ((Math.random() * range) + (Math.min(start, end)) );

    }

    private static int[] fillArrayWithNumbers (int[] arr, int number){
        int i=0;
        int arrLength = arr.length;
        do{
            arr[i]=-1;
            i++;
        }while(i<arrLength);

        return arr;
    }

    private static int getIndexInArray (int[] arr, int num){ //возвращает индекс вхождения элемента в массив или -1 в случае отсутствия
        int result=-1;
        int arrLength = arr.length;
        int i=0;
        do{
            if (arr[i]==num){
                result=i;
                break;
            }
            i++;

        }while(i<arrLength);

        return  result;
    }

    public static void getRandomUniqueNum()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter start of range: ");
        int start = input.nextInt();
        System.out.println("Enter end of range: ");
        int end = input.nextInt();
        System.out.println("Your range is: " + start + " - " + end);
        String key;

        int range = Math.abs(end - start) + 1;
        int[] existingNumbers = fillArrayWithNumbers(new int[range], -1);
        int randNum = getRandomNumWithRange(start, end);
        boolean isUnique;
        int i=0;

        do {

            do {
                int indexInArr = getIndexInArray(existingNumbers, randNum);
                if (indexInArr!=-1) {
                    isUnique = false;
                    randNum = getRandomNumWithRange(start, end);
                } else {
                    existingNumbers[i]=randNum;
                    isUnique = true;
                    i++;
                }
            }while (!isUnique);

            System.out.println("Your rand num is: "+randNum);

            if (i == range) {
                System.out.println("There is no more unique numbers in this range");
                break;
            }

            System.out.println("Want to continue? - Press any key. Or press 'n' to exit ");
            key = input.next();

        }while (!"n".equals(key));

        System.out.println("Bye-Bye :)");
        System.exit(0);
    }

}
