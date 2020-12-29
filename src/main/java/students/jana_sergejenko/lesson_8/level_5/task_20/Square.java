package students.jana_sergejenko.lesson_8.level_5.task_20;

public class Square extends Shape {
    private double side;

    Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return side * 4;
    }
}