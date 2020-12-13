package students.jana_sergejenko.lesson_6.level_1.task_6;

class NumberUtilTest {

    public static void main(String[] args) {
        NumberUtilTest test = new NumberUtilTest();
        test.scenario1();
        test.scenario2();
    }

    public void scenario1() {
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(6);
        boolean expectedResult = true;
        if (realResult == expectedResult) {
            System.out.println("test = OK");
        } else {
            System.out.println("test  = FAIL");
        }
    }
    public void scenario2() {
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(3);
        boolean expectedResult = false;
        if (realResult == expectedResult) {
            System.out.println("test = OK");
        } else {
            System.out.println("test  = FAIL");
        }
    }
}