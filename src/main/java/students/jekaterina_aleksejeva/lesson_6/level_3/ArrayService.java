package students.jekaterina_aleksejeva.lesson_6.level_3;

import java.util.Arrays;

class ArrayService {
// task 12
    boolean contains(int[] arr, int numberToSearch) {
        for (int numberOfArr : arr) {
            if (numberOfArr == numberToSearch)
                return true;
        }

        return false;
    }

// task 13
    int countOccurrences(int[] arr, int numberToSearch) {
        int counter = 0;
        for (int numberOfArr : arr) {
            if (numberOfArr == numberToSearch)
                counter++;
        }
        return counter;
    }

// task 14
    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }

        }
        return false;

    }
// task 15
    int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                counter++;
            }
        }
    return counter;

    }
// task 16
    void revert(int[] arr) {
        for(int i = 0; i < arr.length/2; i++) {
        int j = arr[i];
        arr[i] = arr[arr.length -i - 1];
        arr[arr.length -i -1] = j;

       }

    }

// task 17
    void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            Arrays.sort(arr);
        }
    }
}

class ArrayServiceDemo {

    public static void main(String[] args) {
        ArrayService demo = new ArrayService();
        int[] arr = {10, 2, 3, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        System.out.println("The number 2 is found " + demo.contains(arr, 2));
        System.out.println("Equal numbers counted " + demo.countOccurrences(arr, 3));

        demo.replaceFirst(arr,10, 50);
        System.out.println("Single replacement : " + Arrays.toString(arr));

        demo.replaceAll(arr,3,300);
        System.out.println("Replacement of 2 equal numbers: " + Arrays.toString(arr));

        demo.revert(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));

        demo.sort(arr);
        System.out.println("Sorted array in ascending order: " +Arrays.toString(arr));

    }

}

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.containsSearchedNumber();
        test.containsNoSearchedNumber();
        test.countsEqualNumbers();
        test.countsAllEqualNumbers();
        test.countsNoEqualNumbers();
        test.singleReplacement();
        test.noSingleReplacement();
        test.multipleReplacement();
        test.totalReplacement();
        test.noneReplacement();
        test.reversalComplete();
        test.reversalWithEquals();
        test.reversalWithSpaces();
        test.sortingAscending();
        test.sortingAscendingWithEquals();

    }

    public void testResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = PASS");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
// task 12 test
    public void containsSearchedNumber() {
        ArrayService service = new ArrayService();
        int searchedNumber = 15;
        int[] arr = {5, 10, 15, 20};
        boolean contains = service.contains(arr, searchedNumber);

        testResult(contains, "containsSearchedNumber");

    }
    public void containsNoSearchedNumber() {
        ArrayService service = new ArrayService();
        int searchedNumber = 2;
        int[] arr = {17, 7, 11, 9};
        boolean contains = service.contains(arr, searchedNumber);
        String resultOfContains = String.valueOf(contains);

        testResult("false".equals(resultOfContains), "containsNoSearchedNumber");

    }
// task 13 test
    public void countsEqualNumbers() {
        ArrayService service = new ArrayService();
        int[] arr = {-7, 7, 7, 7};
        int occurrence = service.countOccurrences(arr,7);

        testResult(3 == occurrence, "countsEqualNumbers");

    }

    public void countsAllEqualNumbers() {
        ArrayService service = new ArrayService();
        int[] arr = {7, 7, 7, 7};
        int occurrence = service.countOccurrences(arr,7);

        testResult(4 == occurrence, "countsAllEqualNumbers");

    }

    public void countsNoEqualNumbers() {
        ArrayService service = new ArrayService();
        int[] arr = {7, 77, 777, 7777};
        int occurrence = service.countOccurrences(arr,10);

        testResult(0 == occurrence, "countsNoEqualNumbers");

    }

// task 14 test
    public void singleReplacement() {
        ArrayService service = new ArrayService();
        int[] arr = {1, 2, 3, 4};
        boolean replacement = service.replaceFirst(arr, 4, 55);
        String resultOfReplacement = String.valueOf(replacement);

        testResult("true".equals(resultOfReplacement), "singleReplacement");
    }

    public void noSingleReplacement() {
        ArrayService service = new ArrayService();
        int[] arr = {1, 2, 3, 4};
        boolean replacement = service.replaceFirst(arr, 5, 10);
        String resultOfReplacement = String.valueOf(replacement);

        testResult("false".equals(resultOfReplacement), "noSingleReplacement");
    }
// task 15 test
    public void multipleReplacement() {
        ArrayService service = new ArrayService();
        int[] arr = {5, 10, 10, 25};
        int resultOfReplacement = service.replaceAll(arr,10, 15);

        testResult(2 == resultOfReplacement, "multipleReplacement");
    }

    public void totalReplacement() {
        ArrayService service = new ArrayService();
        int[] arr = {5, 5, 5, 5};
        int resultOfReplacement = service.replaceAll(arr,5, 100);

        testResult(4 == resultOfReplacement, "totalReplacement");
    }

    public void noneReplacement() {
        ArrayService service = new ArrayService();
        int[] arr = {0, 10, 20, 30};
        int resultOfReplacement = service.replaceAll(arr,5, 100);

        testResult(0 == resultOfReplacement, "noneReplacement");
    }
// task 16 test
    public void reversalComplete() {
        ArrayService service = new ArrayService();
        int[] original = {1, 2, 3, 4};
        service.revert(original);
        int[] expected = {4, 3, 2, 1};
        boolean comparison = Arrays.equals(original,expected);

        testResult(comparison,"reversalComplete");

    }

    public void reversalWithEquals() {
        ArrayService service = new ArrayService();
        int[] original = {5, 7, 8, 5};
        service.revert(original);
        int[] expected = {5, 8, 7, 5};
        boolean comparison = Arrays.equals(original,expected);

        testResult(comparison,"reversalWithEquals");

    }

    public void reversalWithSpaces() {
        ArrayService service = new ArrayService();
        int[] original = {1, 2, 3, };
        service.revert(original);
        int[] expected = {3, 2, 1};
        boolean comparison = Arrays.equals(original,expected);

        testResult(comparison,"reversalWithSpaces");


    }
// task 17 test
    public void sortingAscending() {
        ArrayService service = new ArrayService();
        int[] original = {25, 100, -88, 1};
        service.sort(original);
        int[] expected = {-88, 1, 25, 100};
        boolean comparison = Arrays.equals(original,expected);

        testResult(comparison,"sortingAscending");

    }
    public void sortingAscendingWithEquals() {
        ArrayService service = new ArrayService();
        int[] original = {0, 0, 0,-100};
        service.sort(original);
        int[] expected = {-100, 0, 0, 0};
        boolean comparison = Arrays.equals(original,expected);

        testResult(comparison,"sortingDescendingWithEquals");

    }

}
