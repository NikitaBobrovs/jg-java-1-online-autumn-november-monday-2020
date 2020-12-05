package students.jekaterina_aleksejeva.lesson_5.level_2.task_11;

import java.util.Arrays;
import java.util.Scanner;

class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter 3 numbers: ");

        int[] number = new int[3];
        number[0] = scanner.nextInt();
        number[1] = scanner.nextInt();
        number[2] = scanner.nextInt();

        System.out.println(Arrays.toString(number));

    }
}
