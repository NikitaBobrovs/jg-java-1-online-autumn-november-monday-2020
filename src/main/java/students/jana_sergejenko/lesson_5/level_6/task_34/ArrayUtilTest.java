package students.jana_sergejenko.lesson_5.level_6.task_34;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] realResult = arrayUtil.createArray(6);
        int[] expectedResult = new int[6];
        if (realResult.length == expectedResult.length) {
            System.out.println("Array length test = OK");
        } else {
            System.out.println("Array length test  = FAIL");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = {9, 5, 4, 3, 4, 5, 2, 1, 1, 0};
        int realResult = arrayUtil.findMaxNumber(numbers);
        int expectedResult = 9;
        if (realResult == expectedResult) {
            System.out.println("Array length test = OK");
        } else {
            System.out.println("Array length test  = FAIL");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = {9, 5, 4, 3, 4, 5, 2, 1, 1, 0};
        int realResult = arrayUtil.findMinNumber(numbers);
        int expectedResult = 0;
        if (realResult == expectedResult) {
            System.out.println("Array length test = OK");
        } else {
            System.out.println("Array length test  = FAIL");
        }
    }
}