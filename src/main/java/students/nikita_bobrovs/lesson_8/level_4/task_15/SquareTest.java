package students.nikita_bobrovs.lesson_8.level_4.task_15;

class SquareTest {
    public static void main(String[] args) {
        SquareTest subject = new SquareTest();
        subject.calculateAreaTest();
        subject.calculatePerimeterTest();
    }

    String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }

    boolean doubleTester(double expectedResult, double realResult) {
        return expectedResult == realResult;
    }

    void calculateAreaTest() {
        System.out.println("Calculate square area test: " + testResult(doubleTester
                (25.00, new Square(5).calculateArea())));
    }

    void calculatePerimeterTest() {
        System.out.println("Calculate square perimeter test: " + testResult(doubleTester
                (20.00, new Square(5).calculatePerimeter())));
    }
}
