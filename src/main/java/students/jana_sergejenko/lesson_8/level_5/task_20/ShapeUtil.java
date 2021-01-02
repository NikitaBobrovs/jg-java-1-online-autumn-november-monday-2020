package students.jana_sergejenko.lesson_8.level_5.task_20;

import java.util.Random;

public class ShapeUtil {

    Circle createRandomCircle() {

        double randomNumber1 = new Random().nextDouble();
        /*Circle circle = new Circle(randomNumber1);*/
        Circle circle = new Circle(2);
        return circle;
    }

    Square createRandomSquare() {
        double randomNumber2 = new Random().nextDouble();
        // Square square = new Square(randomNumber2);
        Square square = new Square(2);
        return square;
    }

    Triangle createRandomTriangle() {
        double randomNumber3 = new Random().nextDouble();
        double randomNumber4 = new Random().nextDouble();
        double randomNumber5 = new Random().nextDouble();
        double randomNumber6 = new Random().nextDouble();
        //Triangle triangle = new Triangle(randomNumber3, randomNumber4, randomNumber5, randomNumber6);
        Triangle triangle = new Triangle(4, 2, 2, 2);
        return triangle;
    }

    Rectangle createRandomRectangle() {
        double randomNumber7 = new Random().nextDouble();
        double randomNumber8 = new Random().nextDouble();
        //Rectangle rectangle = new Rectangle(randomNumber7, randomNumber8);
        Rectangle rectangle = new Rectangle(4, 2);
        return rectangle;
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
        double area = 0.00;
        for (Shape shape : shapes) {
            area +=calculateArea(shape);
        }
        return area;
    }


    double calculatePerimeter(Shape[] shapes) {
        double perimeter = 0.00;
        for (Shape shape : shapes) {
            perimeter +=calculatePerimeter(shape);
        }
        return perimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

}
