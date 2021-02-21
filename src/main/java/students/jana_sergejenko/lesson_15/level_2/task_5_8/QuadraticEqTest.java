package students.jana_sergejenko.lesson_15.level_2.task_5_8;

public class QuadraticEqTest {
    public static void main(String[] args) {

        QuadraticEqTest test = new QuadraticEqTest();
        test.scenario1();
        test.scenario2();
        test.scenario3();
    }

    public String checkResult(String result, String expected) {
        if (result.equals(expected)) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    public void scenario1() {
        QuadraticEq test = new QuadraticEq();
        String result = test.calc(8,14,3);
        String expected="x1 = -1.5, x2 = -0.25";
        System.out.println("1st" + checkResult(result, expected));

    }
    public void scenario2() {
        QuadraticEq test = new QuadraticEq();
        String result = test.calc(8,1,3);
        String expected="Equation has no roots";
        System.out.println("2nd" + checkResult(result, expected));

    }
    public void scenario3() {
        QuadraticEq test = new QuadraticEq();
        String result = test.calc(1,2,1);
        String expected="x = -1.0";
        System.out.println("3rd" + checkResult(result, expected));

    }
}

