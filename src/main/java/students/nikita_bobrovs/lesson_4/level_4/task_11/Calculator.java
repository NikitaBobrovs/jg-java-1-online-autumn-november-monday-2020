package students.nikita_bobrovs.lesson_4.level_4.task_11;


class Calculator {
    int sum (int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    int subtract (int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
    int multiply (int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
    int divide (int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }
    boolean isEven (int number){
        if (number % 2 == 0) {
            return true;
        } else{
            return false;
        }
    }
    int maxOfTwoNumbers (int firstNumber, int secondNumber){
        return Math.max(firstNumber,secondNumber);
    }
    int maxOfThreeNumbers (int firstNumber, int secondNumber, int thirdNumber){
        return Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
    }

}

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractTest();
        calculatorTest.multiplyTest();
        calculatorTest.divideTest();
        calculatorTest.isEvenTest();
        calculatorTest.isEvenTest2();
        calculatorTest.maxOfTwoNumbersTest1();
        calculatorTest.maxOfTwoNumbersTest2();
        calculatorTest.maxOfTwoNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest1();
        calculatorTest.maxOfThreeNumbersTest2();
        calculatorTest.maxOfThreeNumbersTest3();
        calculatorTest.maxOfThreeNumbersTest4();
        calculatorTest.maxOfThreeNumbersTest5();
        calculatorTest.maxOfThreeNumbersTest6();
        calculatorTest.maxOfThreeNumbersTest7();

    }

    void sumTest() {
        String testInfo1 = "Addition of two numbers";
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(5, 10);
        if (realResult == expectedResult) {
            System.out.println("(OK) " + testInfo1);
        } else {
            System.out.println("(FAIL) " + testInfo1);
        }
    }

    void subtractTest() {
        String testInfo2 = "Subtraction of two numbers";
        int firstNumber = 8;
        int secondNumber = 3;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtract(8, 3);
        if (realResult == expectedResult) {
            System.out.println("(OK) " + testInfo2);
        } else {
            System.out.println("(FAIL) " + testInfo2);
        }
    }

    void multiplyTest() {
        String testInfo3 = "Multiplication of two numbers";
        int firstNumber = 4;
        int secondNumber = 4;
        int expectedResult = 16;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(4, 4);
        if (realResult == expectedResult) {
            System.out.println("(OK) " + testInfo3);
        } else {
            System.out.println("(FAIL) " + testInfo3);
        }
    }

    void divideTest() {
        String testInfo4 = "Division of two numbers";
        int firstNumber = 21;
        int secondNumber = 7;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(21, 7);
        if (realResult == expectedResult) {
            System.out.println("(OK) " + testInfo4);
        } else {
            System.out.println("(FAIL) " + testInfo4);
        }
    }

    void isEvenTest() {
        String testInfo5 = "Is the number Even(no)";
        int number = 13;
        boolean expectedResult = false;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(13);
        if (realResult == expectedResult) {
            System.out.println("(OK) " + testInfo5);
        } else {
            System.out.println("(FAIL) " + testInfo5);
        }
    }

    void isEvenTest2() {
        String testInfo6 = "Is the number Even (yes)";
        int number = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(10);
        if (realResult == expectedResult) {
            System.out.println("(OK) " + testInfo6);
        } else {
            System.out.println("(FAIL) " + testInfo6);
        }
    }

    void maxOfTwoNumbersTest1() {
        String testInfo7 = "Max of two(1st)";
        int firstNumber = 35;
        int secondNumber = 20;
        int expectedResult = 35;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(35, 20);
        if (realResult == expectedResult) {
            System.out.println("(OK) " + testInfo7);
        } else {
            System.out.println("(FAIL) " + testInfo7);
        }
    }

    void maxOfTwoNumbersTest2() {
        String testInfo7 = "Max of two(2nd)";
        int firstNumber = 10;
        int secondNumber = 15;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(10, 15);
        if (realResult == expectedResult) {
            System.out.println("(OK) " + testInfo7);
        } else {
            System.out.println("(FAIL) " + testInfo7);
        }
    }

    void maxOfTwoNumbersTest3() {
        String testInfo7 = "Max of two (1st;2nd)(equal)";
        int firstNumber = 3;
        int secondNumber = 3;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(3, 3);
        if (realResult == expectedResult) {
            System.out.println("(OK) " + testInfo7);
        } else {
            System.out.println("(FAIL) " + testInfo7);
        }
    }

    void maxOfThreeNumbersTest1() {
        String testInfo8 = "Max of three (1st)";
        int firstNumber = 6;
        int secondNumber = 4;
        int thirdNumber = 2;
        int expectedResult = 6;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(6, 4, 2);
        if (realResult == expectedResult) {
            System.out.println("(OK) " + testInfo8);
        } else {
            System.out.println("(FAIL) " + testInfo8);
        }
    }
    void maxOfThreeNumbersTest2() {
        String testInfo9 = "Max of three (2nd)";
        int firstNumber = 7;
        int secondNumber = 9;
        int thirdNumber = 3;
        int expectedResult = 9;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(7, 9, 3);
        if (realResult == expectedResult) {
            System.out.println("(OK) " + testInfo9);
        } else {
            System.out.println("(FAIL) " + testInfo9);
        }
    }
    void maxOfThreeNumbersTest3() {
        String testInfo9 = "Max of three (3rd)";
        int firstNumber = 10;
        int secondNumber = 25;
        int thirdNumber = 50;
        int expectedResult = 50;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(10, 25, 50);
        if (realResult == expectedResult) {
            System.out.println("(OK) " + testInfo9);
        } else {
            System.out.println("(FAIL) " + testInfo9);
        }
    }
    void maxOfThreeNumbersTest4() {
        String testInfo10 = "Max of three (1st;2nd)";
        int firstNumber = 5;
        int secondNumber = 5;
        int thirdNumber = 1;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(5, 5, 1);
        if (realResult == expectedResult) {
            System.out.println("(OK) " + testInfo10);
        } else {
            System.out.println("(FAIL) " + testInfo10);
        }
    }
    void maxOfThreeNumbersTest5() {
        String testInfo11 = "Max of three (2nd;3rd)";
        int firstNumber = 10;
        int secondNumber = 11;
        int thirdNumber = 11;
        int expectedResult = 11;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(10, 11, 11);
        if (realResult == expectedResult) {
            System.out.println("(OK) " + testInfo11);
        } else {
            System.out.println("(FAIL) " + testInfo11);
        }
    }
    void maxOfThreeNumbersTest6() {
        String testInfo12 = "Max of three (1st;3rd)";
        int firstNumber = 4;
        int secondNumber = 0;
        int thirdNumber = 4;
        int expectedResult = 4;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(4, 0,4);
        if (realResult == expectedResult) {
            System.out.println("(OK) " + testInfo12);
        } else {
            System.out.println("(FAIL) " + testInfo12);
        }
    }
    void maxOfThreeNumbersTest7() {
        String testInfo13 = "Max of three (1st;2nd;3rd)(equal)";
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int expectedResult = 0;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(0, 0, 0);
        if (realResult == expectedResult) {
            System.out.println("(OK) " + testInfo13);
        } else {
            System.out.println("(FAIL) " + testInfo13);
        }
    }
}
