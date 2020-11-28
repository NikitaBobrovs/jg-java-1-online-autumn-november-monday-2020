package students.polina_ivashkevich.lesson_4.level_2.task_6;

import java.util.Scanner;

public class Thnum {
    public static void main(String[] args) {
        java.util.Scanner num1 = new Scanner(System.in);
        System.out.println("Enter first whole number ");
        int n1 = num1.nextInt();

        java.util.Scanner num2 = new Scanner(System.in);
        System.out.println("Enter first whole number ");
        int n2 = num1.nextInt();
        if (n1>n2) {
            System.out.println("The least number is "+n2);
        }if (n2>n1) {
            System.out.println("The least number is "+n1);
        }
    }
}
