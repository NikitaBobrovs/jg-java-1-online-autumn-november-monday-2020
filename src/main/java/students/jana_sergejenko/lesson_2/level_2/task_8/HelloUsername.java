package students.jana_sergejenko.lesson_2.level_2.task_8;

import java.util.Scanner;

public class HelloUsername {
    public static void main(String[] args) {
        System.out.println("Enter your username:");
        Scanner scanner= new Scanner(System.in);
        String username=scanner.nextLine();
        System.out.println("Hello "+username+"!");
    }
}

