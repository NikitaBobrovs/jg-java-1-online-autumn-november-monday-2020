package students.viktors_cesnokovs.lesson_5.level_2.task_14;

import java.util.Random;

public class Numbers4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[3];
        int sum = 0;

        number[0] = random.nextInt();
        number[1] = random.nextInt();
        number[2] = random.nextInt();

        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        int average = sum / number.length;
        System.out.println("Array average : " + average);
    }
}