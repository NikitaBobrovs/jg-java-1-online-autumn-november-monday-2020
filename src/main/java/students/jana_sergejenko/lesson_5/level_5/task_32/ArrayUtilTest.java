package students.jana_sergejenko.lesson_5.level_5.task_32;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
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
}

