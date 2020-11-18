package students.darja_fedosova.lessons_2.level_7.task_32;

import java.util.Scanner;

public class Task_32 {

        public static void main(String[] args){
            Scanner calc = new Scanner(System.in);
            //  Вводим первое значение целого числа
            System.out.println("Enter first number: ");
            int firstNumber = calc.nextInt();
            // Вводим второе значение целого числа
            System.out.println("Enter second number: ");
            int secondNumber = calc.nextInt();
            /* Выводи на экран сумму , раздность, деление и умножение этих чисел
            ( необходимо помнить когла пишешь коментарии больше чем на ордну стороку , необходимо закрыть комментарии либо нажав enter
            или поставить специальне знаки )))))
             */
            System.out.println(" Addition = " + (firstNumber + secondNumber));
            System.out.println(" Subtraction = " + (firstNumber - secondNumber));
            System.out.println(" Multiplication = " + (firstNumber * secondNumber));
            System.out.println(" Division = " + (firstNumber / secondNumber));
        }
    }

