package students.polina_ivashkevich.lesson_4.level_1.task_4;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        java.util.Scanner num = new Scanner(System.in);
        System.out.println("Enter whole number");

        int number = num.nextInt();
        System.out.println("Whole number is ");

        int t = number;

        if (t%2==0) {
            System.out.println("Whole number is positive");
        }
        if (t%2!=0) {
            System.out.println("Whole number is negative");
        }
    }
}
