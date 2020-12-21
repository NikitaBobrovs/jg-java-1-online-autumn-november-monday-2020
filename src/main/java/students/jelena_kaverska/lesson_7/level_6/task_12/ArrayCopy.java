package students.jelena_kaverska.lesson_7.level_6.task_12;

import java.util.Arrays;

class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] result = new int[numberTo - numberFrom + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = in[numberFrom + i];
        }
        return result;
    }

    int[] copyInRange3(int[] in, int numberFrom, int numberTo) {
        int[] result = new int[numberTo - numberFrom + 1];
        int i = 0;
        while (i < result.length) {
            for (int j = numberFrom; j <= numberTo; j++) {
                result[i] = in[j];
                i++;
            }
        }
        return result;
    }

    int[] copyInRange2(int[] in, int numberFrom, int numberTo) {
        int[] result = new int[numberTo - numberFrom];
        return Arrays.copyOfRange(in, numberFrom, numberTo + 1);
    }
}

class MyArrDemo {

    public static void main(String[] args) {

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        System.out.println(Arrays.toString(a));

        int[] result = new ArrayCopy().copyInRange(a, 0, 3);
        System.out.println(Arrays.toString(result));

        int[] result2 = new ArrayCopy().copyInRange2(a, 0, 3);
        System.out.println(Arrays.toString(result2));

        int[] result3 = new ArrayCopy().copyInRange3(a, 0, 3);
        System.out.println(Arrays.toString(result3));
    }
}