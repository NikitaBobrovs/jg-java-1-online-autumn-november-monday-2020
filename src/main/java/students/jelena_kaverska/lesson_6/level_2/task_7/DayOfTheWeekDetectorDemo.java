package students.jelena_kaverska.lesson_6.level_2.task_7;

class DayOfTheWeekDetectorDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector dayDetector = new DayOfTheWeekDetector();
        int dayNumber = dayDetector.getDayNumberFromUser();
        String dayOfWeek = dayDetector.findDayOfTheWeek(dayNumber);
        System.out.println(dayOfWeek);
    }
}