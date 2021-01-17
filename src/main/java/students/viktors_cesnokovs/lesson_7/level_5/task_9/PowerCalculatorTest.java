package students.viktors_cesnokovs.lesson_7.level_5.task_9;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.positivePowerTest1();
        test.positivePowerTest2();
        test.resultTest1();
        test.resultTest2();
    }

    String result(boolean tester) {
        if (tester) {
            return "OK";
        } else {
            return "FAIL";
        }
    }

    boolean tester(int expected, int real) { return expected == real; }

    void positivePowerTest1() {
        System.out.println("Positive power result : " + result(tester(7, new PowerCalculator().positivePower(7, 1))));
    }

    void positivePowerTest2() {
        System.out.println("Positive power result : " + result(tester(64, new PowerCalculator().positivePower(4, 3))));
    }

    void resultTest1() {
        System.out.println("Power calculator test : " + result(tester(0, new PowerCalculator().power(7, 0))));
    }

    void resultTest2() {
        System.out.println("Power calculator test : " + result(tester(8, new PowerCalculator().power(2, 3))));
    }
}
