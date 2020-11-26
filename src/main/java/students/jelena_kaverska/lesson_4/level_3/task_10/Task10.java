package students.jelena_kaverska.lesson_4.level_3.task_10;

import java.util.Scanner;

class Task10 {

    int getMaxNumber(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    int getMaxNumber(int a, int b, int c) {
        return getMaxNumber(getMaxNumber(a, b), c);
    }
}

class Task10Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int first = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int second = scanner.nextInt();
        System.out.print("Enter 3rd number: ");
        int third = scanner.nextInt();

        Task10 task10 = new Task10();
        System.out.println("Max number is: " + task10.getMaxNumber(first, second, third));
    }
}

class Task10Test {
    public static void main(String[] args) {
        scenario1();
        scenario2();
        scenario3();
    }

    static void scenario1() {
        String scenario = "10, 5, 9 -> 10 max";
        Task10 test1 = new Task10();
        int expected = 10;
        int actual = test1.getMaxNumber(10,5,9);
        if (expected == actual) {
            System.out.println("PASSED: " + scenario);
        }
        else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void scenario2() {
        String scenario = "10, 10, 10 -> 10 max";
        Task10 test1 = new Task10();
        int expected = 10;
        int actual = test1.getMaxNumber(10,10,10);
        if (expected == actual) {
            System.out.println("PASSED: " + scenario);
        }
        else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void scenario3() {
        String scenario = "8, 8, 2 -> 8 max";
        Task10 test1 = new Task10();
        int expected = 8;
        int actual = test1.getMaxNumber(8,8,2);
        if (expected == actual) {
            System.out.println("PASSED: " + scenario);
        }
        else {
            System.out.println("FAILED: " + scenario);
        }
    }
}