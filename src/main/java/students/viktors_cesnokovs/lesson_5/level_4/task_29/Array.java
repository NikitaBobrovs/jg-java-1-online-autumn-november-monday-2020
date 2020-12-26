package students.viktors_cesnokovs.lesson_5.level_4.task_29;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
        System.out.println("Array numbers : ");
        for (int result : arr) {
            System.out.println(result);
        }
        System.out.println("Array even numbers : ");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        //task 30
        System.out.println("Array odd numbers : ");
        for (int i : arr) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
