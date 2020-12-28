package students.jelena_kaverska.lesson_8.level_4.task_16_17_18_19;

class CircleTests {
    Circle circle = new Circle(10);

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testArea() {
        double exp = 314.16;
        double act = circle.calculateArea();
        System.out.println("Calculate area test: " + printResults(exp == act));
    }

    void testPerimeter() {
        double exp = 62.83;
        double act = circle.calculatePerimeter();
        System.out.println("Calculate perimeter test: " + printResults(exp == act));
    }

    public static void main(String[] args) {
        CircleTests tests = new CircleTests();
        tests.testArea();
        tests.testPerimeter();
    }
}