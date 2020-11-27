package students.jelena_kaverska.lesson_4.level_7.task_24;

class Calculator {

    int sum(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }

    boolean isEven(int number) {
        return number % 2 == 0;
    }

    int maxOfTwoNumbers(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    int maxOfThreeNumbers(int a, int b, int c) {
        return maxOfTwoNumbers(maxOfTwoNumbers(a, b), c);
    }
}

class CalculatorTest {
    public static void main(String[] args) {
        sumTest();
        subtractionTest();
        multiplicationTest();
        divisionTest();
        evenTest();
        evenTest2();
        firstMaxNumberTest();
        secondMaxNumberTest();
        bothEqualTest();
        firstMaxFromThreeTest();
        secondMaxFromThreeTest();
        thirdMaxFromThreeTest();
        firstEqualsSecondAndIsMax();
        secondEqualsThirdAndIsMaxTest();
        firstEqualsThirdAndIsMaxTest();
        allEqual();
    }

    static boolean checkResult(int actual, int expected) {
        return actual == expected;
    }

    static boolean checkResult(boolean actual, boolean expected) {
        return actual == expected;
    }

    static String print(boolean result) {
        if (result) {
            return "PASSED";
        }
        return "FAILED";
    }

    static void sumTest() {
        String scenario = "20 + 30 = 50 -> ";
        int expected = 50;
        int actual = new Calculator().sum(20, 30);
        System.out.println(scenario + print(checkResult(actual, expected)));
    }

    static void subtractionTest() {
        String scenario = "4 - 8 = -4 -> ";
        int first = 4;
        int second = 8;
        int expected = -4;
        int actual = new Calculator().subtract(first, second);
        System.out.println(scenario + print(checkResult(actual, expected)));
    }

    static void multiplicationTest() {
        String scenario = "5 x 11 = 55 -> ";
        int first = 5;
        int second = 11;
        int expected = 55;
        int actual = new Calculator().multiply(first, second);
        System.out.println(scenario + print(checkResult(actual, expected)));
    }

    static void divisionTest() {
        String scenario = "15 / 4 = 3 -> ";
        int first = 15;
        int second = 4;
        int expected = 3;
        int actual = new Calculator().divide(first, second);
        System.out.println(scenario + print(checkResult(actual, expected)));
    }

    static void evenTest() {
        String scenario = "even: 10 -> ";
        int number = 10;
        boolean expected = true;
        boolean actual = new Calculator().isEven(number);
        System.out.println(scenario + print(checkResult(actual, expected)));
    }

    static void evenTest2() {
        String scenario = "odd: 17 -> ";
        int number = 17;
        boolean expected = false;
        boolean actual = new Calculator().isEven(number);
        System.out.println(scenario + print(checkResult(actual, expected)));
    }

    static void firstMaxNumberTest() {
        String scenario = "Max of 15, 10: 15 -> ";
        int first = 15;
        int second = 10;
        int expected = 15;
        int actual = new Calculator().maxOfTwoNumbers(first, second);
        System.out.println(scenario + print(checkResult(actual, expected)));
    }

    static void secondMaxNumberTest() {
        String scenario = "Max of 2, 7: 7 -> ";
        int first = 2;
        int second = 7;
        int expected = 7;
        int actual = new Calculator().maxOfTwoNumbers(first, second);
        System.out.println(scenario + print(checkResult(actual, expected)));
    }

    static void bothEqualTest() {
        String scenario = "Max of 3, 3: 3 -> ";
        int first = 3;
        int second = 3;
        int expected = 3;
        int actual = new Calculator().maxOfTwoNumbers(first, second);
        System.out.println(scenario + print(checkResult(actual, expected)));
    }

    static void firstMaxFromThreeTest() {
        String scenario = "First - max of 15, 10, 5:  15 -> ";
        int first = 15;
        int second = 10;
        int third = 5;
        int expected = 15;
        int actual = new Calculator().maxOfThreeNumbers(first, second, third);
        System.out.println(scenario + print(checkResult(actual, expected)));
    }

    static void secondMaxFromThreeTest() {
        String scenario = "Second - max of 15, 25, 5: 25 -> ";
        int first = 15;
        int second = 25;
        int third = 5;
        int expected = 25;
        int actual = new Calculator().maxOfThreeNumbers(first, second, third);
        System.out.println(scenario + print(checkResult(actual, expected)));
    }

    static void thirdMaxFromThreeTest() {
        String scenario = "Third - max of 15, 25, 88: 88 -> ";
        int first = 15;
        int second = 25;
        int third = 88;
        int expected = 88;
        int actual = new Calculator().maxOfThreeNumbers(first, second, third);
        System.out.println(scenario + print(checkResult(actual, expected)));
    }

    static void firstEqualsSecondAndIsMax() {
        String scenario = "First=second and is max of 7, 7, 2: 7 -> ";
        int first = 7;
        int second = 7;
        int third = 2;
        int expected = 7;
        int actual = new Calculator().maxOfThreeNumbers(first, second, third);
        System.out.println(scenario + print(checkResult(actual, expected)));
    }

    static void secondEqualsThirdAndIsMaxTest() {
        String scenario = "Second=third and is max of 5, 11, 11: 11 -> ";
        int first = 5;
        int second = 11;
        int third = 11;
        int expected = 11;
        int actual = new Calculator().maxOfThreeNumbers(first, second, third);
        System.out.println(scenario + print(checkResult(actual, expected)));
    }

    static void firstEqualsThirdAndIsMaxTest() {
        String scenario = "First=third and is max of 5, 1, 5: 5 -> ";
        int first = 5;
        int second = 1;
        int third = 5;
        int expected = 5;
        int actual = new Calculator().maxOfThreeNumbers(first, second, third);
        System.out.println(scenario + print(checkResult(actual, expected)));
    }

    static void allEqual() {
        String scenario = "All equal -> ";
        int first = -100;
        int second = -100;
        int third = -100;
        int expected = -100;
        int actual = new Calculator().maxOfThreeNumbers(first, second, third);
        System.out.println(scenario + print(checkResult(actual, expected)));
    }
}