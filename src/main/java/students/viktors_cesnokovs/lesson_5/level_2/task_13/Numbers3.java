package students.viktors_cesnokovs.lesson_5.level_2.task_13;

import java.util.Random;

public class Numbers3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[3];

        number[0] = random.nextInt();
        number[1] = random.nextInt();
        number[2] = random.nextInt();

        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        System.out.println("Array sum= " + sum);
    }
}