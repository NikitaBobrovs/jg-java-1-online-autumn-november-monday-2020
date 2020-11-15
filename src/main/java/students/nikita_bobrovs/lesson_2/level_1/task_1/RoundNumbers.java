package students.nikita_bobrovs.lesson_2.level_1.task_1;

import java.util.Scanner;

public class RoundNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number ");
        int a = scanner.nextInt();

        System.out.println("Enter second number ");
        int b = scanner.nextInt();

        System.out.println("Results of basic mathematical operations with entered numbers are following:");

        int addition = a+b;
        System.out.println("Addition = "+ addition);

        int subtraction = a-b;
        System.out.println("Subtraction ="+ subtraction);

        int multiplication = a*b;
        System.out.println("Multiplication ="+ multiplication);

        int division = a/b;
        System.out.println("Division ="+ division);
    }
}
