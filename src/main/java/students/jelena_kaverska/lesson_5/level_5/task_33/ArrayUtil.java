package students.jelena_kaverska.lesson_5.level_5.task_33;

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {
    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
    }
}

class MyArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] ints = new int[5];
        arrayUtil.fillArrayWithRandomNumbers(ints);
        System.out.println(Arrays.toString(ints));
    }
}