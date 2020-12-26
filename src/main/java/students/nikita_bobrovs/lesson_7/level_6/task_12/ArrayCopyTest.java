package students.nikita_bobrovs.lesson_7.level_6.task_12;

import java.util.Arrays;

class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest subject = new ArrayCopyTest();
        subject.copyInRangeTest1();
        subject.copyInRangeTest2();
        subject.copyInRangeTest3();
        subject.copyInRangeTest4();
    }

    String testResult(boolean tester) {
        if (tester) {
            return "OK";
        } else {
            return "FAIL";
        }
    }

    boolean arrayTester(int[] expectedResult, int[] realResult) {
        return Arrays.equals(expectedResult, realResult);
    }

    void copyInRangeTest1() {
        int[] in = {1, 2, 3, 4, 5};
        int[] expectedResult = {1, 2, 3};
        System.out.println("Copy in range test(in range) : " + testResult(arrayTester
                (expectedResult, new ArrayCopy().copyInRange(in, 1, 3))));
    }

    void copyInRangeTest2() {
        int[] in = {1, 2, 3, 4, 5};
        int[] expectedResult = {};
        System.out.println("Copy in range test(not in range) : " + testResult(arrayTester
                (expectedResult, new ArrayCopy().copyInRange(in, 6, 8))));
    }

    void copyInRangeTest3() {
        int[] in = {1, 2, 3, 4, 5};
        int[] expectedResult = {};
        System.out.println("Copy in range test(invalid(reversed) input) : " + testResult(arrayTester
                (expectedResult, new ArrayCopy().copyInRange(in, 3, 1))));
    }

    void copyInRangeTest4() {
        int[] in = {1, 2, 3, 4, 5};
        int[] expectedResult = {5};
        System.out.println("Copy in range test(in range(single number)) : " + testResult(arrayTester
                (expectedResult, new ArrayCopy().copyInRange(in, 5, 5))));
    }
}
