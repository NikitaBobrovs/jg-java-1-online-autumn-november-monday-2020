package students.jelena_kaverska.lesson_7.level_6.task_12;

import java.util.Arrays;

class ArrayCopyTest {
    ArrayCopy copy = new ArrayCopy();

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    public void test1() {
        int[] initial = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {1, 2, 3};
        int[] actual = copy.copyInRange(initial, 1, 3);
        System.out.println("Copy range - test: " + printResults(Arrays.equals(expected, actual)));
    }

    public void test2() {
        int[] initial = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {5};
        int[] actual = copy.copyInRange(initial, 5, 5);
        System.out.println("Copy one number - test: " + printResults(Arrays.equals(expected, actual)));
    }

    public void test3() {
        int[] initial = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        int[] actual = copy.copyInRange(initial, 0, 8);
        System.out.println("Copy all elements - test: " + printResults(Arrays.equals(expected, actual)));
    }

    public void test4() {
        int[] initial = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = null;
        int[] actual = copy.copyInRange(initial, 7, 2);
        System.out.println("Invalid range - test: " + printResults(Arrays.equals(expected, actual)));
    }

    public void test5() {
        int[] initial = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = null;
        int[] actual = copy.copyInRange(initial, 20, 25);
        System.out.println("Unavailable range - test: " + printResults(Arrays.equals(expected, actual)));
    }

    public static void main(String[] args) {
        ArrayCopyTest copyTest = new ArrayCopyTest();
        copyTest.test1();
        copyTest.test2();
        copyTest.test3();
        copyTest.test4();
        copyTest.test5();
    }
}