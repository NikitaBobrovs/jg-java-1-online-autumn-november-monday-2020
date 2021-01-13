package students.nikita_bobrovs.lesson_10.level_2.task_4;

class DayOfTheWeekDetectorArrayVersion implements DayOfTheWeekDetector {
    private final String[] days = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
    };

    @Override
    public String detectDayName(int number) {
        if (number <= 7 && number >= 1) {
            return days[number - 1];
        }
        return "Please input a valid number between 1 and 7";
    }
}
