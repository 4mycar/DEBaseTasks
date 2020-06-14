import BaseTasks.MyArray;

public class Main {

    public static void main(String[] args) {
       // System.out.println(Cycle.reverseDightsInNumber(825794));
//        GuessANumber.startGame();
        int[] array = {9, 2, 7, 3, 1, 2, 5, 4, 6};
        System.out.println(java.util.Arrays.toString(array));
        MyArray.getSortedArrayWithInsertion(array);
        System.out.println(java.util.Arrays.toString(array));
    }
}
