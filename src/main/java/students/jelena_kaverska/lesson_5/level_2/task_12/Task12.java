package students.jelena_kaverska.lesson_5.level_2.task_12;

import java.util.Arrays;
import java.util.Random;

class Task12 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
            System.out.println(arr[i]);
        }
        System.out.println("One more time.. " + Arrays.toString(arr));
    }
}