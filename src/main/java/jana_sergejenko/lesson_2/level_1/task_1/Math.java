package jana_sergejenko.lesson_2.level_1.task_1;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {

        System.out.println("Enter first number:");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();

        int addition=firstNumber+secondNumber;
        int subtraction=firstNumber-secondNumber;
        int multiplication=firstNumber*secondNumber;
        int division=firstNumber/secondNumber;

        System.out.println(firstNumber+"+"+secondNumber+"="+addition);
        System.out.println(firstNumber+"-"+secondNumber+"="+subtraction);
        System.out.println(firstNumber+"*"+secondNumber+"="+multiplication);
        System.out.println(firstNumber+"/"+secondNumber+"="+division);
    }
}

