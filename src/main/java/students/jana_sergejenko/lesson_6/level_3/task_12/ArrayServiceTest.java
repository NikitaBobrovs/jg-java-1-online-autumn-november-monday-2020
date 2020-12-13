package students.jana_sergejenko.lesson_6.level_3.task_12;

import java.util.Arrays;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.scenario1();
        test.scenario2();
        test.scenario3();
        test.scenario4();
        test.scenario5();
        test.scenario6();
        test.scenario7();
        test.scenario8();
        test.scenario9();
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    public void scenario1() {
        ArrayService array = new ArrayService();
        int[][] myArray = array.createTwoDimensionalArray();
        //array.generateArray(myArray);
        array.printArray(myArray);
        boolean result = array.contains(myArray, 4);
        boolean expected = true;
        checkTestResult(expected == result, "Array contains number");
    }

    public void scenario2() {
        ArrayService array = new ArrayService();
        int[][] myArray = array.createTwoDimensionalArray();
        //array.generateArray(myArray);
        boolean result = array.contains(myArray, 19);
        boolean expected = false;
        checkTestResult(expected == result, "Array does not contains number");
    }

    public void scenario3() {
        ArrayService array = new ArrayService();
        int[][] myArray = array.createTwoDimensionalArray();
        //array.generateArray(myArray);
        int result = array.countOccurrences(myArray, 2);
        int expected = 3;
        checkTestResult(expected == result, "Count of occurrences");
    }

    public void scenario4() {
        ArrayService array = new ArrayService();
        int[][] myArray = array.createTwoDimensionalArray();
        //array.generateArray(myArray);
        int result = array.countOccurrences(myArray, 20);
        int expected = 0;
        checkTestResult(expected == result, "Count of occurrences");
    }

    public void scenario5() {
        ArrayService array = new ArrayService();
        int[][] myArray = array.createTwoDimensionalArray();
        // array.generateArray(myArray);
        boolean result = array.replaceElementByCoordinate(myArray, 0, 1, 3);
        boolean expected = true;
        checkTestResult(expected == result, "Replace element by entered coordinates x and y");
    }

    public void scenario6() {
        ArrayService array = new ArrayService();
        int[][] myArray = array.createTwoDimensionalArray();
        //array.generateArray(myArray);
        boolean result = array.replaceFirst(myArray, 2, 99);
        boolean expected = true;
        checkTestResult(expected == result, "replace first");
    }

    public void scenario7() {
        ArrayService array = new ArrayService();
        int[][] myArray = array.createTwoDimensionalArray();
        //array.generateArray(myArray);
        int result = array.replaceAll(myArray, 4, 77);
        int expected = 4;
        checkTestResult(expected == result, "Count or replaced All");
    }

    public void scenario8() {
        ArrayService array = new ArrayService();
        int[][] myArray = array.createTwoDimensionalArray();
        //array.generateArray(myArray);
        array.revert(myArray);
        int[][] result = myArray;
        int[][] expected = {
                {4, 3, 2, 1},
                {3, 3, 2, 2},
                {6, 5, 4, 3},
                {6, 5, 4, 4}};
        array.printArray(expected);
        array.printArray(result);
        checkTestResult((Arrays.equals(result, expected)), "revert");
    }

    public void scenario9() {
        ArrayService array = new ArrayService();
        int[][] myArray = array.createTwoDimensionalArray();
        //array.generateArray(myArray);
        array.sort(myArray);
        int[][] result = myArray;
        int[][] expected = {
                {1, 2, 3, 4},
                {2, 2, 3, 3},
                {3, 4, 5, 6},
                {4, 4, 5, 6}};
        array.printArray(expected);
        array.printArray(result);
        checkTestResult(Arrays.equals(result, expected), "sort");
    }
}