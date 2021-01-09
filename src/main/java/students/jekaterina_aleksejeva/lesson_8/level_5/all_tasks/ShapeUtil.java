package students.jekaterina_aleksejeva.lesson_8.level_5.all_tasks;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        Random rnd = new Random();
        return new Circle(rnd.nextInt(5) + 1);
    }

    Square createRandomSquare() {
        Random rnd = new Random();
        return new Square(rnd.nextInt(4) + 1);
    }

    Rectangle createRandomRectangle() {
        Random rnd = new Random();
        return new Rectangle(rnd.nextInt(4) + 1, rnd.nextInt(5) + 1);
    }

    Triangle createRandomTriangle() {
        Random rnd = new Random();
        return new Triangle(rnd.nextInt(3) + 1);
    }

    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    double calculateArea(Shape[] shapes) {
        double sumAreas = 0;
        for (Shape shape : shapes) {
            sumAreas += shape.calculateArea();
        }
        return sumAreas;
    }

    double calculatePerimeter(Shape[] shapes) {
        double sumPerimeters = 0;
        for (Shape shape : shapes) {
            sumPerimeters += shape.calculatePerimeter();
        }
        return sumPerimeters;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}

class ShapeUtilDemo {

    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();

        Shape circle = shapeUtil.createRandomCircle();
        System.out.println("Circle calculator: ");
        double circleArea = shapeUtil.calculateArea(circle);
        System.out.println("Circle area = " + circleArea);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println("Circle perimeter = " + circlePerimeter);

        Shape triangle = shapeUtil.createRandomTriangle();
        System.out.println("Triangle calculator: ");
        double triangleArea = shapeUtil.calculateArea(triangle);
        System.out.println("Triangle area = " + triangleArea);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);
        System.out.println("Triangle perimeter = " + trianglePerimeter);
    }

}

class ShapeUtilTest {

    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.sumAreaCalculation();
        test.sumPerimeterCalculation();
    }

    boolean checkBooleanTest(double expectedResult, double actualResult) {

        return expectedResult == actualResult;
    }

    ShapeUtil shapeUtil = new ShapeUtil();

    void sumAreaCalculation() {
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

        if (checkBooleanTest(shapes[0].calculateArea() + shapes[1].calculateArea() + shapes[2].calculateArea() + shapes[3].calculateArea(), shapeUtil.calculateArea(shapes))) {
            System.out.println("For shapes array  sum of areas calculation test = PASS");
        } else {
            System.out.println("For shapes array  sum of areas calculation test = FAILED");
        }

    }

    void sumPerimeterCalculation() {
        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

        if (checkBooleanTest(shapes[0].calculatePerimeter() + shapes[1].calculatePerimeter() + shapes[2].calculatePerimeter() + shapes[3].calculatePerimeter(), shapeUtil.calculatePerimeter(shapes))) {
            System.out.println("For shapes array  sum of perimeters calculation test = PASS");
        } else {
            System.out.println("For shapes array  sum of perimeters calculation test = FAILED");
        }

    }
}
