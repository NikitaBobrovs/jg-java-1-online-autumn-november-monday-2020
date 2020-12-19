package students.jelena_kaverska.lesson_6.level_3.task_16;

import java.util.Arrays;

class ArrayServiceTest {
    ArrayService arrayService = new ArrayService();

    public String printResult(boolean result) {
        if (result) {
            return "PASSED";
        }
        return "FAILED";
    }

    public boolean checkArrays(int[] exp, int[] act) {
        return Arrays.equals(exp, act);
    }

    public void testReversed() {
        int [] initial = {10, 20, 30, 55, 80};
        int [] expected = {80, 55, 30, 20, 10};
        arrayService.reverseArray(initial);
        System.out.println(printResult(checkArrays(initial,expected)));
    }

    public static void main(String[] args) {
        ArrayServiceTest serviceTest = new ArrayServiceTest();
        serviceTest.testReversed();
    }
}