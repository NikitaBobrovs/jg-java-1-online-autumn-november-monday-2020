package students.jelena_kaverska.lesson_6.level_3.task_15;

import java.util.Arrays;

class ArrayService {

    boolean replaceFirst(int[] arr, int target, int replacement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                arr[i] = replacement;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] arr, int target, int replacement) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                arr[i] = replacement;
                count++;
            }
        }
        return count;
    }
}

class MyArrDemo {

    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();

        int[] arr = {8, 1, 2, 3, 8, 5, 6, 8};
        System.out.println("initial: " + Arrays.toString(arr));

        System.out.println("Replacement count: " + arrayService.replaceAll(arr, 8, 11));
        System.out.println("all updated: " + Arrays.toString(arr));

        int[] arr2 = {88, 7, 0, 6, 0, 5};
        arrayService.replaceFirst(arr2, 0, 11);
        System.out.println("first only: " + Arrays.toString(arr2));
    }
}