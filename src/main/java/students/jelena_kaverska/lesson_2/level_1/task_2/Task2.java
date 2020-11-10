package students.jelena_kaverska.lesson_2.level_1.task_2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter two real numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st: ");
        double first = scanner.nextDouble();
        System.out.print("Enter 2nd: ");
        double second = scanner.nextDouble();
        System.out.println("Sum: " + (first+second));
        System.out.println("Subtraction: " + (first-second));
        System.out.println("Multiplication: " + (first*second));
        System.out.println("Division: " + (first/second));
    }
}