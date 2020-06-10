package HomeWork;
import HomeWork.Randomizer;
import java.util.Scanner;

public class GuessANumber {
    public static void startGame () {

        int inputedNumber;
        int trysCount = 5;
        int unknownNumber = Randomizer.getRandomNumWithRange(0,100);
        int oldRange = 50;
        int newRange;

        Scanner input = new Scanner(System.in);
        System.out.println("Привет! я загадал число от 0 до 100. У тебя есть 5 попыток его отгадать");

        do {
            System.out.print("Осталось " + trysCount + " попыток. Введи свое число:");
            inputedNumber = input.nextInt();
            trysCount--;
            newRange = Math.abs(unknownNumber-inputedNumber);

            if(inputedNumber==unknownNumber){
                System.out.println("Ты угадал! Это число = " + unknownNumber);
            }
            else if (newRange > oldRange) {
                System.out.println("Холоднее");
            }
            else if (newRange < oldRange) {
                System.out.println("Теплее");
            }

            oldRange=newRange;

        } while (inputedNumber != unknownNumber && trysCount>0);

        if (trysCount == 0){
            System.out.println("Попытки исчерпаны, ты не угадал! Было загадано число = " + unknownNumber);
        }
        System.exit(0);
    }
}
