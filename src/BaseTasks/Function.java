package BaseTasks;

import java.time.DateTimeException;
import java.time.DayOfWeek;

public class Function {
    public static String getWeekDayNameByNum(int dayOfWeek) {
        String dayName="";

        try{
            dayName = DayOfWeek.of(dayOfWeek).toString();
        }
        catch (Exception exception) {
            if (exception instanceof DateTimeException) {
                System.err.print("Это DateTimeException ");
                dayName = "Invalid value for DayOfWeek: " + dayOfWeek;
            } else {
                System.err.print("Это какая-то непонтная ошибка ");
                System.err.print(exception.getMessage());
                dayName = "Invalid value for DayOfWeek: " + dayOfWeek;
            }
        }

        return dayName;
    }

    public static double getDistanceBetweenPoints(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

}
