package students.viktors_cesnokovs.lesson_5.level_4.task_25;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of the array : ");
        int[] array = new int[scan.nextInt()];

        System.out.println("Enter " + array.length + " numbers of your array. ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Array numbers : ");
        for (int result : array) {
            System.out.println(result);
        }
    }
}
