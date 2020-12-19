package students.samir_ahadov.lesson_2.level_1;

import java.util.Scanner;

public class NumbersTask1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();

        System.out.println("Addition = " + (firstNumber + secondNumber));
        System.out.println("Subtraction = " + (firstNumber - secondNumber));
        System.out.println("Division = " + (firstNumber / secondNumber));
        System.out.println("Multiplication = " + (firstNumber * secondNumber));
        
    }
}