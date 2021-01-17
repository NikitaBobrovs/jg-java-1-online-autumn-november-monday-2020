package students.viktors_cesnokovs.lesson_8.level_4.task_15;

public class TriangleTest {
    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
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
        System.out.println("Calculate area of a triangle : " + result(doubleTest
                (10, new Triangle(4, 4, 2).calculateArea())));
    }

    void calculatePerimeter() {
        System.out.println("Calculate perimeter of a triangle : " + result(doubleTest
                (10, new Triangle(4, 4, 2).calculatePerimeter())));
    }

}
