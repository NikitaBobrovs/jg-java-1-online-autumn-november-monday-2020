package students.jana_sergejenko.lesson_8.level_5.task_20;
class Triangle extends Shape {

    private double base;
    private double height;
    private double side1;
    private double side2;


    Triangle(double base, double height, double side1, double side2) {
        super("Triangle");
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    double calculatePerimeter() {
        return side2 + side1 + base;
    }

}