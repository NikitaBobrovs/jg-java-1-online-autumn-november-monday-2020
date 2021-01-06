package students.nikita_bobrovs.lesson_8.level_5.task_20;

class Triangle extends Shape {
    private int side;

    Triangle(String title, int side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculatePerimeter() {
        return Math.round(side * 3 * 100.0) / 100.0;
    }

    @Override
    double calculateArea() {
        return Math.round(Math.sqrt(3) * (side * side) / 4 * 100.0) / 100.0;
    }
}
