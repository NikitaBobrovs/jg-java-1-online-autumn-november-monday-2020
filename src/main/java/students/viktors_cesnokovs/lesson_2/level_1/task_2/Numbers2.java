package students.viktors_cesnokovs.lesson_2.level_1.task_2;

import java.util.Scanner;

public class Numbers2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First number :");
        double a = scan.nextDouble();
        System.out.println("Second number :");
        double b = scan.nextDouble();

        double plus = a+b;
        System.out.println("plus : "+ plus);

        double minus = a-b;
        System.out.println("minus : "+ minus);

        double delenie = a/b;
        System.out.println("delenie : "+ delenie);

        double umnozenie = a*b;
        System.out.println("umnozenie : "+ umnozenie);

    }
}
