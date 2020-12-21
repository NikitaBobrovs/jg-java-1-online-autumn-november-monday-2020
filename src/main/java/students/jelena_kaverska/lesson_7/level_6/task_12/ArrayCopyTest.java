package students.jelena_kaverska.lesson_7.level_6.task_12;

import java.util.Arrays;

class ArrayCopyTest {
    ArrayCopy copy = new ArrayCopy();

    String printResults(boolean result) {
        if (result) {
            return "PASSED";
        }
        return "FAILED";
    }

    public void test1() {
        int[] initial = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {2, 3, 4};
        int[] actual = copy.copyInRange(initial, 1, 3);
        System.out.println("Copy range in the middle test: " + printResults(Arrays.equals(expected, actual)));
    }

    public void test2() {
        int[] initial = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {1};
        int[] actual = copy.copyInRange(initial, 0, 0);
        System.out.println("Copy range from 0 to 0 test: " + printResults(Arrays.equals(expected, actual)));
    }

    public void test3() {
        int[] initial = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        int[] actual = copy.copyInRange(initial, 0, initial.length - 1);
        System.out.println("Copy range from 0 to last test: " + printResults(Arrays.equals(expected, actual)));
    }

    public void test4() {
        int[] initial = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {7};
        int[] actual = copy.copyInRange(initial, initial.length - 1, initial.length - 1);
        System.out.println("Copy range from last to last test: " + printResults(Arrays.equals(expected, actual)));
    }

    public static void main(String[] args) {
        ArrayCopyTest copyTest = new ArrayCopyTest();
        copyTest.test1();
        copyTest.test2();
        copyTest.test3();
        copyTest.test4();
    }
}