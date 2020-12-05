package students.jelena_kaverska.lesson_5.level_6.task_36;

import java.util.Arrays;

class ArrayUtil {
    int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    void printArrayToConsole(int[] array) {
        for (int num : array) {
            System.out.println(num);
        }
    }

    int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i< array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}

class ArrayUtilTest {
    ArrayUtil arrayUtil;

    ArrayUtilTest() {
        arrayUtil = new ArrayUtil();
    }

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
    }

    static boolean areArraysEqual(int[] actual, int[] expected) {
        return Arrays.equals(actual, expected);
    }

    static boolean checkMax(int actual, int expected) {
        return actual == expected;
    }

    static String printTestResult(boolean result) {
        if (result) {
            return "TEST PASSED";
        }
        return "TEST FAILED";
    }

    void shouldCreateArray() {
        int expectedLength = 5;
        int[] expected = new int[expectedLength];
        int[] actual = arrayUtil.createArray(expectedLength);
        System.out.println("Create array test: " + printTestResult(areArraysEqual(actual, expected)));
    }

    void shouldFindMaxNumber() {
        int [] expectedArray = new int[5];
        expectedArray[0] = 10;
        expectedArray[1] = 25;
        expectedArray[2] = 3;
        expectedArray[3] = 8;
        expectedArray[4] = 150;
        int expMax = 150;
        int actMax = arrayUtil.findMaxNumber(expectedArray);
        System.out.println("Max number: " + printTestResult(checkMax(actMax, expMax)));
    }
}