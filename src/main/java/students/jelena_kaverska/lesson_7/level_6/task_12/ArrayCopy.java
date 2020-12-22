package students.jelena_kaverska.lesson_7.level_6.task_12;

import java.util.Arrays;
import java.util.Random;

class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int count = 0;
        for (int value : in) {
            if (value >= numberFrom && value <= numberTo) {
                count++;
            }
        }
        int[] result = new int[count];
        if (result.length > 0) {
            int index = 0;
            for (int value : in) {
                if (value >= numberFrom && value <= numberTo) {
                    result[index] = value;
                    index++;
                }
            }
            return result;
        }
        return null;
    }
}

class MyArrDemo {

    public static void main(String[] args) {
        int[] b = {1, 4, 6, 2, 7, 3};
        System.out.println(Arrays.toString(new ArrayCopy().copyInRange(b, 7, 4)));

        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(new ArrayCopy().copyInRange(arr, 7, 14)));
    }
}