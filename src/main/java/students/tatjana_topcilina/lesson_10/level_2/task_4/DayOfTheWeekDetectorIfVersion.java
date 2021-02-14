package students.tatjana_topcilina.lesson_10.level_2.task_4;


class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector{

    @Override
    public String detectDayName(int number) {
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}
interface DayOfTheWeekDetector {
    String detectDayName(int number);
}


class DayOfTheWeekDetectorDemoVersion implements DayOfTheWeekDetector {
    private final String[] days = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday",
    };

    @Override
    public String detectDayName(int number) {
        if(number <=7 && number >=1) {
            return days[number - 1];
        }
        return "Input a valid number between 1 and 7";

    }
}


