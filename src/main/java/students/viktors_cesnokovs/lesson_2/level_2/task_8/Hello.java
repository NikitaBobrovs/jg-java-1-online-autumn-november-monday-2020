package students.viktors_cesnokovs.lesson_2.level_2.task_8;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Please enter your username:");
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        System.out.println("Hello "+username);

    }
}
