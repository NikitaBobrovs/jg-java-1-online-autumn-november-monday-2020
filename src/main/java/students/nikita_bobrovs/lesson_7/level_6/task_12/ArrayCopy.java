package students.nikita_bobrovs.lesson_7.level_6.task_12;

import java.util.Arrays;

class ArrayCopy {

    private int findNewArrayLength(int[] in, int numberFrom, int numberTo) {
        int length = 0;
        for (int i : in) {
            if (i >= numberFrom && i <= numberTo) {
                length++;
            }
        }
        return length;
    }

    private int[] fillNewArray(int[] in, int numberFrom, int numberTo, int length) {
        int[] aNewArray = new int[length];
        int c = 0;
        for (int i : in) {
            if (i >= numberFrom && i <= numberTo) {
                aNewArray[c] = i;
                c++;
            }
        }
        return aNewArray;
    }

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int length = findNewArrayLength(in, numberFrom, numberTo);
        return fillNewArray(in, numberFrom, numberTo, length);
    }
}
