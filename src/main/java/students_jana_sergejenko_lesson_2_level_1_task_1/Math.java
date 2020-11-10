package students_jana_sergejenko_lesson_2_level_1_task_1;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        int addition, subtraction,multiplication,division;

        System.out.println("Enter first number:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();

        addition=firstNumber+secondNumber;
        subtraction=firstNumber-secondNumber;
        multiplication=firstNumber*secondNumber;
        division=firstNumber/secondNumber;

        System.out.println(firstNumber+"+"+secondNumber+"="+addition);
        System.out.println(firstNumber+"-"+secondNumber+"="+subtraction);
        System.out.println(firstNumber+"*"+secondNumber+"="+multiplication);
        System.out.println(firstNumber+"/"+secondNumber+"="+division);
    }
}
