package students.jelena_kaverska.lesson_6.level_3.task_15;

import java.util.Arrays;

class ArrayServiceTest {
    ArrayService arrayService = new ArrayService();

    public String printResult(boolean result) {
        if (result) {
            return "PASSED";
        }
        return "FAILED";
    }

    public boolean checkResults(int exp, int act) {
        return exp == act;
    }

    public boolean checkArrays(int[] exp, int[] act) {
        return Arrays.equals(exp, act);
    }

    public void replacementDone() {
        int[] initialArr = {8, 1, 2, 3, 5, 6, 8, 1};
        int[] resultArr = {8, 10, 2, 3, 5, 6, 8, 10};
        int target = 1;
        int replacement = 10;
        int expCount = 2;
        int actCount = arrayService.replaceAll(initialArr, target, replacement);
        System.out.println("All replaced -> test: " + printResult(checkResults(expCount, actCount)));
        System.out.println("Updated array -> test: " + printResult(checkArrays(resultArr, initialArr)));
    }

    public void singleReplacementDone() {
        int[] initialArr = {8, 1, 2, 3, 5, 6, 8};
        int[] resultArr = {8, 10, 2, 3, 5, 6, 8};
        int target = 1;
        int replacement = 10;
        int expCount = 1;
        int actCount = arrayService.replaceAll(initialArr, target, replacement);
        System.out.println("Single item replaced -> test: " + printResult(checkResults(expCount, actCount)));
        System.out.println("Updated array -> test: " + printResult(checkArrays(resultArr, initialArr)));
    }

    public void noReplacementDone() {
        int[] initialArr = {8, 1, 2, 3, 5, 6, 8};
        int[] resultArr = {8, 1, 2, 3, 5, 6, 8};
        int target = 50;
        int replacement = 10;
        int expCount = 0;
        int actCount = arrayService.replaceAll(initialArr, target, replacement);
        System.out.println("Nothing replaced -> test: " + printResult(checkResults(expCount, actCount)));
        System.out.println("Updated array -> test: " + printResult(checkArrays(resultArr, initialArr)));
    }

    public static void main(String[] args) {
        ArrayServiceTest serviceTest = new ArrayServiceTest();
        serviceTest.replacementDone();
        serviceTest.singleReplacementDone();
        serviceTest.noReplacementDone();
    }
}