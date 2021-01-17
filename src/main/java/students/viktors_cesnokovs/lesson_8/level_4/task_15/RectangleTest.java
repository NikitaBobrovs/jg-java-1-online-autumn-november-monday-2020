package students.viktors_cesnokovs.lesson_8.level_4.task_15;

public class RectangleTest {
    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
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
        System.out.println("Calculate area of a rectangle : " + result(doubleTest
                (50.0, new Rectangle(10, 5).calculateArea())));
    }

    void calculatePerimeter() {
        System.out.println("Calculate perimeter of a rectangle : " + result(doubleTest
                (40.0, new Rectangle(15, 5).calculatePerimeter())));
    }
}
