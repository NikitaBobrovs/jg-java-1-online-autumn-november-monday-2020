package students.jana_sergejenko.lesson_8.level_5.task_20;

class Rectangle extends Shape {

    private double side1;
    private double side2;

    Rectangle(double side1, double side2) {
        super("Rectangle");
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (side1 + side2);
    }

}