package students.viktors_cesnokovs.lesson_4.level_3.task_10;

import java.util.Scanner;

public class Numbers {
    int maxNumber( int a, int b) {
        if ( a > b ){ return a; } return b; }
    int maxNumber ( int a, int b, int c ) { return maxNumber (maxNumber(a, b), c);  }
}




class NumbersDemo{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = scan.nextInt();
        System.out.println("Enter second number : ");
        int b = scan.nextInt();
        System.out.println("Enter third number : ");
        int c = scan.nextInt();

        Numbers numbers = new Numbers();
        System.out.println("The biggest  number is : " + numbers.maxNumber( a, b, c));
    }
}