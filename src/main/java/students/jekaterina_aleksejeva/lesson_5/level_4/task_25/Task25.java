package students.jekaterina_aleksejeva.lesson_5.level_4.task_25;

import java.util.Arrays;
import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = scanner.nextInt();
        int[] number = new int[length];

        System.out.println("Enter " + length + " array numbers: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }
            System.out.println("Your tailored array is printed: ");
            System.out.println(Arrays.toString(number));
        }
    }
