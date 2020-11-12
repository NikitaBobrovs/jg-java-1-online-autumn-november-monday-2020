package students.jekaterina_aleksejeva.lesson_2.level_1.task_1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer 1: ");
        int integerOne = scanner.nextInt();

        System.out.println("Enter integer 2: ");
        int integerTwo = scanner.nextInt();

        int sum = integerOne + integerTwo;
        System.out.println("SUM:" + sum);

        int subtraction = integerOne - integerTwo;
        System.out.println("SUBTRACTION:" + subtraction);

        int multiplication = integerOne * integerTwo;
        System.out.println("MULTIPLICATION:" + multiplication);

        int division = integerOne/integerTwo;
        System.out.println("DIVISION:" + division);

    }
}
