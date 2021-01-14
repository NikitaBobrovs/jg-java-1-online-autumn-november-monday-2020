package students.jelena_kaverska.lesson_10.level_2.task_4_5;

class DayOfTheWeekDetectorStringArrayVersion implements DayOfTheWeekDetector {
    private final String[] week = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    @Override
    public String detectDayName(int number) {
        if (number <= 7 && number > 0) {
            return week[number - 1];
        }
        return "Please input a valid number between 1 and 7";
    }

}

class MyDemo {

    public static void main(String[] args) {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetectorStringArrayVersion();
        System.out.println(dayOfTheWeekDetector.detectDayName(1));
        System.out.println(dayOfTheWeekDetector.detectDayName(7));
        System.out.println(dayOfTheWeekDetector.detectDayName(3));
        System.out.println(dayOfTheWeekDetector.detectDayName(8));
        System.out.println(dayOfTheWeekDetector.detectDayName(0));
        System.out.println(dayOfTheWeekDetector.detectDayName(-1));
    }
}