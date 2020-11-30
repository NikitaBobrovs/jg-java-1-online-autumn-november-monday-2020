package students.eugene_trambovich.lesson_4.level_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {

        System.out.println("Enter the 1st integer: ");
        Scanner scanner = new Scanner(System.in);
        int firstInteger = scanner.nextInt();

        System.out.println("Enter the 2nd integer: ");
        int secondInteger = scanner.nextInt();

        System.out.println("Enter the 3rd integer: ");
        int thirdInteger = scanner.nextInt();


        if (firstInteger > secondInteger && firstInteger > thirdInteger) {
            System.out.println(firstInteger + " is the largest number");

        } else if (secondInteger > firstInteger && secondInteger > thirdInteger) {
            System.out.println(secondInteger + " is the largest number");
        } else if (thirdInteger > firstInteger && thirdInteger > secondInteger) {
            System.out.println(thirdInteger + " is the largest number");
        } else {
            System.out.println("Integers are equals");
        }
    }
}
