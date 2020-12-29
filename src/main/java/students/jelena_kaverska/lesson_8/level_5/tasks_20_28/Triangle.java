package students.jelena_kaverska.lesson_8.level_5.tasks_20_28;

class Triangle extends Shape{
    private double side;

    Triangle(String title, double side) {
        super(title);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    double calculateArea() {
        return Math.round(((Math.sqrt(3) * side * side) / 4) * 100.0) / 100.0;
    }

    @Override
    double calculatePerimeter() {
        return Math.round((side * 3) * 100.0) / 100.0;
    }
}