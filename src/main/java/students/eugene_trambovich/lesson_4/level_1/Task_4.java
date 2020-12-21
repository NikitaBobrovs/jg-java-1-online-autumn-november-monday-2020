package students.eugene_trambovich.lesson_4.level_1;

import java.util.Scanner;

public class Task_4 {

    public static void main(String[] args) {

        System.out.println("Enter any integer: ");
        Scanner scanner = new Scanner(System.in);
        int enteredInteger = scanner.nextInt();

        if (enteredInteger % 2 == 0) {
            System.out.println(enteredInteger + " is even number");
        } else {
            System.out.println(enteredInteger + " is odd");
        }
    }
}
