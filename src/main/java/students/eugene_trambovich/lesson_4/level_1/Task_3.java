package students.eugene_trambovich.lesson_4.level_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        System.out.println("Enter integer from 1 to 7: ");
        Scanner scanner = new Scanner(System.in);
        int enteredInteger = scanner.nextInt();

        if (enteredInteger == 1) {
            System.out.println("Monday");

        } else if (enteredInteger == 2)
            System.out.println("Tuesday");
        else if (enteredInteger == 3) {
            System.out.println("Wednesday");
        } else if (enteredInteger == 4) {
            System.out.println("Tuesday");
        } else if (enteredInteger == 5) {
            System.out.println("Friday");
        } else if (enteredInteger == 6) {
            System.out.println("Saturday");
        } else if (enteredInteger == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid integer, please enter from 1 to 7 included");
        }
    }
}
