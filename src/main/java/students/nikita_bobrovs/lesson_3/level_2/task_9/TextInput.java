package students.nikita_bobrovs.lesson_3.level_2.task_9;

import java.util.Scanner;

public class TextInput {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello "+userName);
    }
}
