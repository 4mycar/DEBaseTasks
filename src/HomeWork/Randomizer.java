package HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class Randomizer {

    public static int getRandomNumWithRange(int start, int end)
    {
        int range = Math.abs(end - start)+1;
        return (int) ((Math.random() * range) + (start <= end ? start : end) ); //здесь защита от того что начало диапазона будет больше конца

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
        ArrayList<Integer> existingNumbers = new ArrayList<>();
        int range = Math.abs(end - start) + 1;
        int randNum = Randomizer.getRandomNumWithRange(start, end);
        boolean isUnique;

        do {
            do {
                if (existingNumbers.contains(randNum)) {
                    isUnique = false;
                    randNum = getRandomNumWithRange(start, end);
                } else {
                    existingNumbers.add(randNum);
                    isUnique = true;
                }
            }while (!isUnique);

            System.out.println("Your rand num is: "+randNum);

            if (existingNumbers.size() == range) {
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
