package students.jekaterina_aleksejeva.lesson_10.level_2.task_4_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    DayOfTheWeekDetector demo;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector demo) {
        this.demo = demo;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7: ");
        System.out.println("Thank you, your result:  " + demo.detectDayName(scanner.nextInt()));
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo ifVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        ifVersion.run();

        DayOfTheWeekDetectorDemo switchVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorViaSwitch());
        switchVersion.run();

        DayOfTheWeekDetectorDemo arrayVersion = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorViaArray());
        arrayVersion.run();

    }

}
