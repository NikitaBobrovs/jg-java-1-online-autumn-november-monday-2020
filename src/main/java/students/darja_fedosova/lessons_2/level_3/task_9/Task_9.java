package students.darja_fedosova.lessons_2.level_3.task_9;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number: ");
        int number = scanner.nextInt();

        for (int x = 1; x <= 10; x++) {
            System.out.println(number + "*" + x + "=" + (number * x));
        }
    }
}