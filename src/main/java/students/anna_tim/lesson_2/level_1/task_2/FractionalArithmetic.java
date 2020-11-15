package students.anna_tim.lesson_2.level_1.task_2;

import java.util.Scanner;

public class FractionalArithmetic {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the first number (should be fractional number)");
            double firstDoubleNumber = scanner.nextDouble();
            System.out.println("Please enter the second number (should be fractional number)");
            double secondDoubleNumber = scanner.nextDouble();

            double sum = firstDoubleNumber + secondDoubleNumber;
            double difference = firstDoubleNumber - secondDoubleNumber;
            double multiplication = firstDoubleNumber * secondDoubleNumber;
            double division = firstDoubleNumber / secondDoubleNumber;

            System.out.println(firstDoubleNumber + " + " + secondDoubleNumber + " = " + sum);
            System.out.println(firstDoubleNumber + " - " + secondDoubleNumber + " = " + difference);
            System.out.println(firstDoubleNumber + " * " + secondDoubleNumber + " = " + multiplication);
            System.out.println(firstDoubleNumber + " / " + secondDoubleNumber + " = " + division);

            scanner.close();
        }
}
