package students.jelena_kaverska.lesson_5.level_5.task_32;

import java.util.Arrays;

class ArrayUtil {
    int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }
}

class ArrayUtilTest {
    ArrayUtil arrayUtil = new ArrayUtil();

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    static boolean areArraysEqual(int[] actual, int[] expected) {
        return Arrays.equals(actual, expected);
    }

    static String printTestResult(boolean result) {
        if (result) {
            return "TEST PASSED";
        }
        return "TEST FAILED";
    }

    void shouldCreateArray() {
        // Проверьте, что метод создаёт массив указанной длины
        int expectedLength = 5;
        int[] expected = new int[expectedLength];
        int[] actual = arrayUtil.createArray(expectedLength);
        System.out.println("Create array test: " + printTestResult(areArraysEqual(actual, expected)));
    }
}