package students.jana_sergejenko.lesson_10.level_2.task_4_5;

public class DayofTheWeekDetectorArray implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        String week_days[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday", "Sunday",};
        if (number >= 1 && number <= 7) {
            return week_days[number-1];
        }
        return "Please input a valid number between 1 and 7";
    }

    public static void main(String[] args) {
        DayofTheWeekDetectorArray test = new DayofTheWeekDetectorArray();
        System.out.println(test.detectDayName(6));
    }
}

