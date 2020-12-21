package students.polina_ivashkevich.lesson_4.level_4.task_15;


import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.test1();
    }


        void test1(){

            java.util.Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number:");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter secondNumber number");
            int secondNumber = scanner.nextInt();
            System.out.println("Enter third number");
            int thirdNumber = scanner.nextInt();

            Calculator calculator = new Calculator();
            calculator.compare(4,5,2);
        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println("Ok " + firstNumber);
        }
        if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            System.out.println("Ok" + secondNumber);
        }
        if ((thirdNumber > firstNumber) && (thirdNumber > secondNumber)) {
            System.out.println("Ok " + thirdNumber);
        }
        if ((firstNumber == secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println("Ok");
        }
        if ((firstNumber == secondNumber) && (secondNumber == thirdNumber)) {
            System.out.println("Ok");

        }else {
            System.out.println("Other");
        }

    }
}
