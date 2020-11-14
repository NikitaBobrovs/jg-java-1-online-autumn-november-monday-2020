package students.jekaterina_aleksejeva.lesson_2.level_1.task_2;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter double 1: ");
        double doubleOne = scanner.nextDouble();

        System.out.println("Enter double 2: ");
        double doubleTwo = scanner.nextDouble();

        double sum = doubleOne + doubleTwo;
        System.out.println("Sum of doubles: " + sum);

        double subtraction = doubleOne - doubleTwo;
        System.out.println("Subtraction of doubles: " + subtraction);

        double multiplication = doubleOne * doubleTwo;
        System.out.println("Multiplication of doubles: " + multiplication);

        double division = doubleOne / doubleTwo;
        System.out.println("Division of doubles: " + division);

    }
}
