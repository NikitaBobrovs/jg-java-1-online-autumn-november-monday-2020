package students.nikita_bobrovs.lesson_8.level_5.task_20;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        return new Circle("circle", new Random().nextInt(10) + 1);
    }

    Square createRandomSquare() {
        return new Square("Square", new Random().nextInt(10) + 1);
    }

    Rectangle createRandomRectangle() {
        return new Rectangle("rectangle", new Random().nextInt(10) + 1,
                new Random().nextInt(10) + 1);
    }

    Triangle createRandomTriangle() {
        return new Triangle("triangle", new Random().nextInt(10) + 1);
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
        double totalArea = 0;
        for (Shape s : shapes) {
            totalArea += s.calculateArea();
        }
        return totalArea;
    }

    double calculatePerimeter(Shape[] shapes) {
        double totalPerimeter = 0;
        for (Shape s : shapes) {
            totalPerimeter += s.calculatePerimeter();
        }
        return totalPerimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
