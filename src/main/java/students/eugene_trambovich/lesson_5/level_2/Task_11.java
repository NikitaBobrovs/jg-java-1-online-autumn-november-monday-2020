package students.eugene_trambovich.lesson_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st integer");
        numbers[0] = scanner.nextInt();
        System.out.println("Enter 2nd integer");
        numbers[1] = scanner.nextInt();
        System.out.println("Enter 3rd integer");
        numbers[2] = scanner.nextInt();
        System.out.println(Arrays.toString(numbers));
    }
}
