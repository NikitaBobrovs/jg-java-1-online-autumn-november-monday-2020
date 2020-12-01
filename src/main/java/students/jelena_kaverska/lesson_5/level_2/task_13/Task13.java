package students.jelena_kaverska.lesson_5.level_2.task_13;

import java.util.Arrays;
import java.util.Random;

class Task13 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }

        System.out.println("My numbers: " + Arrays.toString(arr));

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Their sum: " + sum);
    }
}