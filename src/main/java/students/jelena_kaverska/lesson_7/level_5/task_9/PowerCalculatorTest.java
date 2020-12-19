package students.jelena_kaverska.lesson_7.level_5.task_9;

class PowerCalculatorTest {

    PowerCalculator powerCalculator = new PowerCalculator();

    public String printResult(boolean result) {
        if (result) {
            return "PASSED";
        }
        return "FAILED";
    }

    public boolean getResults(double exp, double act) {
        return exp == act;
    }

    public void testPowerPositiveNumberAndPowerZero() {
        double exp = Math.pow(5, 0);
        double act = powerCalculator.calculatePower(5, 0);
        System.out.println("5^0: " + printResult(getResults(exp, act)));
    }

    public void testPowerNegativeNumberAndPowerZero() {
        double exp = Math.pow(-5, 0);
        double act = powerCalculator.calculatePower(-5, 0);
        System.out.println("-5^0: " + printResult(getResults(exp, act)));
    }

    public void testPowerPositiveNumberAndPowerOne() {
        double exp = Math.pow(5, 1);
        double act = powerCalculator.calculatePower(5, 1);
        System.out.println("5^1: " + printResult(getResults(exp, act)));
    }

    public void testPowerNegativeNumberAndPowerOne() {
        double exp = Math.pow(-5, 1);
        double act = powerCalculator.calculatePower(-5, 1);
        System.out.println("-5^1: " + printResult(getResults(exp, act)));
    }

    public void testPowerPositiveNumberAndPositivePower() {
        double exp = Math.pow(5, 3);
        double act = powerCalculator.calculatePower(5, 3);
        System.out.println("5^3: " + printResult(getResults(exp, act)));
    }

    public void testPowerNegativeNumberAndPositivePower() {
        double exp = Math.pow(-5, 3);
        double act = powerCalculator.calculatePower(-5, 3);
        System.out.println("-5^3: " + printResult(getResults(exp, act)));
    }

    public void testPowerPositiveNumberAndNegativePower() {
        double exp = Math.pow(5, -3);
        double act = powerCalculator.calculatePower(5, -3);
        System.out.println("5^-3: " + printResult(getResults(exp, act)));
    }

    public void testPowerNegativeNumberAndNegativePower() {
        double exp = Math.pow(-5, -3);
        double act = powerCalculator.calculatePower(-5, -3);
        System.out.println("-5^-3: " + printResult(getResults(exp, act)));
    }

    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.testPowerPositiveNumberAndPowerZero();
        test.testPowerNegativeNumberAndPowerZero();
        test.testPowerPositiveNumberAndPowerOne();
        test.testPowerNegativeNumberAndPowerOne();
        test.testPowerPositiveNumberAndPositivePower();
        test.testPowerNegativeNumberAndPositivePower();
        test.testPowerPositiveNumberAndNegativePower();
        test.testPowerNegativeNumberAndNegativePower();
    }
}