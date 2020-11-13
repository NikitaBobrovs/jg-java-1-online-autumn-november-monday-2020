package students.jekaterina_aleksejeva.lesson_2.level_3.task10;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        System.out.println("Test Data:");
        System.out.println("Enter cycle radius: ");
        Scanner scanner = new Scanner (System.in);
        double radius = scanner.nextDouble();
        System.out.println("Output:");
        double perimeter = 2*Math.PI*radius;
        System.out.println("Perimeter is =" + perimeter);
        double area = Math.PI*(radius*radius);
        System.out.println("Area is =" + area);
    }
}
