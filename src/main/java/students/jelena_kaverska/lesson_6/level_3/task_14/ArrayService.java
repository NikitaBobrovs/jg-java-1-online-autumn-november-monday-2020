package students.jelena_kaverska.lesson_6.level_3.task_14;

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

    //my test-method
    void replaceFirst2(int[] arr, int target, int replacement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                arr[i] = replacement;
                break;
            }
        }
    }

    void replaceAll(int [] arr, int target, int replacement) {
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]==target) {
                arr[i] = replacement;
            }
        }
    }
}

class MyArrayServiceDemo {
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 3, 5, 6, 8};
        System.out.println("initial: " + Arrays.toString(arr));

        new ArrayService().replaceFirst(arr, 8, 10);
        System.out.println("print first: " + Arrays.toString(arr));

        int[] arr2 = {8, 1, 2, 3, 5, 6, 8};
        new ArrayService().replaceFirst2(arr2, 8, 10);
        System.out.println("print first #2: " + Arrays.toString(arr2));

        int[] arr3 = {8, 1, 2, 3, 5, 6, 8};
        new ArrayService().replaceAll(arr3, 8, 10);
        System.out.println("all updated: " + Arrays.toString(arr3));
    }
}