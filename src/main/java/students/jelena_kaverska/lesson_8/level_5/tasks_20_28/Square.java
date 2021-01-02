package students.jelena_kaverska.lesson_8.level_5.tasks_20_28;

class Square extends Shape{
    private double side;

    Square(String title, double side) {
        super(title);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    double calculateArea() {
        return Math.round(side * side * 100.0) / 100.0;
    }

    @Override
    double calculatePerimeter() {
        return Math.round(side * 4 * 100.0) / 100.0;
    }
}