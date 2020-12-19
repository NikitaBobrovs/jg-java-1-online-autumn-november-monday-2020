package students.anna_tim.lesson_4.level_4.task_11;

import java.util.Scanner;

class Calculator {

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
}

class CalculatorDemo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number (should be integer):");
        int num1 = scanner.nextInt();
        System.out.println("Please enter second number (should be integer):");
        int num2 = scanner.nextInt();

        Calculator calculator = new Calculator();
        System.out.println("The sum of " + num1+ " and "+num2+" is " + calculator.sum(num1,num2));
        System.out.println("The subtraction of " + num1+ " and "+num2+" is " + calculator.subtraction(num1,num2));
        System.out.println("The division of " + num1+ " and "+num2+" is " + calculator.division(num1,num2));
        System.out.println("The multiplication of " + num1+ " and "+num2+" is " + calculator.multiplication(num1,num2));

    }
}

class CalculatorTest {
        public static void main(String[]args){
            scenario1();
            scenario2();
         }
        static void scenario1() {
            String scenario = " = 4 + 5";
            Calculator test1 = new Calculator();
            int number1 = 4;
            int number2 = 5;
            int expectedResult = 9;
            int actualResult = test1.sum(number1, number2);
            if (expectedResult == actualResult) {
                System.out.println("PASS " + actualResult + scenario);
            } else {
                System.out.println("FAIL " + actualResult+ scenario);
            }
        }
        static void scenario2() {
            Calculator test2 = new Calculator();
            String scenario = " = 4 - 5";
            int expectedResult = -1;
            int actualResult = test2.subtraction(4, 5);
            if (expectedResult == actualResult) {
                System.out.println("PASS " + actualResult+ scenario);
            } else {
                System.out.println("FAIL " + actualResult+ scenario);
            }
        }
}
