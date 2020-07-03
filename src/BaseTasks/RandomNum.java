package BaseTasks;

public class RandomNum {

    public RandomNum(){
        //Вывести на консоль случайное число.
        printArray(getRandomNumsWithRange(1,1000,1));
        // Вывести на консоль 10 случайных чисел.
        printArray(getRandomNumsWithRange(1,1000,10));
        //Вывести на консоль 10 случайных чисел, каждое в диапазоне от 0 до 10.
        printArray(getRandomNumsWithRange(0,10,10));
        //Вывести на консоль 10 случайных чисел, каждое в диапазоне от 20 до 50.
        printArray(getRandomNumsWithRange(20,50,10));
        //Вывести на консоль 10 случайных чисел, каждое в диапазоне от -10 до 10.
        printArray(getRandomNumsWithRange(-10,10,10));
        //Вывести на консоль случайное количество (в диапазоне от 3 до 15) случайных чисел, каждое в диапазоне от -10 до 35.
        printArray(getRandomNumsWithRange(-10,35, getRandomNumsWithRange(3,15,1)[0]));
    }

    public static int[] getRandomNumsWithRange(int start, int end, int countNums)
    {
        int [] arr = new int[countNums];
        for (int i=0; i<countNums; i++) {
            int range = Math.abs(end - start) + 1;
            arr[i] = (int) ((Math.random() * range) + (Math.min(start, end)));
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        if (arr.length ==0){
            System.out.println("Массив пуст");
            return;
        }
        for (int elem : arr) {
            System.out.print(elem+", ");
        }
        System.out.println("\n---------");
    }

}
