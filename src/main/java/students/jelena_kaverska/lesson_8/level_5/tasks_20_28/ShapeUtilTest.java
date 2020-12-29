package students.jelena_kaverska.lesson_8.level_5.tasks_20_28;

class ShapeUtilTest {
    ShapeUtil shapeUtil = new ShapeUtil();

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testTotalArea() {
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double exp = shapes[0].calculateArea() + shapes[1].calculateArea() + shapes[2].calculateArea() +
                shapes[3].calculateArea();
        double act = shapeUtil.calculateArea(shapes);
        System.out.println("Total area test: " + printResults(exp==act));
    }

    void testTotalPerimeter() {
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double exp = shapes[0].calculatePerimeter() + shapes[1].calculatePerimeter() + shapes[2].calculatePerimeter() +
                shapes[3].calculatePerimeter();
        double act = shapeUtil.calculatePerimeter(shapes);
        System.out.println("Total perimeter test: " + printResults(exp==act));
    }

    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.testTotalArea();
        test.testTotalPerimeter();
    }
}