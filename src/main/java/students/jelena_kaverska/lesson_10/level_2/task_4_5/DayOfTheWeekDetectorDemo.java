package students.jelena_kaverska.lesson_10.level_2.task_4_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {
    private final DayOfTheWeekDetector detector;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector detector) {
        this.detector = detector;
    }

    //создайте метод void run() в котором реализуйте саму программу
    void run() {
        print();
    }

    //вывести на консоль найденное название
    void print() {
        System.out.println(getDayOfTheWeek(getNumber()));
    }

    //запросить у пользователя число
    int getNumber() {
        System.out.print("Enter any number from 1 to 7: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    int myGetNumber() {
        System.out.print("Enter any number from 1 to 7: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while (number > 7 || number <= 0) {
            System.out.print("Please input a valid number between 1 and 7: ");
            number = scanner.nextInt();
        }
        return number;
    }

    //найти название дня недели
    String getDayOfTheWeek(int number) {
        return detector.detectDayName(number);
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo ifDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        ifDemo.run();

        DayOfTheWeekDetectorDemo switchDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        switchDemo.run();

        DayOfTheWeekDetectorDemo arrDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorStringArrayVersion());
        arrDemo.run();
    }
}