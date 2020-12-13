package students.nikita_bobrovs.lesson_6.level_1.task_1;

class NumberUtils {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest subject = new NumberUtilsTest();
        subject.isEvenTest1();
        subject.isEvenTest2();
    }
    boolean booleanTester(boolean expectedResult, boolean realResult) {
        return expectedResult == realResult;
    }
    public void isEvenTest1() {
        System.out.println("IsEven test (odd number) : "+booleanTester(false,new NumberUtils().isEven(5)));
    }
    public void isEvenTest2() {
        System.out.println("IsEven test (even number) : "+booleanTester(true,new NumberUtils().isEven(4)));
    }
}
