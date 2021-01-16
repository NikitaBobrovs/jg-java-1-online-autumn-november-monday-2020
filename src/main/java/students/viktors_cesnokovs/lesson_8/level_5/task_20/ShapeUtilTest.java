package students.viktors_cesnokovs.lesson_8.level_5.task_20;

public class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.calculateArea();
        test.calculatePerimeter();
    }

    String result(double expected, double real) {
        if (expected == real) {
            return "PASSED";
        } else
            return "FAILED";
    }

    ShapeUtil shapeUtil = new ShapeUtil();

    Shape[] shapes() {
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        return shapes;
    }

    void calculateArea() {
        Shape[] shapes = shapes();
        double expected = shapes[0].calculateArea() + shapes[1].calculateArea() + shapes[2].calculateArea() +
                shapes[3].calculateArea();
        System.out.println("Area test : " + result(expected, shapeUtil.calculateArea(shapes)));
    }

    void calculatePerimeter() {
        Shape[] shapes = shapes();
        double expected = shapes[0].calculatePerimeter() + shapes[1].calculatePerimeter() +
                shapes[2].calculatePerimeter() + shapes[3].calculatePerimeter();
        System.out.println("Perimeter test :  " + result(expected, shapeUtil.calculatePerimeter(shapes)));
    }
}
