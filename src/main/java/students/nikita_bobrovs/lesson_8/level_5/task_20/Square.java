package students.nikita_bobrovs.lesson_8.level_5.task_20;

class Square extends Shape {
    private int side;

    Square(String title, int side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculatePerimeter() {
        return Math.round(side * 4 * 100.0) / 100.0;
    }

    @Override
    double calculateArea() {
        return Math.round(side * side * 100.0) / 100.0;
    }
}
