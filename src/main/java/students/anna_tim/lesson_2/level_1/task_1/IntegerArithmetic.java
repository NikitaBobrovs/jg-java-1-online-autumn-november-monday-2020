package students.anna_tim.lesson_2.level_1.task_1;

import java.util.Scanner;

public class IntegerArithmetic {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number (should be integer)");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter the second number (should be integer)");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        //не уверена в том, что тут должен быть тип int - хочется float
        int division = firstNumber / secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiplication);
        System.out.println(firstNumber + " / " + secondNumber + " = " + division);

        scanner.close();
    }
}
