package students.viktors_cesnokovs.lesson_6.level_3.task_12;

import java.util.Arrays;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.containsTest1();
        test.containsTest2();
        test.countOccurrencesTest1();
        test.countOccurrencesTest2();
        test.replaceFirstTest1();
        test.replaceFirstTest2();
        test.replaceAllTest1();
        test.replaceAllTest2();
        test.replaceAllTest3();
        test.reverseTest1();
        test.sortTest1();

    }

    boolean booleanTester(boolean expectedResult, boolean realResult) {
        return expectedResult == realResult;
    }
    boolean integerTester(int expectedResult, int realResult) {
        return expectedResult == realResult;
    }

    String result(boolean tester) {
        if (tester) {
            return "OK";
        } else {
            return "FAIL";
        }
    }

    void containsTest1() {
        int[] subject = {5, 10, 15, 20};
        System.out.println("Array contain given number test(YES) : " + result(booleanTester
                (true, new ArrayService().contains(subject, 5))));
    }

    void containsTest2() {
        int[] subject = {0, 10, 20, 30};
        System.out.println("Array contain given number test(NO) : " + result(booleanTester
                (false, new ArrayService().contains(subject, 8))));
    }

    void countOccurrencesTest1() {
        int[] subject = {1, 2, 3, 2, 2};
        System.out.println("How many occurrences test(Multiple)  : " + result(integerTester
                (3, new ArrayService().countOccurrences(subject, 2))));
    }

    void countOccurrencesTest2() {
        int[] subject = {5, 10, 15, 15, 20};
        System.out.println("How many occurrences test (None) : " + result(integerTester
                (0, new ArrayService().countOccurrences(subject, 6))));
    }

    void replaceFirstTest1() {
        int[] subject = {5, 10, 15, 20, 25};
        System.out.println("Replace first occurrence test (YES) : " + result(booleanTester
                (true, new ArrayService().replaceFirst(subject, 15, 5))));
    }

    void replaceFirstTest2() {
        int[] subject = {5, 10, 15, 20, 25};
        System.out.println("Replace first occurrence test (NO) : " + result(booleanTester
                (false, new ArrayService().replaceFirst(subject, 14, 60))));
    }

    void replaceAllTest1() {
        int[] subject = {5, 10, 5, 10, 5, 10};
        System.out.println("Replace duplicates.(Multiple) : " + result(integerTester
                (3, new ArrayService().replaceAll(subject, 10, 5))));
    }

    void replaceAllTest2() {
        int[] subject = {5, 10, 5, 10, 5, 10};
        System.out.println("Replace duplicates.(None) : " + result(integerTester
                (0, new ArrayService().replaceAll(subject, 15, 5))));
    }

    void replaceAllTest3() {
        int[] subject = {10, 5, 5, 20, 15, 20};
        new ArrayService().replaceAll(subject, 5, 10);
        int[] expectedResult = {10, 10, 10, 20, 15, 20};
        System.out.println("Replace duplicates. Array test : "
                + result(Arrays.equals(expectedResult, subject)));
    }

    void reverseTest1() {
        int[] subject = {1, 2, 3, 4, 5};
        new ArrayService().reverse(subject);
        int[] expectedResult = {5, 4, 3, 2, 1};
        System.out.println("Revert array test : "
                + result(Arrays.equals(expectedResult, subject)));
    }

    void sortTest1() {
        int[] subject = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        new ArrayService().sort(subject);
        int[] expectedResult = {8, 2, 6, 4, 5, 3, 7, 1, 9};
        System.out.println("Sort array. Even then odd test : "
                + result(Arrays.equals(expectedResult, subject)));
    }
}

