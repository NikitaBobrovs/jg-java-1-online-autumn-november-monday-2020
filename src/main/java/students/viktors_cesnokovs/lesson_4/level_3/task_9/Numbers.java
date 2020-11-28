package students.viktors_cesnokovs.lesson_4.level_3.task_9;

import java.util.Scanner;

public class Numbers {
    void order( int a , int b , int c ) {
        if (a < b && b < c) {
            System.out.println("Increasing order");
        } else if (a > b && b > c) {
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}


class NumbersDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = scan.nextInt();
        System.out.println("Enter second number : ");
        int b = scan.nextInt();
        System.out.println("Enter third number : ");
        int c = scan.nextInt();

        Numbers number = new Numbers();
        number.order( a , b , c );
    }
}