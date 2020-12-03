package students.viktors_cesnokovs.lesson_4.level_3.task_8;

import java.util.Scanner;

public class Numbers {
    void equality( int a , int b , int c){
        if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if (a != b && b != c){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
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
        number.equality( a , b , c );
    }
}
