package students.eugene_trambovich.lesson_10.level_2.task_4_and_5;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {

    String[] daysOfTheWeek = {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };

    @Override
    public String detectDayName(int number) {
        if (number >= 1 && number <= 7) {
            return daysOfTheWeek[number - 1];
        }
        return "Wrong number, please enter number from 1 to 7";
    }
}