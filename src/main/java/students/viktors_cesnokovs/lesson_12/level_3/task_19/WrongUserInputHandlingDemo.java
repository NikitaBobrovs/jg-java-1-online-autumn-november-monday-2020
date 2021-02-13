package students.viktors_cesnokovs.lesson_12.level_3.task_19;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) {

        boolean approved = false;
        System.out.println("Enter a number : ");
        while (!approved) {
            try {
                Scanner scanner = new Scanner(System.in);
                int num = scanner.nextInt();
                approved = true;
            } catch (InputMismatchException e) {
                System.out.println("Input invalid. Enter a number : ");
            }
        }
    }
}
