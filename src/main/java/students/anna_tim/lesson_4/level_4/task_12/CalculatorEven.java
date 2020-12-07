package students.anna_tim.lesson_4.level_4.task_12;

import java.util.Scanner;

public class CalculatorEven {

    int sum(int a, int b) {
        return a + b;
    }

    int subtraction(int a, int b) {
        return a - b;
    }

    int division(int a, int b) {
        return a / b;
    }

    int multiplication(int a, int b) {
        return a * b;
    }

    boolean even(int a) {
        return a%2 == 0;
    }
}

class CalculatorEvenDemo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number (should be integer):");
        int num1 = scanner.nextInt();
        System.out.println("Please enter second number (should be integer):");
        int num2 = scanner.nextInt();

        CalculatorEven calculator = new CalculatorEven();
        System.out.println("The sum of " + num1+ " and "+num2+" is " + calculator.sum(num1,num2));
        System.out.println("The subtraction of " + num1+ " and "+num2+" is " + calculator.subtraction(num1,num2));
        System.out.println("The division of " + num1+ " and "+num2+" is " + calculator.division(num1,num2));
        System.out.println("The multiplication of " + num1+ " and "+num2+" is " + calculator.multiplication(num1,num2));
        if (calculator.even(num1))
           System.out.println("The number "+num1+" is even");
        else
            System.out.println("The number "+num1+" is odd");
    }
}

class CalculatorEvenTest {
    public static void main(String[]args){
        CalculatorEvenTest calculatorEvenTest = new CalculatorEvenTest();
        calculatorEvenTest.sumTest();
        calculatorEvenTest.subtractionTest();
        calculatorEvenTest.evenTest();

    }

    static void sumTest() {
        System.out.println("--- Sum Scenario: 4 + 5 = 9 ---");
        int number1 = 4;
        int number2 = 5;
        int expectedResult = 9;
        CalculatorEven test1 = new CalculatorEven();
        int actualResult = test1.sum(number1, number2);
        if (expectedResult == actualResult) {
            System.out.println("PASS: " + actualResult);
        } else {
            System.out.println("FAIL: " + actualResult);
        }
    }

    static void subtractionTest() {
        System.out.println("--- Subtraction Scenario: 4 - 5 = -1 ---");
        int number1 = 4;
        int number2 = 5;
        int expectedResult = -1;
        CalculatorEven test2 = new CalculatorEven();
        int actualResult = test2.subtraction(number1, number2);
        if (expectedResult == actualResult) {
            System.out.println("PASS: " + actualResult);
        } else {
            System.out.println("FAIL: " + actualResult);
        }
    }

    //тут у меня почему-то IDEA ругается.. static member ... accessed via instance reference
    //это что значит?
    static void evenTest() {
        System.out.println("--- Scenario Chet/Nechet: 5 nechetnoe chislo ---");
        int number1 = 5;
        boolean expectedResult = false;
        CalculatorEven test3 = new CalculatorEven();
        boolean actualResult = test3.even(number1);
        if (expectedResult == actualResult) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
