package students.anna_tim.lesson_2.level_3.task_11;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 numbers (should be integer). Press <enter> button after entering the number:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        float sum =  firstNumber + secondNumber + thirdNumber; //или double??

        //тут тоже просится цикл, правда, я не умею их использовать :))))
        //System.out.println((float)sum/count);
        System.out.println("Sum = " + (sum));
        System.out.println("Average = " + (sum/3));
    }
}
