package students.jana_sergejenko.lesson_3.level_2.task_9;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner username = new Scanner(System.in);
        System.out.println("Enter username:");
        String userName = username.nextLine();
        System.out.println("Hello "+userName+"!");
    }
}
