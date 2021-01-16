package students.viktors_cesnokovs.lesson_8.level_4.task_15;

public class CircleTest {
    public static void main(String[] args) {
        CircleTest test = new CircleTest();
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
        System.out.println("Calculate area of a circle : " + result(doubleTest
                (12.57, new Circle(2).calculateArea())));
    }

    void calculatePerimeter() {
        System.out.println("Calculate perimeter of a circle : " + result(doubleTest
                (12.57, new Circle(2).calculatePerimeter())));
    }
}
