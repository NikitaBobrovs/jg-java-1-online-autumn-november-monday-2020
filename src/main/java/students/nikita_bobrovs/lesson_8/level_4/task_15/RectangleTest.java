package students.nikita_bobrovs.lesson_8.level_4.task_15;

class RectangleTest {
    public static void main(String[] args) {
        RectangleTest subject = new RectangleTest();
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
        System.out.println("Calculate rectangle area test: " + testResult(doubleTester
                (40.00, new Rectangle(5, 8).calculateArea())));
    }

    void calculatePerimeterTest() {
        System.out.println("Calculate rectangle perimeter test: " + testResult(doubleTester
                (10.00, new Rectangle(2, 3).calculatePerimeter())));
    }
}
