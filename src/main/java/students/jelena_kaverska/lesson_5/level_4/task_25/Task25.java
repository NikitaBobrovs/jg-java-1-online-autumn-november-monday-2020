package students.jelena_kaverska.lesson_5.level_4.task_25;

import java.util.Arrays;
import java.util.Scanner;

class Task25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input numbers limit: ");
        int limit = scanner.nextInt();
        int[] arr = new int[limit];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " number: ");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}