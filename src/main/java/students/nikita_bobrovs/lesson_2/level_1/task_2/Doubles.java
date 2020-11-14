package students.nikita_bobrovs.lesson_2.level_1.task_2;

import java.util.Scanner;

public class Doubles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first decimal number : ");
        double a = scan.nextDouble();
        System.out.println("Enter second decimal number : ");
        double b = scan.nextDouble();
        double addition = a+b;
        double subtraction = a-b;
        double multiplication = a*b;
        double division = a/b;
        System.out.println("Addition = "+ addition);
        System.out.println("Subtraction = "+ subtraction);
        System.out.println("Multiplication = "+ multiplication);
        System.out.println("Division = "+ division);
    }
}
