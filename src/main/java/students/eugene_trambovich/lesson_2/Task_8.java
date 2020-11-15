package students.eugene_trambovich.lesson_2;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {

        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}
