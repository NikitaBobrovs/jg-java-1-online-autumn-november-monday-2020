package students.nikita_bobrovs.lesson_8.level_5.task_20;

class ShapeUtilTest {
    public static void main(String[] args) {
        ShapeUtilTest subject = new ShapeUtilTest();
        subject.calculateArrayAreaTest();
        subject.calculateArrayPerimeter();
    }

    String testResults(double expectedResult, double realResult) {
        return expectedResult == realResult ? "OK" : "FAIL";
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

    void calculateArrayAreaTest() {
        Shape[] shapes = shapes();
        double expectedResult = shapes[0].calculateArea() + shapes[1].calculateArea() +
                shapes[2].calculateArea() + shapes[3].calculateArea();
        System.out.println("Array area test : " + testResults(expectedResult, shapeUtil.calculateArea(shapes)));
    }

    void calculateArrayPerimeter() {
        Shape[] shapes = shapes();
        double expectedResult = shapes[0].calculatePerimeter() + shapes[1].calculatePerimeter() +
                shapes[2].calculatePerimeter() + shapes[3].calculatePerimeter();
        System.out.println("Array perimeter test : " + testResults(expectedResult, shapeUtil.calculatePerimeter(shapes)));
    }
}
