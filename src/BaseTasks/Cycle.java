package BaseTasks;

public class Cycle {


    public static String getCountAndSumEvenNumsByRange (int first, int last){

        int sum = 0;
        int count = 0;

        for (int i = first; i <= last; i++){
            if (Condition.isEven(i)){
                sum = sum + i;
                count = count + 1;
            }
        }

        return String.format("Range from %d to %s has %d even nums, sum is %d", first, last, count, sum);
    }

    public static boolean isPrimeNum (int num){

        int divider = 2;

        while (divider*divider <= num & num % divider != 0){
            divider++;
        }
        System.out.println(divider);

        if (num % divider != 0){
            return true;
        }
        else {
            return false;
        }

    }

    public static int getSqrtByNumber (int num){

        int sqrt = 2;

        while (sqrt*sqrt < num){
            sqrt++;
            System.out.println(sqrt);
        }

        return sqrt;

    }

}
