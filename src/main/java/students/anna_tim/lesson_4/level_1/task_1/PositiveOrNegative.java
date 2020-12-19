package students.anna_tim.lesson_4.level_1.task_1;

import java.util.Scanner;

class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some number not equal to zero (should be int):");
        int number = scanner.nextInt();

        if (number > 0)
            System.out.println("The number is positive");
        else if (number < 0)
            System.out.println("The number is negative");
        else
            System.out.println("Please enter some number not equal to zero ;)");

    }
}

