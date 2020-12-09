package students.polina_ivashkevich.lesson_4.level_4.task_14;

import java.util.Scanner;

public class Calculator {
    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println("Biggest number is:"+ firstNumber);
            return firstNumber;

        } if (firstNumber < secondNumber) {
            System.out.println("Biggest number is:" + secondNumber);
            return secondNumber;
        }else{
            System.out.println("Two numbers are equal");
            return firstNumber;
        }


    }


}

