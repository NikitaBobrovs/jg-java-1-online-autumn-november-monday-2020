package students.jelena_kaverska.lesson_6.level_3.task_16;

import java.util.Arrays;

class ArrayService {

    void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}

class MyArrDemo {

    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] arr = {10, 20, 30, 55, 80};

        System.out.println(Arrays.toString(arr));
        arrayService.reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}