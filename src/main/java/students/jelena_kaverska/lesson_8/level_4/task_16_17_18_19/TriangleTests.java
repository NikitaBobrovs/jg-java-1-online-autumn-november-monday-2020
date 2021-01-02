package students.jelena_kaverska.lesson_8.level_4.task_16_17_18_19;

class TriangleTests {
    Triangle triangle = new Triangle(12.55);

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testTriangleArea() {
        double exp = 68.20;
        double act = triangle.calculateArea();
        System.out.println("Calculate triangle area test: " + printResults(exp==act));
    }

    void testTrianglePerimeter() {
        double exp = 37.65;
        double act = triangle.calculatePerimeter();
        System.out.println("Calculate triangle perimeter test: " + printResults(exp==act));
    }


    public static void main(String[] args) {
        TriangleTests tests = new TriangleTests();
        tests.testTriangleArea();
        tests.testTrianglePerimeter();
    }
}