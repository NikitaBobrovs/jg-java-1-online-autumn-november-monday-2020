package students.polina_ivashkevich.lesson_4.level_1.task_2;

import java.util.Scanner;

public class WNumber {
    public static void main(String[] args) {
        java.util.Scanner number = new Scanner(System.in);
        System.out.println("Enter a whole number ");

        int wholeNum = number.nextInt();
        System.out.println("Whole Number is :" + wholeNum);

        if (wholeNum < 0) {
            System.out.println("Whole number is a negative");
        }
        if (wholeNum == 0) {
            System.out.println("Whole number is equal to 0");

        } else {
            System.out.println("Whole number is a positive");
        }
    }
}