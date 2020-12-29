package students.jekaterina_aleksejeva.lesson_7.level_5.task_9;

class PowerCalculator {

    public double getPower(int number, int power) {
        double result = 1.0;
        if (power < 0) {
            for (int i = power; i < 0; i++) {
                result /= number;
            }
        } else {
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
        }
        return result;
    }

}

class PowerCalculatorDemo {

    public static void main(String[] args) {
        PowerCalculator demo = new PowerCalculator();
        System.out.println("2 to the power of 5 = " + demo.getPower(2, 5));
        System.out.println("2 to the power of -5 = " + demo.getPower(2, -5));
    }
}

class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.zeroToPowerZero();
        test.negativeToPowerZero();
        test.maxNegativeToPowerZero();
        test.positiveToPowerZero();
        test.maxPositiveToPowerZero();
        test.maxNegativeToPowerOne();
        test.maxPositiveToPowerOne();
        test.zeroToPowerPositive();
        test.positiveToPowerNegative();
        test.negativeToPowerNegative();

    }

    public void testResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = PASS");
        } else {
            System.out.println(testName + " = FAILED");
        }
    }

    public void zeroToPowerZero() {
        PowerCalculator calculator = new PowerCalculator();
        double expectedResult = Math.pow(0, 0);
        testResult(expectedResult == calculator.getPower(0, 0), "0 to the power of 0 is " + expectedResult);

    }

    public void negativeToPowerZero() {
        PowerCalculator calculator = new PowerCalculator();
        double expectedResult = Math.pow(-1, 0);
        testResult(expectedResult == calculator.getPower(-1, 0), "-1 to the power of 0 is " + expectedResult);

    }

    public void maxNegativeToPowerZero() {
        PowerCalculator calculator = new PowerCalculator();
        double expectedResult = Math.pow(-2147483648, 0);
        testResult(expectedResult == calculator.getPower(-2147483648, 0), "-2147483648 to the power of 0 is " + expectedResult);

    }

    public void positiveToPowerZero() {
        PowerCalculator calculator = new PowerCalculator();
        double expectedResult = Math.pow(1, 0);
        testResult(expectedResult == calculator.getPower(1, 0), "1 to the power of 0 is " + expectedResult);

    }

    public void maxPositiveToPowerZero() {
        PowerCalculator calculator = new PowerCalculator();
        double expectedResult = Math.pow(2147483647, 0);
        testResult(expectedResult == calculator.getPower(2147483647, 0), "2147483647 to the power of 0 is " + expectedResult);
    }


    public void maxNegativeToPowerOne() {
        PowerCalculator calculator = new PowerCalculator();
        double expectedResult = Math.pow(-2147483648, 1);
        testResult(expectedResult == calculator.getPower(-2147483648, 1), "-2147483648 to the power of 1 is " + expectedResult);

    }

    public void maxPositiveToPowerOne() {
        PowerCalculator calculator = new PowerCalculator();
        double expectedResult = Math.pow(2147483647, 1);
        testResult(expectedResult == calculator.getPower(2147483647, 1), "2147483647 to the power of 1 is " + expectedResult);

    }

    public void zeroToPowerPositive() {
        PowerCalculator calculator = new PowerCalculator();
        double expectedResult = Math.pow(0, 1000);
        testResult(expectedResult == calculator.getPower(0, 1000), "0 to the power of 1000 is " + expectedResult);

    }

    public void positiveToPowerNegative() {
        PowerCalculator calculator = new PowerCalculator();
        double expectedResult = Math.pow(2, -3);
        testResult(expectedResult == calculator.getPower(2, -3), "2 to the power of -3 is " + expectedResult);

    }

    public void negativeToPowerNegative() {
        PowerCalculator calculator = new PowerCalculator();
        double expectedResult = Math.pow(-2, -2);
        testResult(expectedResult == calculator.getPower(-2, -2), "-2 to the power of -2 is " + expectedResult);

    }

}