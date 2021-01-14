package students.nikita_bobrovs.lesson_10.level_2.task_4;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    DayOfTheWeekDetector detector;
    Scanner scanner = new Scanner(System.in);

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    void run() {
        System.out.print("Enter a number between 1 and 7 : ");
        System.out.println(detector.detectDayName(scanner.nextInt()));
    }

    public static void main(String[] args) {
        new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion()).run();

        new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion()).run();

        new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion()).run();
    }
}
