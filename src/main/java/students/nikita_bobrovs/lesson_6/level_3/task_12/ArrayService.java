package students.nikita_bobrovs.lesson_6.level_3.task_12;


import java.util.Arrays;

class ArrayService {
    boolean contains(int[] array, int searchNumber) {
        for (int i : array) {
            if (searchNumber == i) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] array, int number) {
        int i = 0;
        for (int arr : array) {
            if (arr == number) {
                i += 1;
            }
        }
        return i;
    }

    boolean replaceFirst(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] array, int numberToReplace, int newNumber) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                count += 1;
            }
        }
        return count;
    }

    void revert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int t = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = t;
        }
    }

    void sortOddEven(int[] arr) {
        int left =0;
        int right = arr.length -1;
        while (left <= right) {
            if (arr[left] % 2 != 0) {
                if (arr[right] % 2 == 0) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                }
                right--;
            } else {
                left++;
            }

        }
    }
}


class ArrayServiceTest {
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
        test.revertTest1();
        test.sortOddEvenTest1();

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
        int[] subject = {5, 20, 46, 3};
        System.out.println("Does array contain given number test(YES) : " + result(booleanTester
                        (true, new ArrayService().contains(subject, 46))));
    }

    void containsTest2() {
        int[] subject = {0, 1, 100, 1};
        System.out.println("Does array contain given number test(NO) : " + result(booleanTester
                        (false, new ArrayService().contains(subject, 5))));
    }

    void countOccurrencesTest1() {
        int[] subject = {3, 10, 55, 10, 0};
        System.out.println("How many occurrences test (Multiple(2)) : " + result(integerTester
                        (2, new ArrayService().countOccurrences(subject, 10))));
    }

    void countOccurrencesTest2() {
        int[] subject = {3, 10, 55, 10, 0};
        System.out.println("How many occurrences test (None(0)) : " + result(integerTester
                        (0, new ArrayService().countOccurrences(subject, 19))));
    }

    void replaceFirstTest1() {
        int[] subject = {1, 2, 3, 4, 5};
        System.out.println("Replace first occurrence test (YES) : " + result(booleanTester
                        (true, new ArrayService().replaceFirst(subject, 3, 5))));
    }

    void replaceFirstTest2() {
        int[] subject = {1, 2, 3, 4, 5};
        System.out.println("Replace first occurrence test (NO) : " + result(booleanTester
                        (false, new ArrayService().replaceFirst(subject, 0, 1))));
    }
    void replaceAllTest1(){
        int[] subject = {1,2,2,3,2,5};
        System.out.println("Replace all duplicates. Count test (multiple(3)) : "+result(integerTester
                        (3,new ArrayService().replaceAll(subject,2,5))));
    }
    void replaceAllTest2(){
        int[] subject = {1,2,2,3,2,5};
        System.out.println("Replace all duplicates. Count test (None(0)) : "+result(integerTester
                        (0,new ArrayService().replaceAll(subject,6,5))));
    }
    void replaceAllTest3(){
        int[] subject = {1,2,2,3,2,5};
        new ArrayService().replaceAll(subject,2,1);
        int[] expectedResult = {1,1,1,3,1,5};
        System.out.println("Replace all duplicates. Array test : "
                +result(Arrays.equals(expectedResult, subject)));
    }
    void revertTest1(){
        int [] subject = {1,2,3,4,5};
        new ArrayService().revert(subject);
        int[] expectedResult = {5,4,3,2,1};
        System.out.println("Revert array test : "
                + result(Arrays.equals(expectedResult,subject)));
    }
    void sortOddEvenTest1(){
        int [] subject = {1,2,3,4,5,6,7,8,9};
        new ArrayService().sortOddEven(subject);
        int [] expectedResult = {8,2,6,4,5,3,7,1,9};
        System.out.println("Sort array. Even then odd test : "
                +result(Arrays.equals(expectedResult,subject)));
    }
}
