package students.nikita_bobrovs.lesson_5.level_4.task_27;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] array = new int[8];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(51);  // numbers from 0 to 50
        }
        System.out.println("Array numbers are :");
        for (int print1 : array) {
            System.out.println(print1);
        }
        //task 27
        System.out.println("Array max number is  " + Arrays.stream(array).max().getAsInt());

        //task 28
        System.out.println("Array min number is " + Arrays.stream(array).min().getAsInt());

        //task 29
        System.out.println("Array even numbers are :");
        for (int i : array) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //task 30
        System.out.println("Array odd numbers are :");
        for (int i : array) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
