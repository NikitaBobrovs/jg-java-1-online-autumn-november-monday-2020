package students.viktors_cesnokovs.lesson_8.level_5.task_20;

import java.util.Random;

public class ShapeUtil {
    Circle createRandomCircle() {
        return new Circle(new Random().nextInt(50));
    }

    Square createRandomSquare() {
        return new Square(new Random().nextInt(50));
    }

    Rectangle createRandomRectangle() {
        return new Rectangle
                (new Random().nextInt(50), new Random().nextInt(50));
    }

    Triangle createRandomTriangle() {
        return new Triangle(new Random().nextInt(50));
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
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.calculateArea();
        }
        return area;
    }

    double calculatePerimeter(Shape[] shapes) {
        double perimeter = 0;
        for (Shape shape : shapes) {
            perimeter += shape.calculatePerimeter();
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
