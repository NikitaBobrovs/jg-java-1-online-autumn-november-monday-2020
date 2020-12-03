package students.jana_sergejenko.lesson_4.level_7.task_24;

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

    public String checkResult(int result, int expected) {
        if (result == expected) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    public String checkResult2(boolean result) {
        if (true) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    public void sumTest() {
        System.out.println("Sum " + checkResult(new Calculator().sum(35, 40), 75));
    }

    public void subTest() {
        System.out.println("Sub " + checkResult(new Calculator().sub(35, 15), 20));
    }

    public void mulTest() {
        System.out.println("Mul " + checkResult(new Calculator().mul(5, 5), 25));

    }

    public void divTest() {
        System.out.println("Div " + checkResult(new Calculator().div(40, 8), 5));
    }

    public void isEvenTest1() {
        System.out.println("isEven " + checkResult2(new Calculator().isEven(40)));
    }

    public void isEvenTest2() {
        System.out.println("isEven " + checkResult2(new Calculator().isEven(41)));
    }
}

