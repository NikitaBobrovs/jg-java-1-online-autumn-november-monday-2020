package students.polina_ivashkevich.lesson_4.level_4.task_14;

import java.util.Scanner;

public class Calculator {
    public int  maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        }
        if (firstNumber < secondNumber) {
            return secondNumber;
        }
         else  {
             return firstNumber;
        }

    }

        public static void main (String[]args){
            java.util.Scanner max = new Scanner(System.in);
            System.out.println("Enter first number: ");
            int firstNumber =max.nextInt();
            System.out.println("Enter second number: ");
            int secondNumber=max.nextInt();


            Calculator calculator= new Calculator();
            if (firstNumber>secondNumber) {
                System.out.println("The biggest number is: "+firstNumber);
            } if (firstNumber<secondNumber) {
                System.out.println("The biggest number is:" +secondNumber);
            } else {
                System.out.println("Numbers are equals ");
            }
        }
    }

