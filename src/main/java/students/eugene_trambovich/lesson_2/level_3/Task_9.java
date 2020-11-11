package students.eugene_trambovich.lesson_2.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {

        System.out.println("Please enter integer: ");
        Scanner scanner = new Scanner(System.in);
        int enteredInteger = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(enteredInteger + " x " + i + " = " + (enteredInteger * i));
        }
    }
}
