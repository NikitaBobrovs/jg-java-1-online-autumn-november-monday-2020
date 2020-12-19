package students.viktors_cesnokovs.lesson_4.level_7.task_24;

class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    String testResult(boolean tester) {
        if (tester) {
            return "OK";
        } else {
            return "FAIL";
        }
    }

    boolean booleanTester(boolean expectedResult, boolean realResult) {
        return realResult == expectedResult;
    }

    boolean intTester(int expectedResult, int realResult) {
        return realResult == expectedResult;
    }

    public void sumTest() {
        System.out.println("Sum test = " + testResult(intTester(75, new Calculator().sum(35, 40))));
    }

    public void subTest() {
        System.out.println("Sub test = " + testResult(intTester(20, new Calculator().sub(35, 15))));
    }

    public void mulTest() {
        System.out.println("Mul test = " + testResult(intTester(25, new Calculator().mul(5, 5))));
    }

    public void divTest() {
        System.out.println("Div test = " + testResult(intTester(5, new Calculator().div(40, 8))));
    }

    public void isEvenTest1() {
        System.out.println("isEven test = " + testResult(booleanTester(true, new Calculator().isEven(40))));
    }

    public void isEvenTest2() {
        System.out.println("isEven Test = " + testResult(booleanTester(false, new Calculator().isEven(41))));
    }
}
