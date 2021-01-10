package students.jana_sergejenko.lesson_7.level_5.task_9;

public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.scenario1();
        test.scenario2();
        test.scenario3();
        test.scenario4();
    }
    public String checkResult(double result, double expected) {
        if (result == expected) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    public void scenario1() {
        PowerCalculator test = new PowerCalculator();
        double result = test.power(2,5);
        double expected=32;
        System.out.println("result " + checkResult(result, expected));
    }
    public void scenario2() {
        PowerCalculator test = new PowerCalculator();
        double result = test.power(2,1);
        double expected=2;
        System.out.println("result " + checkResult(result, expected));
    }
    public void scenario3() {
        PowerCalculator test = new PowerCalculator();
        double result = test.power(2,0);
        double expected=1;
        System.out.println("result " + checkResult(result, expected));
    }
    public void scenario4() {
        PowerCalculator test = new PowerCalculator();
        double result = test.power(1,5);
        double expected=1;
        System.out.println("result " + checkResult(result, expected));
    }
}
