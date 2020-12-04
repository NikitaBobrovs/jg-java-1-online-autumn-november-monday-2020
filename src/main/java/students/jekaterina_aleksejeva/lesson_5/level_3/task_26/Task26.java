package students.jekaterina_aleksejeva.lesson_5.level_3.task_26;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = scanner.nextInt();
        int[] number = new int[length];

        Random random = new Random();
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt();
        }
        System.out.println("Your random array is printed: ");
        System.out.println(Arrays.toString(number));
    }
}
