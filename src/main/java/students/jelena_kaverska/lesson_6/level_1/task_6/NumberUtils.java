package students.jelena_kaverska.lesson_6.level_1.task_6;

class NumberUtils {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}

class NumberUtilsTest {
    NumberUtils numberUtils = new NumberUtils();

    static boolean isEqual(boolean expected, boolean actual) {
        return expected == actual;
    }

    static String printTestResult(boolean result) {
        if (result) {
            return "TEST PASSED";
        }
        return "TEST FAILED";
    }

    void testEven() {
        int actNumber = 10;
        boolean expected = true;
        boolean actual = numberUtils.isEven(actNumber);
        System.out.println(printTestResult(isEqual(expected, actual)));
    }

    void testOdd() {
        int actNumber = 11;
        boolean expected = false;
        boolean actual = numberUtils.isEven(actNumber);
        System.out.println(printTestResult(isEqual(expected, actual)));
    }

    public static void main(String[] args) {
        NumberUtilsTest test1 = new NumberUtilsTest();
        test1.testEven();
        test1.testOdd();
    }
}