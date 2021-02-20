package students.viktors_cesnokovs.lesson_10.level_2.task_4;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    DayOfTheWeekDetector detector;
    Scanner scan = new Scanner(System.in);

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    void run() {
        System.out.println("Enter number between 1 and 7 : ");
        System.out.println(detector.detectDayName(scan.nextInt()));
    }

    public static void main(String[] args) {
        new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion()).run();
        new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion()).run();
    }
}
