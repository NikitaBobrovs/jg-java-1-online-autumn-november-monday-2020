package students.jelena_kaverska.lesson_5.level_4.task_27;

import java.util.Arrays;
import java.util.Random;

class Task27 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Max: " + new Task27().getMax(arr));
        System.out.println("Max #2: " + new Task27().getMax2(arr));

    }

    public int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public int getMax2(int[] array) {
        return Arrays.stream(array)
                .max()
                .getAsInt();
    }
}