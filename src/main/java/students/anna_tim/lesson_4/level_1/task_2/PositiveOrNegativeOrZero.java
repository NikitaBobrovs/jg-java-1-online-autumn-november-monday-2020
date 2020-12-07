package students.anna_tim.lesson_4.level_1.task_2;

import java.util.Scanner;

class PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some number (should be int):");
        int number = scanner.nextInt();

        if (number > 0)
            System.out.println("The number is positive.");
        else if (number < 0)
            System.out.println("The number is negative.");
        else
            System.out.println("It is zero.");

    }
}