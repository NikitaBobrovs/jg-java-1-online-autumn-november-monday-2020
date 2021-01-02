package students.viktors_cesnokovs.lesson_5.level_4.task_26;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of the array : ");
        int[] arr = new int[scan.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt();
        }
        System.out.println("Array numbers : ");
        for (int result : arr) {
            System.out.println(result);
        }
    }
}
