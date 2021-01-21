package students.jekaterina_aleksejeva.lesson_10.level_2.task_4_5;

class DayOfTheWeekDetectorViaSwitch implements DayOfTheWeekDetector {
    @Override
    public String detectDayName(int number) {
        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";

            default:
                return "Please input a valid number between 1 and 7";
        }
    }
}

class DayOfTheWeekDetectorViaSwitchDemo {
    public static void main(String[] args) {
        DayOfTheWeekDetector demo = new DayOfTheWeekDetectorViaSwitch();
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