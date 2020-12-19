package students.samir_ahadov.lesson_2.level_1;

import java.util.Scanner;

public class NumbersTaks2 {public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter first number");
    double firstDoubleNumber = scanner.nextDouble();

    System.out.println("Enter second number");
    double secondDoubleNumber = scanner.nextDouble();

    System.out.println("Addition = " + (firstDoubleNumber + secondDoubleNumber));
    System.out.println("Subtraction = " + (firstDoubleNumber - secondDoubleNumber));
    System.out.println("Division = " + (firstDoubleNumber / secondDoubleNumber));
    System.out.println("Multiplication = " + (firstDoubleNumber * secondDoubleNumber));
}
}
