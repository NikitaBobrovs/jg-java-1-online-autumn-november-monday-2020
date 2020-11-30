package students.eugene_trambovich.lesson_4.level_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        System.out.println("Enter 1st integer: ");
        Scanner scanner = new Scanner(System.in);
        int firstInteger = scanner.nextInt();

        System.out.println("Enter 2nd integer: ");
        int secondInteger = scanner.nextInt();

        if (firstInteger < secondInteger) {
            System.out.println(firstInteger + " is the smallest from entered integers");
        } else if (secondInteger < firstInteger) {
            System.out.println(secondInteger + " is the smallest from entered integers ");
        }

    }
}
