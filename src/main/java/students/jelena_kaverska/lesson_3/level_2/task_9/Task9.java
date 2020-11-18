package students.jelena_kaverska.lesson_3.level_2.task_9;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String yourName = scanner.nextLine();
        System.out.println("Hello " + yourName +"!");
    }
}