package students.jekaterina_aleksejeva.lesson_4.level_1.task_4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int integer = scanner.nextInt();

        if (integer % 2 == 0) {
            System.out.println(integer + " is even");}
        else {
            System.out.println(integer + " is odd");}

    }
}
