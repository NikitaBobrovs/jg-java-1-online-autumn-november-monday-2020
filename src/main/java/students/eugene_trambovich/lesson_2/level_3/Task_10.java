package students.eugene_trambovich.lesson_2.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        System.out.println("Please enter radius: ");
        Scanner scanner = new Scanner(System.in);
        double enteredRadius = scanner.nextDouble();

        double perimeter = 2 * 3.1415 * enteredRadius;     // Perimeter = 2pr
        double area = 3.1415 * Math.pow(enteredRadius, 2); // Area = pr(2)

        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is " + area);

    }
}
