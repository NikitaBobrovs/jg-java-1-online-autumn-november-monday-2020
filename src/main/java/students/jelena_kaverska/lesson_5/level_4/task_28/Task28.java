package students.jelena_kaverska.lesson_5.level_4.task_28;

import java.util.Arrays;
import java.util.Random;

class Task28 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Min: " + new Task28().getMin(arr));
    }

    public int getMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}