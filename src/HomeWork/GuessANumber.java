package HomeWork;
import HomeWork.Randomizer;
import java.util.Scanner;

public class GuessANumber {

    private static void gameGuess (int minValueOfRange, int maxValueOfRange, int trys) {
        int inputedNumber;
        int trysCount = trys;
        int unknownNumber = Randomizer.getRandomNumWithRange(minValueOfRange, maxValueOfRange);
        int oldRange = Math.abs(maxValueOfRange-minValueOfRange)/2;
        int newRange;

        Scanner input = new Scanner(System.in);
        System.out.println("Привет! я загадал число от "+minValueOfRange+" до "+maxValueOfRange+
                ". У тебя есть "+trys+" попыток его отгадать");

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
    }

    public static void startGame () {

        int minValueOfRange = 0;
        int maxValueOfRange = 149;
        int trys = 5;

        gameGuess(minValueOfRange,maxValueOfRange,trys);

        Scanner input = new Scanner(System.in);
        String key;
        do{
            System.out.println("Сыграем еще раз? y/n");
            key = input.next();
            if(!"n".equals(key)){
                gameGuess(minValueOfRange,maxValueOfRange,trys);
            }
        }while (!"n".equals(key));

        System.out.println("Пока-пока!");

        System.exit(0);
    }
}
