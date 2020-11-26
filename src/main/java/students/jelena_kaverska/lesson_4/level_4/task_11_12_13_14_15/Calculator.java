package students.jelena_kaverska.lesson_4.level_4.task_11_12_13_14_15;

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
        if (a > b){
            return a;
        }
        return b;
    }

    int maxOfThreeNumbers(int a, int b, int c) {
        return maxOfTwoNumbers(maxOfTwoNumbers(a,b), c);
    }
}

class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.divide(15, 4));
        System.out.println(calc.isEven(5));
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

    static void sumTest() {
        String scenario = "20 + 30 = 50";
        int first = 20;
        int second = 30;
        int expectedSum = 50;
        int actualSum = new Calculator().sum(first, second);
        if (actualSum == expectedSum) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void subtractionTest() {
        String scenario = "4 - 8 = -4";
        int first = 4;
        int second = 8;
        int expectedResult = -4;
        int actualResult = new Calculator().subtract(first, second);
        if (actualResult == expectedResult) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void multiplicationTest() {
        String scenario = "5 x 11 = 55";
        int first = 5;
        int second = 11;
        int expectedResult = 55;
        int actualResult = new Calculator().multiply(first, second);
        if (actualResult == expectedResult) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void divisionTest() {
        String scenario = "15 / 4 = 3";
        int first = 15;
        int second = 4;
        int expectedResult = 3;
        int actualResult = new Calculator().divide(first, second);
        if (actualResult == expectedResult) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void evenTest() {
        String scenario = "Is number even: 10 -> yes";
        int number = 10;
        boolean expected = true;
        boolean actual = new Calculator().isEven(number);
        if (actual == expected) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void evenTest2() {
        String scenario = "Is number even: 17 -> no";
        int number = 17;
        boolean expected = false;
        boolean actual = new Calculator().isEven(number);
        if (actual == expected) {
            System.out.println("PASSED: " + scenario);
        } else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void firstMaxNumberTest() {
        String scenario = "Max number of 15, 10 -> 15";
        int first = 15;
        int second = 10;
        int expected = 15;
        int actual = new Calculator().maxOfTwoNumbers(first, second);
        if (actual == expected) {
            System.out.println("PASSED: " + scenario);
        }
        else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void secondMaxNumberTest() {
        String scenario = "Max number of 2, 7 -> 7";
        int first = 2;
        int second = 7;
        int expected = 7;
        int actual = new Calculator().maxOfTwoNumbers(first, second);
        if (actual == expected) {
            System.out.println("PASSED: " + scenario);
        }
        else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void bothEqualTest() {
        String scenario = "Max number of 3, 3 -> 3";
        int first = 3;
        int second = 3;
        int expected = 3;
        int actual = new Calculator().maxOfTwoNumbers(first, second);
        if (actual == expected) {
            System.out.println("PASSED: " + scenario);
        }
        else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void firstMaxFromThreeTest() {
        String scenario = "First - max number of 15, 10, 5 -> 15";
        int first = 15;
        int second = 10;
        int third = 5;
        int expected = 15;
        int actual = new Calculator().maxOfThreeNumbers(first, second, third);
        if (actual == expected) {
            System.out.println("PASSED: " + scenario);
        }
        else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void secondMaxFromThreeTest() {
        String scenario = "Second - max number of 15, 25, 5 -> 25";
        int first = 15;
        int second = 25;
        int third = 5;
        int expected = 25;
        int actual = new Calculator().maxOfThreeNumbers(first, second, third);
        if (actual == expected) {
            System.out.println("PASSED: " + scenario);
        }
        else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void thirdMaxFromThreeTest() {
        String scenario = "Third - max number of 15, 25, 88 -> 88";
        int first = 15;
        int second = 25;
        int third = 88;
        int expected = 88;
        int actual = new Calculator().maxOfThreeNumbers(first, second, third);
        if (actual == expected) {
            System.out.println("PASSED: " + scenario);
        }
        else {
            System.out.println("FAILED: " + scenario);
        }
    }

    //первые два равны и больше третьего
    static void firstEqualsSecondAndIsMax() {
        String scenario = "First equals second and is max number of 7, 7, 2 -> 7";
        int first = 7;
        int second = 7;
        int third = 2;
        int expected = 7;
        int actual = new Calculator().maxOfThreeNumbers(first, second, third);
        if (actual == expected) {
            System.out.println("PASSED: " + scenario);
        }
        else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void secondEqualsThirdAndIsMaxTest() {
        String scenario = "Second equals third and is max number of 5, 11, 11 -> 11";
        int first = 5;
        int second = 11;
        int third = 11;
        int expected = 11;
        int actual = new Calculator().maxOfThreeNumbers(first, second, third);
        if (actual == expected) {
            System.out.println("PASSED: " + scenario);
        }
        else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void firstEqualsThirdAndIsMaxTest() {
        String scenario = "First equals third and is max number of 5, 1, 5 -> 5";
        int first = 5;
        int second = 1;
        int third = 5;
        int expected = 5;
        int actual = new Calculator().maxOfThreeNumbers(first, second, third);
        if (actual == expected) {
            System.out.println("PASSED: " + scenario);
        }
        else {
            System.out.println("FAILED: " + scenario);
        }
    }

    static void allEqual() {
        String scenario = "All equal of -100, -100, -100 -> -100";
        int first = -100;
        int second = -100;
        int third = -100;
        int expected = -100;
        int actual = new Calculator().maxOfThreeNumbers(first, second, third);
        if (actual == expected) {
            System.out.println("PASSED: " + scenario);
        }
        else {
            System.out.println("FAILED: " + scenario);
        }
    }
}