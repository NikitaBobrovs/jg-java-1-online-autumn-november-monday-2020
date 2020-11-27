package students.nikita_bobrovs.lesson_4.level_7.task_24;

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

    boolean resultTestInt(int expectedResult, int realResult){
        return expectedResult == realResult;
    }
    boolean resultTestBoolean(boolean expectedResult, boolean realResult){
        return expectedResult == realResult;
    }

    public void sumTest() {
        System.out.print("Sum test : ");
        System.out.println(resultTestInt(75,new Calculator().sum(35,40)));
    }
    public void subTest() {
        System.out.print("Sub test : ");
        System.out.println(resultTestInt(20, new Calculator().sub(35,15)));
    }

    public void mulTest() {
        System.out.print("Mul Test : ");
        System.out.println(resultTestInt(25, new Calculator().mul(5,5)));
    }

    public void divTest() {
        System.out.print("Div Test : ");
        System.out.println(resultTestInt(5, new Calculator().div(40,8)));
    }

    public void isEvenTest1() {
        System.out.print("Is it even? Test even : ");
        System.out.println(resultTestBoolean(true,new Calculator().isEven(40)));
    }

    public void isEvenTest2() {
        System.out.print("Is it even? Test odd : ");
        System.out.println(resultTestBoolean(false,new Calculator().isEven(41)));
    }
}

