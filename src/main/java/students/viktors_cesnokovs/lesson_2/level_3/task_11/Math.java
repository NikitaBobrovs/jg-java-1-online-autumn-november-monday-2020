package students.viktors_cesnokovs.lesson_2.level_3.task_11;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First number :");
        double a = scan.nextDouble();

        System.out.println("Second number :");
        double b = scan.nextDouble();

        System.out.println("Third number :");
        double c = scan.nextDouble();

        System.out.println("Averege of three numbers is: "+(a+b+c)/3);

    }
}
