package students.jekaterina_aleksejeva.lesson_5.level_2.task_13;

import java.util.Arrays;
import java.util.Random;

class Task13 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt();
        }
        System.out.println("3 random numbers: " + Arrays.toString(number));

        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        System.out.println("3 random numbers SUM = " + sum);

    }
}
