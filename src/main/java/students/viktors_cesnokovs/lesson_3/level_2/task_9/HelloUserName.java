package students.viktors_cesnokovs.lesson_3.level_2.task_9;

import java.util.Scanner;

public class HelloUserName {
    public static void main(String[] args) {
        System.out.println("Enter username: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello " + name + "!");


    }
}
