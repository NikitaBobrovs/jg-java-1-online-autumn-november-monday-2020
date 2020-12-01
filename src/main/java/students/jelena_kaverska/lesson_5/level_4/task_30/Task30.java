package students.jelena_kaverska.lesson_5.level_4.task_30;

import java.util.Arrays;
import java.util.Random;

class Task30 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("All numbers: " + Arrays.toString(arr));
        Task30 task = new Task30();
        System.out.print("Odd only: ");
        task.oddOnly(arr);
        System.out.println();
        System.out.print("Odd only #2: ");
        task.oddOnly2(arr);
    }

    public void oddOnly(int[] array) {
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(" " + num);
            }
        }
    }

    public void oddOnly2(int[] array) {
        Arrays.stream(array)
                .filter(num -> num % 2 != 0)
                .forEach(num -> System.out.print(" " + num));
    }
}