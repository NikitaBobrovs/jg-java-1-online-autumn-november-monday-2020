package students.jana_sergejenko.lesson_10.level_2.task_4;

public class DayofTheWeekDetectorArray implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        String week_days[] = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        if (number >= 0 && number <= 6) {
            return week_days[number];
        }
        return "Please input a valid number between 1 and 7";
    }

    public static void main(String[] args) {
        DayofTheWeekDetectorArray test = new DayofTheWeekDetectorArray();
        System.out.println(test.detectDayName(6));
    }
}

