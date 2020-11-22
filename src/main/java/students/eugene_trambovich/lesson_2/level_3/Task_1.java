package students.eugene_trambovich.lesson_2.level_3;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st integer: ");
        int firstInteger = scanner.nextInt();

        System.out.println("Enter 2nd integer: ");
        int secondInteger = scanner.nextInt();

        int addition = firstInteger + secondInteger;
        int subtraction = firstInteger - secondInteger;
        int multiplication = firstInteger * secondInteger;
        int division = firstInteger / secondInteger;

        System.out.println("Addition result is: " + addition);
        System.out.println("Subtraction result is: " + subtraction);
        System.out.println("Multiplication result is: " + multiplication);
        System.out.println("Division result is: " + division);
    }
}
