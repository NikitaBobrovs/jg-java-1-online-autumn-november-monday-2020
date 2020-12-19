package students.jelena_kaverska.lesson_5.level_4.task_29;

import java.util.Arrays;
import java.util.Random;

class Task29 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("All numbers: " + Arrays.toString(arr));
        Task29 task = new Task29();
        System.out.print("Even only: ");
        task.evenOnly(arr);
        System.out.println();
        System.out.print("Even only #2: ");
        task.evenOnly2(arr);
    }

    public void evenOnly(int[] array) {
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(" " + num);
            }
        }
    }

    public void evenOnly2(int[] array) {
        Arrays.stream(array)
                .filter(num -> num % 2 == 0)
                .forEach(num -> System.out.print(" " + num));
    }
}