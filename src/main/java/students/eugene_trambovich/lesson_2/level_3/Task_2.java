package students.eugene_trambovich.lesson_2.level_3;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        System.out.println("Please enter 1st double: ");
        Scanner scanner = new Scanner(System.in);
        double firstDouble = scanner.nextDouble();

        System.out.println("Please enter 2nd double: ");
        double secondDouble = scanner.nextDouble();

        double addition = firstDouble + secondDouble;
        double subtraction = firstDouble - secondDouble;
        double multiplication = firstDouble * secondDouble;
        double division = firstDouble / secondDouble;

        System.out.println("Addition result is: " + addition);
        System.out.println("Subtraction result is: " + subtraction);
        System.out.println("Multiplication result is: " + multiplication);
        System.out.println("Division result is: " + division);

    }
}
