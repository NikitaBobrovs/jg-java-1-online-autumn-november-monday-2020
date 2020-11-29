package students.polina_ivashkevich.lesson_4.level_4.task_11;

import java.util.Scanner;

public class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int subtraction (int firstNumber, int secondNumber){
        return  firstNumber - secondNumber;
    }
    public int multiplication (int firstNumber, int secondNumber){
        return  firstNumber * secondNumber;
    }
    public int division (int firstNumber , int secondNumber) {
        return  firstNumber / secondNumber;
    }
}










class Numbers {
    public static void main(String[] args) {
        java.util.Scanner  num = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = num.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = num.nextInt();

        Calculator calculator = new Calculator();
        System.out.println("sum:" + calculator.sum(firstNumber , secondNumber));
        System.out.println("subtraction: "+ calculator.subtraction(firstNumber , secondNumber));
        System.out.println("multiplication: "+ calculator.multiplication(firstNumber , secondNumber));
        System.out.println("division: "+ calculator.division(firstNumber , secondNumber));
        }
    }
