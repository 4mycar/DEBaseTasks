package HomeWork;
import HomeWork.Randomizer;
import java.util.Scanner;

public class GuessANumber {

    Scanner input = new Scanner(System.in);
    String key;

    private void gameGuess (int minValueOfRange, int maxValueOfRange, int trys) {
        int inputedNumber;
        int unknownNumber = Randomizer.getRandomNumWithRange(minValueOfRange, maxValueOfRange);
        int oldRange = Math.abs(maxValueOfRange-minValueOfRange)/2;
        int newRange;


        System.out.println(String.format("Привет! я загадал число от %s до %s. У тебя есть %s попыток его отгадать",
                minValueOfRange, maxValueOfRange, trys) );

        do {
            System.out.print("Осталось " + trys + " попыток. Введи свое число:");
            inputedNumber = this.input.nextInt();
            trys--;
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

        } while (inputedNumber != unknownNumber && trys>0);

        if (trys == 0){
            System.out.println("Попытки исчерпаны, ты не угадал! Было загадано число = " + unknownNumber);
        }
    }

    public static void startGame () {
        Settings settings = new Settings();
        GuessANumber guessANumber = new GuessANumber();

        int minValueOfRange = settings.getGuessANumberRange()[0];
        int maxValueOfRange = settings.getGuessANumberRange()[1];
        int trys = settings.getGuessANumberTriesCount();
        boolean isRepeat = settings.isGuessANumberIsRepeat();

        do{
           guessANumber.gameGuess(minValueOfRange,maxValueOfRange,trys);

            if (isRepeat){
                System.out.println("Сыграем еще раз? y/n");
                guessANumber.key = guessANumber.input.next();
                isRepeat = !"n".equals(guessANumber.key);
            }

        }while (isRepeat);

        System.out.println("Пока-пока!");

        System.exit(0);
    }
}
