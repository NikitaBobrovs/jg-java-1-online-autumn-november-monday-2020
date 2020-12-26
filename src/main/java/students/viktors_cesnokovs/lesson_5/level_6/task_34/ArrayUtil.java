package students.viktors_cesnokovs.lesson_5.level_6.task_34;

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) { return new int[arrayLength]; }
    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt();
        }
    }

    public void printArrayToConsole(int[] array) {                       //task 34
        System.out.println("Array numbers : ");
        for (int i : array) {
            System.out.println(i);
        }
    }

    public int findMaxNumber(int[] array) { return Arrays.stream(array).max().getAsInt(); }     //task 35
    public int findMinNumber(int[] array) { return Arrays.stream(array).min().getAsInt(); }     //task 37
}

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        System.out.println("Array length creation test");
        if (Arrays.equals(new ArrayUtil().createArray(6), new int[6])) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    public void shouldFindMaxNumber() {                                                     //task 36
        System.out.println("Find max number of the array 'test' : ");
        int[] arr = new ArrayUtil().createArray(5);
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;
        int expectedResult = 10;
        if (expectedResult == new ArrayUtil().findMaxNumber(arr)) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    public void shouldFindMinNumber() {                                                     //task 38
        System.out.println("Find min number of the array 'test' : ");
        int[] arr = new ArrayUtil().createArray(5);
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 7;
        arr[4] = 9;
        int expectedResult = 1;
        if (expectedResult == new ArrayUtil().findMinNumber(arr)) {
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
