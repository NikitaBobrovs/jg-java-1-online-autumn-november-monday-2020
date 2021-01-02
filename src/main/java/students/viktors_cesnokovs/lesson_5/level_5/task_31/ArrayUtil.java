package students.viktors_cesnokovs.lesson_5.level_5.task_31;

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }
    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt();
        }
    }
}

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }
    public void shouldCreateArray() {
        System.out.println("Array length creation test");
        if (Arrays.equals(new ArrayUtil().createArray(6), new int[6])) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }
}

class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil demo = new ArrayUtil();
        int[] arr = demo.createArray(6);
        demo.fillArrayWithRandomNumbers(arr);
        for (int result : arr) {
            System.out.println(result);
        }
    }
}
