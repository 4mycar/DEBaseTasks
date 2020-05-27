package BaseTasks;

public class Condition {

    private static boolean isEven (double x){
        return x % 2 == 0;
    }

    public static double getExpByEven (double a, double b) {
        double result;

        if (isEven(a)) {
            result = a * b;
        } else {
            result = a + b;
        }

        return result;
    }


    public static String getQuarterNumByPoint (double x, double y) {
        String result;

        if (x > 0 && y > 0) {
            result = "1st Quarter";
        } else if (x < 0 && y > 0) {
            result = "2nd Quarter";
        } else if (x < 0 && y < 0) {
            result = "3rd Quarter";
        } else if (x > 0 && y < 0) {
            result = "4th Quarter";
        } else {
            result = "No Quarter";
        }

        return result;
    }


    public static Double getPositiveNumSumOfNumbers (double a, double b, double c) {
        Double result = 0.0;

        if (a > 0)
            result = result + a;
        if (b > 0)
            result = result + b;
        if (c > 0)
            result = result + c;

        return result;
    }


    public static Double getMaxValue (double a, double b, double c) {

        Double result;

        if (a * b * c > a + b + c)
            result = a * b * c + 3;
        else
            result = a + b + c + 3;

        return result;
    }


    private static boolean isBetween (double x, double lower, double upper) {
        return lower <= x && x <= upper;
    }


    public static String getMarkUsingRating (double rating) {
        String result;

        if (isBetween(rating,0,19))
            result = "F";
        else  if (isBetween(rating,20,39))
            result = "E";
        else  if (isBetween(rating,40,59))
            result = "D";
        else  if (isBetween(rating,60,74))
            result = "C";
        else  if (isBetween(rating,75,89))
            result = "B";
        else  if (isBetween(rating,90,100))
            result = "A";
        else
            result = "Rating is out of range";

        return result;
    }
}
