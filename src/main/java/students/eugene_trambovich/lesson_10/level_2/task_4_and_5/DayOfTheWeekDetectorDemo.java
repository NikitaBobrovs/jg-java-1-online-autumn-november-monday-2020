package students.eugene_trambovich.lesson_10.level_2.task_4_and_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    Scanner scanner = new Scanner(System.in);

    void run() {
        System.out.print("Enter number from 1-7: ");
        System.out.println("It's: " + dayOfTheWeekDetector.detectDayName(scanner.nextInt()));
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion()).run();
        new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion()).run();
        new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion()).run();
    }
}
