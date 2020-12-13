package students.jelena_kaverska.lesson_6.level_3.task_14;

import java.util.Arrays;

class ArrayServiceTest {
    ArrayService arrayService = new ArrayService();

    public String printResult(boolean result) {
        if (result) {
            return "PASSED";
        }
        return "FAILED";
    }

    public boolean checkResults(boolean exp, boolean act) {
        return exp == act;
    }

    public boolean checkArrays(int[] exp, int[] act) {
        return Arrays.equals(exp, act);
    }

    public void replacementDone() {
        int[] initialArr = {8, 1, 2, 3, 5, 6, 8, 1};
        int[] resultArr = {8, 10, 2, 3, 5, 6, 8, 1};
        int target = 1;
        int replacement = 10;
        boolean exp = true;
        boolean act = arrayService.replaceFirst(initialArr, target, replacement);
        System.out.println("Replacement done -> test: " + printResult(checkResults(exp, act)));
        System.out.println("Updated array -> test: " + printResult(checkArrays(resultArr, initialArr)));
    }

    public void noReplacement() {
        int[] initialArr = {8, 1, 2, 3, 5, 6, 8};
        int[] resultArr = {8, 1, 2, 3, 5, 6, 8};
        int target = 4;
        int replacement = 10;
        boolean exp = false;
        boolean act = arrayService.replaceFirst(initialArr, target, replacement);
        System.out.println("No replacement done -> test: " + printResult(checkResults(exp, act)));
        System.out.println("No update on array -> test: " + printResult(checkArrays(resultArr, initialArr)));
    }

    public static void main(String[] args) {
        ArrayServiceTest serviceTest = new ArrayServiceTest();
        serviceTest.replacementDone();
        serviceTest.noReplacement();
    }
}