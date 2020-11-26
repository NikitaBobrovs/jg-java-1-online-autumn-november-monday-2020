package students.polina_ivashkevich.lesson_4.level_2.task_5;

import java.util.Scanner;

public class TwoNum {
    public static void main(String[] args) {
        java.util.Scanner num1 = new Scanner(System.in);
        System.out.println("Enter first whole number");
        int n1 = num1.nextInt();


        java.util.Scanner num2 = new Scanner(System.in);
        System.out.println("Enter second whole number");
        int n2 = num2.nextInt();


        if (n1<n2) {
            System.out.println("The biggest number is "+n2);
        } if (n1>n2) {
            System.out.println("The biggest number is "+n1);
        }
    }
}
