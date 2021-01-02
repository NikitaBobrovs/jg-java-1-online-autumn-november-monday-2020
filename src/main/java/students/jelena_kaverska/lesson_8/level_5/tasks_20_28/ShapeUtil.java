package students.jelena_kaverska.lesson_8.level_5.tasks_20_28;

import java.util.Random;

class ShapeUtil {

    //Task 20: Этот метод создаёт круг со случайным радиусом.
    Circle createRandomCircle() {
        Random random = new Random();
        return new Circle("circle", random.nextInt(10) + 1);
    }

    //Task 21: Этот метод создаёт квадрат со случайно выбранной длиной стороны.
    Square createRandomSquare() {
        Random random = new Random();
        return new Square("square", random.nextInt(10) + 1);
    }

    //Task 22: Этот метод создаёт прямоугольник со случайно выбранными сторонами.
    Rectangle createRandomRectangle() {
        Random random = new Random();
        return new Rectangle("rectangle", random.nextInt(10) + 1, random.nextInt(10) + 1);
    }

    //Task 23: Этот метод создаёт равносторонний треугольник со случайно выбранной длиной стороны.
    Triangle createRandomTriangle() {
        Random random = new Random();
        return new Triangle("triangle", random.nextInt(10) + 1);
    }

    //Task 24: Этот метод создаёт случайную геометрическую фигуру.
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

    //Task 25: Этот метод расчитывает общую площадь геометрических фигур из массива.
    double calculateArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    //Task 26: Этот метод расчитывает общий периметр геометрических фигур из массива.
    double calculatePerimeter(Shape[] shapes) {
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }
        return totalPerimeter;
    }

    //Task 27
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

        //Task 27 demo
        Shape circle = shapeUtil.createRandomCircle();
        System.out.println("random circle calcs: ");
        System.out.println("Circle area: " + shapeUtil.calculateArea(circle));
        System.out.println("Circle perimeter: " + shapeUtil.calculatePerimeter(circle));
        System.out.println("------------------------------");

        Shape rectangle = shapeUtil.createRandomRectangle();
        System.out.println("random rectangle calcs: ");
        System.out.println("Rectangle area: " + shapeUtil.calculateArea(rectangle));
        System.out.println("Rectangle perimeter: " + shapeUtil.calculatePerimeter(rectangle));
        System.out.println("------------------------------");

        Shape square = shapeUtil.createRandomSquare();
        System.out.println("random square calcs: ");
        System.out.println("Square area: " + shapeUtil.calculateArea(square));
        System.out.println("Square perimeter: " + shapeUtil.calculatePerimeter(square));
        System.out.println("------------------------------");

        Shape triangle = shapeUtil.createRandomSquare();
        System.out.println("random triangle calcs: ");
        System.out.println("Triangle area: " + shapeUtil.calculateArea(triangle));
        System.out.println("Triangle perimeter: " + shapeUtil.calculatePerimeter(triangle));
        System.out.println("------------------------------");

        System.out.println("random shape calcs");
        Shape randomShape = shapeUtil.createRandomShape();
        System.out.println("random shape is: " + randomShape.getTitle());
        System.out.println("random shape area: " + shapeUtil.calculateArea(randomShape)
                + " perimeter: " + shapeUtil.calculatePerimeter(randomShape));
    }
}

class MyShapesDemo {

    public static void main(String[] args) {
        ShapeUtil s = new ShapeUtil();

        Shape myRandom = s.createRandomShape();
        System.out.println("random shape title: " + myRandom.getTitle());

        Circle randomCircle = s.createRandomCircle();
        System.out.println("Random circle radius: " + randomCircle.getRadius());

        Shape[] shapes = {new Circle("circle", 10),
                new Square("square", 10),
                new Rectangle("rectangle", 10, 15),
                new Triangle("triangle", 4)};

        System.out.println(new Circle("circle", 10).calculateArea());
        System.out.println(new Square("square", 10).calculateArea());
        System.out.println(new Rectangle("rectangle", 10, 15).calculateArea());
        System.out.println(new Triangle("triangle", 4).calculateArea());

        System.out.println("total area: " + s.calculateArea(shapes));


        System.out.println(new Circle("circle", 10).calculatePerimeter());
        System.out.println(new Square("square", 10).calculatePerimeter());
        System.out.println(new Rectangle("rectangle", 10, 15).calculatePerimeter());
        System.out.println(new Triangle("triangle", 4).calculatePerimeter());

        System.out.println("total perimeter: " + s.calculatePerimeter(shapes));
    }
}