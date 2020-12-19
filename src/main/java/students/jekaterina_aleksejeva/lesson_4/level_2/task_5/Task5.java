package students.jekaterina_aleksejeva.lesson_4.level_2.task_5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter integer 1: ");
        int integer1 = scanner.nextInt();
        System.out.println("Enter integer 2: ");
        int integer2 = scanner.nextInt();

        if (integer1 > integer2) {
            System.out.println(integer1 + " is greater");
        }
        else if (integer2 > integer1) {
            System.out.println(integer2 + " is greater");
        }
        else {
            System.out.println("Both integers are equal");
        }
    }
}
