package students.jekaterina_aleksejeva.lesson_4.level_2.task_7;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer 1: ");
        int integer1 = scanner.nextInt();
        System.out.println("Enter integer 2: ");
        int integer2 = scanner.nextInt();
        boolean equality = integer1 == integer2;

        if (equality) System.out.println("Numbers are equals");
        else System.out.println("Numbers are different");
    }
}
