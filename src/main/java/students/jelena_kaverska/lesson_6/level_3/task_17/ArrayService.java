package students.jelena_kaverska.lesson_6.level_3.task_17;

import java.util.Arrays;

class ArrayService {

    public void sortArrAsc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void sortArrDesc(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

class MyArrDemo {

    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] arr = {8, 9, 3, 1, 4, 100, 85, 9, 1, -8};
        System.out.println(Arrays.toString(arr));
        arrayService.sortArrAsc(arr);
        System.out.println(Arrays.toString(arr));

        arrayService.sortArrDesc(arr);
        System.out.println(Arrays.toString(arr));
    }
}