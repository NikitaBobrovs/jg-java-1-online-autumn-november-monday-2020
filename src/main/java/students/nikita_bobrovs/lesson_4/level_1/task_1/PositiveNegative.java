package students.nikita_bobrovs.lesson_4.level_1.task_1;

import java.util.Scanner;

class PositiveNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter round number : ");
        int number = scan.nextInt();

        if (number > 0)
            System.out.println("Number is Positive");
        else if (number<0)
            System.out.println("Number is Negative");
        else
            System.out.println("Number equals Zero");
    }
}
