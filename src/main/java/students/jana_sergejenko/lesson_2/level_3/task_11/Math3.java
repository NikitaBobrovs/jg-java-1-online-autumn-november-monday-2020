package students.jana_sergejenko.lesson_2.level_3.task_11;

import java.util.Scanner;

public class Math3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter second number");
        double seсondNumber = scanner.nextDouble();
        System.out.println("Enter third number");
        double thirdNumber = scanner.nextDouble();
        double result=((firstNumber+seсondNumber+thirdNumber)/3);
        System.out.println(result);
    }
}

