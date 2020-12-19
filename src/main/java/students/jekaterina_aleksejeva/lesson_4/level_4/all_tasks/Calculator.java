package students.jekaterina_aleksejeva.lesson_4.level_4.all_tasks;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public int subtraction (int firstNumber, int secondNumber ) {
        return firstNumber - secondNumber;
    }
    public int division (int firstNumber, int secondNumber ) {
        return firstNumber / secondNumber;
    }
    public int multiplication (int firstNumber, int secondNumber ) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
        }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        return maxOfTwoNumbers(maxOfTwoNumbers(firstNumber,secondNumber), thirdNumber);
        }
}

class CalculatorTest {
    public static void main(String[]args){
        scenarioSumTest_1 ();
        scenarioSumTest_2();
        scenarioSumTest_3();
        scenarioSumTest_4();
        scenarioSumTest_5();
        scenarioSumTest_6();
        scenarioSubtractionTest_1();
        scenarioSubtractionTest_2();
        scenarioSubtractionTest_3();
        scenarioSubtractionTest_4();
        scenarioSubtractionTest_5();
        scenarioSubtractionTest_6();
        scenarioDivisionTest_1();
        scenarioDivisionTest_2();
        scenarioDivisionTest_3();
        scenarioDivisionTest_4();
        scenarioDivisionTest_5();
        scenarioDivisionTest_6();
        scenarioMultiplicationTest_1();
        scenarioMultiplicationTest_2();
        scenarioMultiplicationTest_3();
        scenarioMultiplicationTest_4();
        scenarioTrueEven();
        scenarioFalseEven();
        scenarioMaxOf_2_1();
        scenarioMaxOf_2_2();
        scenarioMaxOf2Equal();
        scenarioMaxOf_3_1();
        scenarioMaxOf_3_2 ();
        scenarioMaxOf_3_3();
        scenarioMaxOf_3_first2equal();
        scenarioMaxOf_3_first2equal_less();
        scenarioMaxOf_3_23equal();
        scenarioMaxOf_3_23equal_less();
        scenarioMaxOf_3_all_equal();
    }
    static void scenarioSumTest_1() {
        Calculator subject = new Calculator();
        String scenario = " = 9 + 10";
        int firstNumber = 9;
        int secondNumber = 10;
        int expectedResult = 19;
        int actualResult = subject.sum(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioSumTest_2() {
        Calculator subject = new Calculator();
        String scenario = " = -1 + 0";
        int firstNumber = -1;
        int secondNumber = 0;
        int expectedResult = -1;
        int actualResult = subject.sum(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult+ scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioSumTest_3() {
        Calculator subject = new Calculator();
        String scenario = " = 0 + 0";
        int firstNumber = 0;
        int secondNumber = 0;
        int expectedResult = 0;
        int actualResult = subject.sum(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult+ scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioSumTest_4() {
        Calculator subject = new Calculator();
        String scenario = " = -5 + (-5)";
        int firstNumber = -5;
        int secondNumber = -5;
        int expectedResult = -10;
        int actualResult = subject.sum(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult+ scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioSumTest_5() {
        Calculator subject = new Calculator();
        String scenario = " = 2147483646 + 1";
        int firstNumber = 2147483646;
        int secondNumber = 1;
        int expectedResult = 2147483647;
        int actualResult = subject.sum(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult+ scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioSumTest_6() {
        Calculator subject = new Calculator();
        String scenario = " = -2147483648 + 2147483647";
        int firstNumber = -2147483648;
        int secondNumber = 2147483647;
        int expectedResult = -1;
        int actualResult = subject.sum(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult+ scenario);
        } else {
            System.out.println("FAIL " + actualResult+ scenario);
        }
    }
    static void scenarioSubtractionTest_1() {
        Calculator subject = new Calculator();
        String scenario = " = 9 - 1";
        int firstNumber = 9;
        int secondNumber = 1;
        int expectedResult = 8;
        int actualResult = subject.subtraction(firstNumber,secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult + scenario);
        }
    }
    static void scenarioSubtractionTest_2() {
        Calculator subject = new Calculator();
        String scenario = " = 0 - 2147483647";
        int firstNumber = 0;
        int secondNumber = 2147483647;
        int expectedResult = -2147483647;
        int actualResult = subject.subtraction(firstNumber,secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult + scenario);
        }
    }
    static void scenarioSubtractionTest_3() {
        Calculator subject = new Calculator();
        String scenario = " = -5 - 20";
        int firstNumber = -5;
        int secondNumber = 20;
        int expectedResult = -25;
        int actualResult = subject.subtraction(firstNumber,secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult + scenario);
        }
    }
    static void scenarioSubtractionTest_4() {
        Calculator subject = new Calculator();
        String scenario = " = -1 - (-2147483648)";
        int firstNumber = -1;
        int secondNumber = -2147483648;
        int expectedResult = 2147483647;
        int actualResult = subject.subtraction(firstNumber,secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult + scenario);
        }
    }
    static void scenarioSubtractionTest_5() {
        Calculator subject = new Calculator();
        String scenario = " = 0 - 0";
        int firstNumber = 0;
        int secondNumber = 0;
        int expectedResult = 0;
        int actualResult = subject.subtraction(firstNumber,secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult + scenario);
        }
    }
    static void scenarioSubtractionTest_6() {
        Calculator subject = new Calculator();
        String scenario = " = 10 - 0";
        int firstNumber = 10;
        int secondNumber = 0;
        int expectedResult = 10;
        int actualResult = subject.subtraction(firstNumber,secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult + scenario);
        }
    }
    static void scenarioDivisionTest_1() {
        Calculator subject = new Calculator();
        String scenario = " = 25 / 5";
        int firstNumber = 25;
        int secondNumber = 5;
        int expectedResult = 5;
        int actualResult = subject.division(firstNumber,secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult + scenario);
        }
    }
    static void scenarioDivisionTest_2() {
        Calculator subject = new Calculator();
        String scenario = " = 0 / 1";
        int firstNumber = 0;
        int secondNumber = 1;
        int expectedResult = 0;
        int actualResult = subject.division(firstNumber,secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult + scenario);
        }
    }
    static void scenarioDivisionTest_3() {
        Calculator subject = new Calculator();
        String scenario = " = 0 / 2147483647";
        int firstNumber = 0;
        int secondNumber = 2147483647;
        int expectedResult = 0;
        int actualResult = subject.division(firstNumber,secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult + scenario);
        }
    }
    static void scenarioDivisionTest_4() {
        Calculator subject = new Calculator();
        String scenario = " = 2147483647 / 2147483647";
        int firstNumber = 2147483647;
        int secondNumber = 2147483647;
        int expectedResult = 1;
        int actualResult = subject.division(firstNumber,secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult + scenario);
        }
    }
    static void scenarioDivisionTest_5() {
        Calculator subject = new Calculator();
        String scenario = " = -2147483648 / (-2147483648)";
        int firstNumber = -2147483648;
        int secondNumber = -2147483648;
        int expectedResult = 1;
        int actualResult = subject.division(firstNumber,secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult + scenario);
        }
    }
    static void scenarioDivisionTest_6() {
        Calculator subject = new Calculator();
        String scenario = " = 2147483647 / (-1)";
        int firstNumber = 2147483647;
        int secondNumber = -1;
        int expectedResult = -2147483647;
        int actualResult = subject.division(firstNumber,secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult + scenario);
        }
    }
    static void scenarioMultiplicationTest_1() {
        Calculator subject = new Calculator();
        String scenario = " = 8 * 8 ";
        int firstNumber = 8;
        int secondNumber = 8;
        int expectedResult = 64;
        int actualResult = subject.multiplication(firstNumber,secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult + scenario);
        }
    }
    static void scenarioMultiplicationTest_2() {
        Calculator subject = new Calculator();
        String scenario = " = 2147483647 * 0 ";
        int firstNumber = 2147483647;
        int secondNumber = 0;
        int expectedResult = 0;
        int actualResult = subject.multiplication(firstNumber,secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult + scenario);
        }
    }
    static void scenarioMultiplicationTest_3() {
        Calculator subject = new Calculator();
        String scenario = " = - 2147483647 * (-1) ";
        int firstNumber = -2147483647;
        int secondNumber = -1;
        int expectedResult = 2147483647;
        int actualResult = subject.multiplication(firstNumber,secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult + scenario);
        }
    }

    static void scenarioMultiplicationTest_4() {
        Calculator subject = new Calculator();
        String scenario = " = 0 * (-2147483648) ";
        int firstNumber = 0;
        int secondNumber = -2147483648;
        int expectedResult = 0;
        int actualResult = subject.multiplication(firstNumber,secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + actualResult + scenario);
        } else {
            System.out.println("FAIL " + actualResult + scenario);
        }
    }

    static void scenarioMaxOf_2_1() {
        Calculator subject = new Calculator();
        String scenario = "10 and 5, max is 10";
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 10;
        int actualResult = subject.maxOfTwoNumbers(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }
    static void scenarioMaxOf_2_2() {
        Calculator subject = new Calculator ();
        String scenario = "1 and 100, max is 100";
        int firstNumber = 1;
        int secondNumber = 100;
        int expectedResult = 100;
        int actualResult = subject.maxOfTwoNumbers(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }
    static void scenarioMaxOf2Equal() {
        String scenario = "5 and 5, both are equal";
        Calculator subject = new Calculator ();
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 5;
        int actualResult = subject.maxOfTwoNumbers(firstNumber, secondNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }
    static void scenarioTrueEven() {
        Calculator subject = new Calculator ();
        String scenario = "8 is even";
        int number = 8;
        boolean expectedResult = true;
        boolean actualResult = subject.isEven(number);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }
    static void scenarioFalseEven() {
        Calculator subject = new Calculator ();
        String scenario = "3 is not even";
        int number = 3;
        boolean expectedResult = false;
        boolean actualResult = subject.isEven(number);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }
    static void scenarioMaxOf_3_1() {
        Calculator subject = new Calculator();
        String scenario = "100, 50 and 20, max is 100";
        int firstNumber = 100;
        int secondNumber = 50;
        int thirdNumber = 20;
        int expectedResult = 100;
        int actualResult = subject.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }
    static void scenarioMaxOf_3_2() {
        Calculator subject = new Calculator();
        String scenario = "2, 11 and 8, max is 11";
        int firstNumber = 2;
        int secondNumber = 11;
        int thirdNumber = 8;
        int expectedResult = 11;
        int actualResult = subject.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }
    static void scenarioMaxOf_3_3() {
        Calculator subject = new Calculator();
        String scenario = "16, 28 and 45, max is 45";
        int firstNumber = 16;
        int secondNumber = 28;
        int thirdNumber = 45;
        int expectedResult = 45;
        int actualResult = subject.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }
    static void scenarioMaxOf_3_first2equal() {
        Calculator subject = new Calculator();
        String scenario = "11, 11 and 7, max is 11";
        int firstNumber = 11;
        int secondNumber = 11;
        int thirdNumber = 7;
        int expectedResult = 11;
        int actualResult = subject.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }
    static void scenarioMaxOf_3_first2equal_less() {
        Calculator subject = new Calculator();
        String scenario = "9, 9 and 25, max is 25";
        int firstNumber = 9;
        int secondNumber = 9;
        int thirdNumber = 25;
        int expectedResult = 25;
        int actualResult = subject.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }
    static void scenarioMaxOf_3_23equal() {
        Calculator subject = new Calculator();
        String scenario = "8, 99 and 61, max is 99";
        int firstNumber = 8;
        int secondNumber = 99;
        int thirdNumber = 61;
        int expectedResult = 99;
        int actualResult = subject.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }
    static void scenarioMaxOf_3_23equal_less() {
        Calculator subject = new Calculator();
        String scenario = "65, 17 and 17, max is 65";
        int firstNumber = 65;
        int secondNumber = 17;
        int thirdNumber = 17;
        int expectedResult = 65;
        int actualResult = subject.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }
    static void scenarioMaxOf_3_all_equal() {
        Calculator subject = new Calculator();
        String scenario = "77, 77 and 77, all numbers are equal";
        int firstNumber = 77;
        int secondNumber = 77;
        int thirdNumber = 77;
        int expectedResult = 77;
        int actualResult = subject.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (expectedResult == actualResult) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }
}






