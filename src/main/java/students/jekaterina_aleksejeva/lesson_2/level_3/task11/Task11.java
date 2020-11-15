package students.jekaterina_aleksejeva.lesson_2.level_3.task11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer 1: ");
        int integer1 = scanner.nextInt();
        System.out.println("Enter integer 2: ");
        int integer2 = scanner.nextInt();
        System.out.println("Enter integer 3: ");
        int integer3 = scanner.nextInt();
        System.out.println("Average:" + (float)(integer1+integer2+integer3)/3);
    }
}
