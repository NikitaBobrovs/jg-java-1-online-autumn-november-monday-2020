package students.viktors_cesnokovs.lesson_6.level_1.task_1;

class NumberUtils {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.isEvenTest1();
        test.isEvenTest2();
    }

    boolean booleanTester(boolean expectedResult, boolean realResult) {
        return expectedResult == realResult;
    }

    void isEvenTest1() {
        System.out.println(" Is Even test 'Even number' : " + booleanTester(true, new NumberUtils().isEven(2)));
    }

    void isEvenTest2() {
        System.out.println(" Is Even test 'Odd number' : " + booleanTester(false, new NumberUtils().isEven(3)));
    }
}