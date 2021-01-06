package students.jelena_kaverska.lesson_8.level_7.task_32;

class MathOperationTests {
    MathOperation mathOperation;

    public String printResult(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    public void testSubtraction() {
        Argument first = new Argument(10);
        Argument second = new Argument(5);
        mathOperation = new Subtraction(first, second);
        double exp = 5;
        double act = mathOperation.calculate();
        System.out.println("Subtraction test: " + printResult(exp == act));
    }

    public void testDivision() {
        Argument first = new Argument(20);
        Argument second = new Argument(5);
        mathOperation = new Division(first, second);
        double exp = 4;
        double act = mathOperation.calculate();
        System.out.println("Division test: " + printResult(exp == act));
    }

    public void testMultiplication() {
        Argument first = new Argument(5);
        Argument second = new Argument(4);
        mathOperation = new Multiplication(first, second);
        double exp = 20;
        double act = mathOperation.calculate();
        System.out.println("Multiplication test: " + printResult(exp == act));
    }

    public static void main(String[] args) {
        MathOperationTests tests = new MathOperationTests();
        tests.testSubtraction();
        tests.testMultiplication();
        tests.testDivision();
    }
}