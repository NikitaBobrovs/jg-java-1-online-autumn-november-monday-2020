package students.darja_fedosova.lessons_2.level_1.task_1;

import java.util.Scanner;
 public class Task_1 {
        public static void main(String[] args){
            Scanner calc = new Scanner(System.in);

            System.out.println("Enter first number: ");
            int firstNumber = calc.nextInt();

            System.out.println("Enter second number: ");
            int secondNumber = calc.nextInt();

            System.out.println(" Addition = " + (firstNumber + secondNumber));
            System.out.println(" Subtraction = " + (firstNumber - secondNumber));
            System.out.println(" Multiplication = " + (firstNumber * secondNumber));
            System.out.println(" Division = " + (firstNumber / secondNumber));
        }
    }

