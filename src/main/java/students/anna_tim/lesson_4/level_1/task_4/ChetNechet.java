package students.anna_tim.lesson_4.level_1.task_4;

import java.util.Scanner;

public class ChetNechet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some number (should be int):");
        int number = scanner.nextInt();

        if (number == 0)
            System.out.println("It is zero");
        else if (number % 2 == 0)
            System.out.println("Chet");
        else
            System.out.println("Nechet");

    }
}
