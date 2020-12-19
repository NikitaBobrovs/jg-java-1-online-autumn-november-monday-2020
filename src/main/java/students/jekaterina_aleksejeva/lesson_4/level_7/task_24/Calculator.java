package students.jekaterina_aleksejeva.lesson_4.level_7.task_24;

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

    boolean checkIntTest (int expectedResult, int actualResult){ return expectedResult == actualResult;}
    boolean checkBooleanTest (boolean expectedResult, boolean actualResult){ return expectedResult == actualResult;}

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    public void sumTest() {
        if (checkIntTest(75, new Calculator().sum(35, 40))) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void subTest() {
        if (checkIntTest(20, new Calculator().sub(35, 15))) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void mulTest() {
        if(checkIntTest(25, new Calculator().mul(5, 5))) {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }
    public void divTest() {
        if(checkIntTest(5, new Calculator().div(40, 8))) {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }

    public void isEvenTest1() {
        if(checkBooleanTest(true, new Calculator().isEven(40))) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }
    public void isEvenTest2() {
        if(checkBooleanTest(false, new Calculator().isEven(41))) {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = FAIL");
        }
    }
}


