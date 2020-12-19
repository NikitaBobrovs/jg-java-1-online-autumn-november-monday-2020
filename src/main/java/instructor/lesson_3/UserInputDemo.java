package instructor.lesson_3;

import java.util.Scanner;

public class UserInputDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String text = scanner.nextLine();

        System.out.println("Your name is: " + text);

        scanner.close();
    }
}
