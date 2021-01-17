package students.viktors_cesnokovs.lesson_8.level_5.task_20;

public class Triangle extends Shape {
    private int side;

    Triangle(int side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return Math.round(Math.sqrt(3) * (side * side) / 4 * 100.0) / 100.0;
    }

    @Override
    double calculatePerimeter() {
        return Math.round(side * 3 * 100.0) / 100.0;
    }
}
