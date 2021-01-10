package students.jana_sergejenko.lesson_7.level_6.task_12;

import java.util.Arrays;

public class ArrayCopyTest {
    public static void main(String[] args) {
        ArrayCopyTest test = new ArrayCopyTest();
        test.scenario1();
        test.scenario2();
        test.scenario3();
    }
    public String checkResult(int[] result, int[] expected) {
        if (Arrays.equals(result,expected)) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    public void scenario1() {
        ArrayCopy test = new ArrayCopy();
        int b[] = {1, 2, 3, 4, 5, 6, 7};
        int[] result=test.copyInRange(b, 3, 6);
        int[] expected={3,4,5,6};
        System.out.println("result " + checkResult(result, expected));
    }
    public void scenario2() {
        ArrayCopy test = new ArrayCopy();
        int b[] = {17,24,56,77,99};
        int[] result=test.copyInRange(b, 18, 40);
        int[] expected={24};
        System.out.println("result " + checkResult(result, expected));
    }
    public void scenario3() {
        ArrayCopy test = new ArrayCopy();
        int b[] = {10,22,88,90};
        int[] result=test.copyInRange(b, 3, 9);
        int[] expected={};
        System.out.println("result " + checkResult(result, expected));
    }
}
