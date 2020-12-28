package students.jelena_kaverska.lesson_8.level_4.task_16_17_18_19;

class RectangleTests {
    Rectangle rectangle = new Rectangle(15.99, 8.55);

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testArea() {
        double exp = 136.71;
        double act = rectangle.calculateArea();
        System.out.println(printResults(exp == act));
    }

    void testPerimeter() {
        double exp = 49.08;
        double act = rectangle.calculatePerimeter();
        System.out.println(printResults(exp == act));
    }

    public static void main(String[] args) {
        RectangleTests tests = new RectangleTests();
        tests.testArea();
        tests.testPerimeter();
    }
}