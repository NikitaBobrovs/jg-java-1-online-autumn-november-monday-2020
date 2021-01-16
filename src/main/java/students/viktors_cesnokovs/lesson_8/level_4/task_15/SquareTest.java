package students.viktors_cesnokovs.lesson_8.level_4.task_15;

public class SquareTest {
    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.calculateArea();
        test.calculatePerimeter();
    }

    String result(boolean test) {
        if (test) {
            return "PASSED";
        } else
            return "FAILED";
    }

    boolean doubleTest(double expected, double real) { return expected == real; }

    void calculateArea() {
        System.out.println("Calculate area of a square : " + result(doubleTest
                (100.0, new Square(10).calculateArea())));
    }

    void calculatePerimeter() {
        System.out.println("Calculate perimeter of a square : " + result(doubleTest
                (40.0, new Square(10).calculatePerimeter())));
    }
}
