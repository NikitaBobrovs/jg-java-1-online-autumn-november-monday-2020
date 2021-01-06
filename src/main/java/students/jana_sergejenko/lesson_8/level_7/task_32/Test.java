package students.jana_sergejenko.lesson_8.level_7.task_32;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.scenario1();
        test.scenario2();
    }

    public String checkResult(double result, double expected) {
        if (result == expected) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    public void scenario1() {
        Argument arg5 = new Argument(10);
        Argument arg6 = new Argument(5);
        MathOperation subtraction1 = new Subtraction(arg5, arg6);
        System.out.println("Right side Subtraction result = " + subtraction1.calculate());

        Argument arg7 = new Argument(20);
        Argument arg8 = new Argument(5);
        MathOperation division = new Division(arg7, arg8);
        System.out.println("Right side division result = " + division.calculate());

        MathOperation multiplication = new Multiplication(subtraction1, division);
        System.out.println("Final multiplication result = " + multiplication.calculate());
        double result = multiplication.calculate();
        double expected = 20.0;
        System.out.println("Result" + checkResult(result, expected));
    }

    public void scenario2() {
        Argument arg5 = new Argument(10);
        Argument arg6 = new Argument(5);
        MathOperation subtraction1 = new Subtraction(arg5, arg6);
        System.out.println("Right side Subtraction result = " + subtraction1.calculate());

        Argument arg7 = new Argument(20);
        Argument arg8 = new Argument(5);
        MathOperation division = new Division(arg7, arg8);
        System.out.println("Right side division result = " + division.calculate());

        MathOperation multiplication = new Multiplication(subtraction1, division);
        System.out.println("Final multiplication result = " + multiplication.calculate());
        double result = multiplication.calculate();
        double expected = 10.0;
        System.out.println("Result" + checkResult(result, expected));
    }
}