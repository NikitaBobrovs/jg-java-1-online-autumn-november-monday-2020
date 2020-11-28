package students.viktors_cesnokovs.lesson_4.level_4.task_11;

public class Calculator {
    int sum( int a, int b) { return a+b ; }
    int subtract( int a, int b) { return a-b ; }
    int multiply( int a, int b) { return a*b ; }
    int divide( int a, int b) { return a/b ; }
    boolean isEven( int number) { return number %2 == 0; }
    int maxOfTwoNumbers( int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
    int maxOfThreeNumbers ( int a, int b, int c) { return maxOfTwoNumbers(maxOfTwoNumbers(a,b), c); }
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
            String test1 = "Addition of two numbers";
            int a = 5;
            int b = 3;
            int expectedResult = 8;
            Calculator calculator = new Calculator();
            int realResult = calculator.sum(3, 5);
            if (realResult == expectedResult) {
                System.out.println("(OK) " + test1);
            } else {
                System.out.println("(FAIL) " + test1);
            }
        }

        void subtractTest() {
            String test2 = "Subtraction of two numbers";
            int a = 9;
            int b = 5;
            int expectedResult = 4;
            Calculator calculator = new Calculator();
            int realResult = calculator.subtract(9, 5);
            if (realResult == expectedResult) {
                System.out.println("(OK) " + test2);
            } else {
                System.out.println("(FAIL) " + test2);
            }
        }

        void multiplyTest() {
            String test3 = "Multiplication of two numbers";
            int firstNumber = 5;
            int secondNumber = 5;
            int expectedResult = 25;
            Calculator calculator = new Calculator();
            int realResult = calculator.multiply(5, 5);
            if (realResult == expectedResult) {
                System.out.println("(OK) " + test3);
            } else {
                System.out.println("(FAIL) " + test3);
            }
        }

        void divideTest() {
            String test4 = "Division of two numbers";
            int firstNumber = 40;
            int secondNumber = 4;
            int expectedResult = 10;
            Calculator calculator = new Calculator();
            int realResult = calculator.divide(40, 4);
            if (realResult == expectedResult) {
                System.out.println("(OK) " + test4);
            } else {
                System.out.println("(FAIL) " + test4);
            }
        }

        void isEvenTest() {
            String test5 = "Is the number Even(no)";
            int number = 27;
            boolean expectedResult = false;
            Calculator calculator = new Calculator();
            boolean realResult = calculator.isEven(27);
            if (realResult == expectedResult) {
                System.out.println("(OK) " + test5);
            } else {
                System.out.println("(FAIL) " + test5);
            }
        }

        void isEvenTest2() {
            String test6 = "Is the number Even (yes)";
            int number = 2;
            boolean expectedResult = true;
            Calculator calculator = new Calculator();
            boolean realResult = calculator.isEven(2);
            if (realResult == expectedResult) {
                System.out.println("(OK) " + test6);
            } else {
                System.out.println("(FAIL) " + test6);
            }
        }

        void maxOfTwoNumbersTest1() {
            String test7 = "Max of two(1st)";
            int firstNumber = 6;
            int secondNumber = 3;
            int expectedResult =6 ;
            Calculator calculator = new Calculator();
            int realResult = calculator.maxOfTwoNumbers(6,3 );
            if (realResult == expectedResult) {
                System.out.println("(OK) " + test7);
            } else {
                System.out.println("(FAIL) " + test7);
            }
        }

        void maxOfTwoNumbersTest2() {
            String test8 = "Max of two(2nd)";
            int firstNumber = 2;
            int secondNumber = 4;
            int expectedResult = 4;
            Calculator calculator = new Calculator();
            int realResult = calculator.maxOfTwoNumbers(2, 4);
            if (realResult == expectedResult) {
                System.out.println("(OK) " + test8);
            } else {
                System.out.println("(FAIL) " + test8);
            }
        }

