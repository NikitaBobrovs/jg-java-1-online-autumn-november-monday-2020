package students.samir_ahadov.lesson_2.level_2.task_8;

import java.util.Scanner;

public class Username {
    public static void main(String[] args) {

        System.out.println("Please enter your name");

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        System.out.println("Hello" + username);
    }
}
