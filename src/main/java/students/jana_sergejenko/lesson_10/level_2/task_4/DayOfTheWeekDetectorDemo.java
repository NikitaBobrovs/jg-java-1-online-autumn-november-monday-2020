package students.jana_sergejenko.lesson_10.level_2.task_4;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    DayOfTheWeekDetector parameter;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector parameter) {
        this.parameter = parameter;
    }

    void run() {

        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number >= 1 && number <= 7) {
            System.out.println(parameter.detectDayName(number));
        } else {
            System.out.println("Please input a valid number between 1 and 7");
        }

    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo test = new DayOfTheWeekDetectorDemo(new DayofTheWeekDetectorArray());
        test.run();
        DayOfTheWeekDetectorDemo test2 = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        test.run();
        DayOfTheWeekDetectorDemo test3 = new DayOfTheWeekDetectorDemo(new DayofTheWeekDetectorSwitch());
        test3.run();
    }

}
