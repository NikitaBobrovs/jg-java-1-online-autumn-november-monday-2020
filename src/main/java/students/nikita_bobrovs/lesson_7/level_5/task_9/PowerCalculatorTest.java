package students.nikita_bobrovs.lesson_7.level_5.task_9;

class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest subject = new PowerCalculatorTest();
        subject.positivePowerResultTest1();
        subject.positivePowerResultTest2();
        subject.resultTest1();
        subject.resultTest2();
    }

    String testResult(boolean tester) {
        if (tester) {
            return "OK";
        } else {
            return "FAIL";
        }
    }

    boolean tester(int expectedResult, int realResult) {
        return expectedResult == realResult;
    }

    void positivePowerResultTest1() {
        System.out.println("Positive power result test (exponent = 1) : " + testResult(tester
                (5, new PowerCalculator().positivePowerResult(5, 1))));
    }

    void positivePowerResultTest2() {
        System.out.println("Positive power result test (exponent > 1) : " + testResult(tester
                (8, new PowerCalculator().positivePowerResult(2, 3))));
    }

    void resultTest1() {
        System.out.println("Power calculator test (exponent = 0) : " + testResult(tester
                (0, new PowerCalculator().calculate(3, 0))));
    }

    void resultTest2() {
        System.out.println("Power calculator test (exponent > 0) : " + testResult(tester
                (27, new PowerCalculator().calculate(3, 3))));
    }
}
