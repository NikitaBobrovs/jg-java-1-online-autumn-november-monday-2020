package students.jelena_kaverska.lesson_5.level_2.task_15;

import java.util.Random;

class Task15 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Random random = new Random();
        System.out.println("Initial numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.println(arr[i]);
        }
        System.out.println("Updated numbers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] * 2);
        }
    }
}