        void maxOfTwoNumbersTest3() {
            String test9 = "Max of two (1st;2nd)(equal)";
            int firstNumber = 5;
            int secondNumber = 5;
            int expectedResult = 5;
            Calculator calculator = new Calculator();
            int realResult = calculator.maxOfTwoNumbers(5, 5);
            if (realResult == expectedResult) {
                System.out.println("(OK) " + test9);
            } else {
                System.out.println("(FAIL) " + test9);
            }
        }

        void maxOfThreeNumbersTest1() {
            String test10 = "Max of three (1st)";
            int firstNumber = 9;
            int secondNumber = 7;
            int thirdNumber = 5;
            int expectedResult = 9;
            Calculator calculator = new Calculator();
            int realResult = calculator.maxOfThreeNumbers(9, 7, 5);
            if (realResult == expectedResult) {
                System.out.println("(OK) " + test10);
            } else {
                System.out.println("(FAIL) " + test10);
            }
        }
        void maxOfThreeNumbersTest2() {
            String test11 = "Max of three (2nd)";
            int firstNumber = 7;
            int secondNumber = 9;
            int thirdNumber = 5;
            int expectedResult = 9;
            Calculator calculator = new Calculator();
            int realResult = calculator.maxOfThreeNumbers(7, 9, 5);
            if (realResult == expectedResult) {
                System.out.println("(OK) " + test11);
            } else {
                System.out.println("(FAIL) " + test11);
            }
        }
        void maxOfThreeNumbersTest3() {
            String test12 = "Max of three (3rd)";
            int firstNumber = 3;
            int secondNumber = 5;
            int thirdNumber = 9;
            int expectedResult = 9;
            Calculator calculator = new Calculator();
            int realResult = calculator.maxOfThreeNumbers(3, 7, 9);
            if (realResult == expectedResult) {
                System.out.println("(OK) " + test12);
            } else {
                System.out.println("(FAIL) " + test12);
            }
        }
        void maxOfThreeNumbersTest4() {
            String test13 = "Max of three (1st;2nd)";
            int firstNumber = 9;
            int secondNumber = 9;
            int thirdNumber = 5;
            int expectedResult = 9;
            Calculator calculator = new Calculator();
            int realResult = calculator.maxOfThreeNumbers(9, 9, 5);
            if (realResult == expectedResult) {
                System.out.println("(OK) " + test13);
            } else {
                System.out.println("(FAIL) " + test13);
            }
        }
        void maxOfThreeNumbersTest5() {
            String test14 = "Max of three (2nd;3rd)";
            int firstNumber = 5;
            int secondNumber = 9;
            int thirdNumber = 9;
            int expectedResult = 9;
            Calculator calculator = new Calculator();
            int realResult = calculator.maxOfThreeNumbers(5, 9, 9);
            if (realResult == expectedResult) {
                System.out.println("(OK) " + test14);
            } else {
                System.out.println("(FAIL) " + test14);
            }
        }
        void maxOfThreeNumbersTest6() {
            String test15 = "Max of three (1st;3rd)";
            int firstNumber = 9;
            int secondNumber = 5;
            int thirdNumber = 9;
            int expectedResult = 9;
            Calculator calculator = new Calculator();
            int realResult = calculator.maxOfThreeNumbers(9, 5, 9);
            if (realResult == expectedResult) {
                System.out.println("(OK) " + test15);
            } else {
                System.out.println("(FAIL) " + test15);
            }
        }
        void maxOfThreeNumbersTest7() {
            String test16 = "Max of three (1st;2nd;3rd)(equal)";
            int firstNumber = 0;
            int secondNumber = 0;
            int thirdNumber = 0;
            int expectedResult = 0;
            Calculator calculator = new Calculator();
            int realResult = calculator.maxOfThreeNumbers(0, 0, 0);
            if (realResult == expectedResult) {
                System.out.println("(OK) " + test16);
            } else {
                System.out.println("(FAIL) " + test16);
            }
        }
    }
