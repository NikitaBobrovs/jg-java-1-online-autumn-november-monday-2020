package students.eugene_trambovich.lesson_2.level_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1st integer: ");
        double firstInteger = scanner.nextInt();

        System.out.println("Please enter 2nd integer: ");
        double secondInteger = scanner.nextInt();

        System.out.println("Please enter 3rd integer: ");
        double thirdInteger = scanner.nextInt();

        double average = ((firstInteger + secondInteger + thirdInteger) / 3);
        System.out.println(average);

    }
}

