package students.nikita_bobrovs.lesson_8.level_4.task_15;

class CircleTest {
    public static void main(String[] args) {
        CircleTest subject = new CircleTest();
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
        System.out.println("Calculate circle area test: " + testResult(doubleTester
                (28.27, new Circle(3).calculateArea())));
    }

    void calculatePerimeterTest() {
        System.out.println("Calculate circle perimeter test: " + testResult(doubleTester
                (18.85, new Circle(3).calculatePerimeter())));
    }
}
