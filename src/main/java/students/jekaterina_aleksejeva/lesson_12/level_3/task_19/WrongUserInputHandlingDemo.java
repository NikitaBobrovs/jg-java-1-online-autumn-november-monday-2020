package students.jekaterina_aleksejeva.lesson_12.level_3.task_19;

import java.util.InputMismatchException;
import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) {

        System.out.println("Enter integer: ");
        boolean correctInput = false;

        while(!correctInput){
            try{
                Scanner scanner = new Scanner(System.in);
                int integer = scanner.nextInt();
                correctInput = true;
            } catch (InputMismatchException ex) {
                System.out.println("Incorrect input, please enter integer");

            }
        }
    }
}
