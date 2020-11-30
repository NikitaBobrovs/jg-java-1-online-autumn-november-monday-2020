package students.eugene_trambovich.lesson_4.level_3;

import java.util.Scanner;

public class Task_9 {

    public static void main(String[] args) {

        System.out.println("Enter the 1st integer: ");
        Scanner scanner = new Scanner(System.in);
        int firstInteger = scanner.nextInt();

        System.out.println("Enter the 2nd integer: ");
        int secondInteger = scanner.nextInt();

        System.out.println("Enter the 3rd integer: ");
        int thirdInteger = scanner.nextInt();


        if (firstInteger < secondInteger && secondInteger < thirdInteger) {
            System.out.println("increasing");

        } else if (firstInteger > secondInteger && secondInteger > thirdInteger) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }

    }
}


