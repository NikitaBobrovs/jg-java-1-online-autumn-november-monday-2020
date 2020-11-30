package students.eugene_trambovich.lesson_4.level_2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        System.out.println("Enter the 1st integer: ");
        Scanner scanner = new Scanner(System.in);
        int firstInteger = scanner.nextInt();

        System.out.println("Enter the 2nd integer: ");
        int secondInteger = scanner.nextInt();

        if (firstInteger == secondInteger) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }

    }
}
