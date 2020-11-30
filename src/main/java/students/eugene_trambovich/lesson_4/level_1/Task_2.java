package students.eugene_trambovich.lesson_4.level_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        System.out.println("Please enter any integer: ");
        Scanner scanner = new Scanner(System.in);
        int enteredInteger = scanner.nextInt();

        if (enteredInteger > 0) {
            System.out.println("Entered integer is positive");
        } else if (enteredInteger < 0) {
            System.out.println("Entered integer is negative");

        } else {
            System.out.println("Entered integer is equal to \"0\"");
        }
    }
}
