package students.jekaterina_aleksejeva.lesson_5.level_4.task_30;

import java.util.Arrays;
import java.util.Random;

public class Task30 {
    public static void main(String[] args) {
        int[] number = new int[7];
        Random random = new Random();
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(9);
        }
        System.out.println("Your random array is printed: ");
        System.out.println(Arrays.toString(number));

        System.out.println("Odd numbers of your array: ");
        for (int i : number) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}


