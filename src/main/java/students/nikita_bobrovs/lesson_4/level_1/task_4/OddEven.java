package students.nikita_bobrovs.lesson_4.level_1.task_4;

import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        System.out.print("Enter your number : ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number % 2 == 0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
    }
}
