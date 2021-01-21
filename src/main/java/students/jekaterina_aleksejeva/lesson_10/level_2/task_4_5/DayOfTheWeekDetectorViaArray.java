package students.jekaterina_aleksejeva.lesson_10.level_2.task_4_5;

class DayOfTheWeekDetectorViaArray implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        String[] dayName = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (number >=1 && number <= 7) {
            return dayName[number-1];
        }
        return "Please input a valid number between 1 and 7";
    }

}

class DayOfTheWeekDetectorViaArrayDemo{
    public static void main(String[] args) {
        DayOfTheWeekDetector demo = new DayOfTheWeekDetectorViaArray();
        System.out.println("Week day Nr 1 is " + demo.detectDayName(1));
        System.out.println("Week day Nr 2 is " + demo.detectDayName(2));
        System.out.println("Week day Nr 3 is " + demo.detectDayName(3));
        System.out.println("Week day Nr 4 is " + demo.detectDayName(4));
        System.out.println("Week day Nr 5 is " + demo.detectDayName(5));
        System.out.println("Week day Nr 6 is " + demo.detectDayName(6));
        System.out.println("Week day Nr 7 is " + demo.detectDayName(7));
        System.out.println("No week day Nr 0: " + demo.detectDayName(0));

    }
}
