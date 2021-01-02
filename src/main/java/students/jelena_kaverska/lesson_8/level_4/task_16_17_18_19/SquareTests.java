package students.jelena_kaverska.lesson_8.level_4.task_16_17_18_19;

class SquareTests {
    Square square = new Square(10.5);

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testArea() {
        double exp = 110.25;
        double act = square.calculateArea();
        System.out.println("Calculate square area test: " + printResults(exp == act));
    }

    void testPerimeter() {
        double exp = 42;
        double act = square.calculatePerimeter();
        System.out.println("Calculate square perimeter test: " + printResults(exp == act));
    }

    public static void main(String[] args) {
        SquareTests tests = new SquareTests();
        tests.testArea();
        tests.testPerimeter();
    }
}
