package instructor.lesson_8.shape;

class PolymorphismDemo {

    public static void main(String[] args) {

        Square square1 = new Square("Red", 2);
        Rectangle rectangle1 = new Rectangle("Yellow", 2, 3);

        printInfo(square1);
        printInfo(rectangle1);

    }

    public static void printInfo(Shape shape) {
        System.out.println("---");
        System.out.println("shape.color = " + shape.color);
        System.out.println("shape.perimeter() = " + shape.perimeter());
        System.out.println("shape.area() = " + shape.area());
    }
}

class AbstractDemo {

    public static void main(String[] args) {

        Square square1 = new Square("Red", 2);
        Square square2 = new Square("Blue", 6);

        System.out.println("square1.color = " + square1.color);
        System.out.println("square1.perimeter() = " + square1.perimeter());
        System.out.println("square1.area() = " + square1.area());

        System.out.println();
        System.out.println("square2.color = " + square2.color);
        System.out.println("square2.perimeter() = " + square2.perimeter());
        System.out.println("square2.area() = " + square2.area());

        Rectangle rectangle1 = new Rectangle("Yellow", 2, 3);
        Rectangle rectangle2 = new Rectangle("Green", 1, 5);

        System.out.println();
        System.out.println("rectangle1.color = " + rectangle1.color);
        System.out.println("rectangle1.perimeter() = " + rectangle1.perimeter());
        System.out.println("rectangle1.area() = " + rectangle1.area());

        System.out.println();
        System.out.println("rectangle2.color = " + rectangle2.color);
        System.out.println("rectangle2.perimeter() = " + rectangle2.perimeter());
        System.out.println("rectangle2.area() = " + rectangle2.area());

    }
}

abstract class Shape {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double perimeter();
    public abstract double area();
}

class Square extends Shape {

    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public double area() {
        return side * side;
    }

    public void resize() {

    }
}

class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public double area() {
        return width * height;
    }
}

