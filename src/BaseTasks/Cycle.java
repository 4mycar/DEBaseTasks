package BaseTasks;

public class Cycle {


    public static String getCountAndSumEvenNumsByRange (int first, int last){

        int sum = 0;
        int count = 0;
        int i= (first %2 ==0) ? first : first+1;

        for (; i <= last; i+=2){
                sum = sum + i;
                count = count + 1;
        }

        return String.format("Range from %d to %s has %d even nums, sum is %d", first, last, count, sum);
        //Возвращаем строку,  а не объект с полями для упрощения. Можно переписать на объект или Map
    }

    public static boolean isPrimeNum (int num){

        int divider = 2;

        while (divider*divider <= num & num % divider != 0){
            divider++;
        }
        return num % divider != 0;

    }

    public static int getSqrtByNumber (int num){
        if (num<0){
            throw new IllegalArgumentException("Number must be > 0");}

        double sqrt = num * 0.5;
        float err = 0.1f;

        while (sqrt - num / sqrt > err) {
                sqrt = (sqrt + num / sqrt) / 2;
            }

        return (int) sqrt;
    }

    public static int getFactorialByNumber (int num) {
        if (num<0){
            throw new IllegalArgumentException("Number must be > 0");
        }

        int result=1;

        while (num>=2){
            result = result*num;
            num--;
        }

        return result;
    }

    public static int getSumOfDightsByNumber (int num) {
        int result = 0;

        while(num != 0){
            result += (num % 10);
            num/=10;
        }

        return  result;
    }

    public static int reverseDightsInNumber (int num) {
        int result=0 ;

        while(num != 0){
            result = result * 10 + (num % 10);
            num/=10;
        }

        return  result;
    }

}
