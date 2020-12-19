package students.eugene_trambovich.lesson_2;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {

        System.out.println("Please enter your cycle radius: ");
        Scanner scanner =new Scanner(System.in);
        double radius = scanner.nextDouble();

        double perimetr = radius * 2 * 3.1415;
        double square = 3.1415 * (radius * radius);
        System.out.println(square);
    }
}
