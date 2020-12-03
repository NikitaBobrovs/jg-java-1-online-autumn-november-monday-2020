package students.jana_sergejenko.lesson_4.level_7.task_23;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    return true;
                else
                    return false;
            }
            else
                return true;
        }

        else
            return false;
    }
}
