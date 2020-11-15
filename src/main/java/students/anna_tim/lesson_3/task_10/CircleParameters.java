package students.anna_tim.lesson_3.task_10;

import java.util.Scanner;

public class CircleParameters {

    public static void main(String[] args) {
        final double PI = 3.141592653589793238;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter circle radius:");
        double rad = scanner.nextDouble();

        System.out.println("Circumference of the circle is " + 2 * PI * rad);
        System.out.println("Area of the circle is " + PI * Math.pow(rad,2));

        scanner.close();
    }
}
