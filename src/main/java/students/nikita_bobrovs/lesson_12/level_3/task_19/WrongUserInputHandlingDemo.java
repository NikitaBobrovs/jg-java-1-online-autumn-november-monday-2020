package students.nikita_bobrovs.lesson_12.level_3.task_19;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WrongUserInputHandlingDemo {
    public static void main(String[] args) {
        boolean executed = false;

        System.out.println("Enter a number : ");
        while (!executed) {
            try {
                Scanner sc = new Scanner(System.in);
                int number = sc.nextInt();
                executed = true;
            } catch (InputMismatchException exception) {
                System.out.println("Invalid character. Please enter a number :");
            }
        }
    }
}
