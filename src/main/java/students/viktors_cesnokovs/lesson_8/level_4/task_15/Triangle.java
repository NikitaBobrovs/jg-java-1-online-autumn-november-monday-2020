package students.viktors_cesnokovs.lesson_8.level_4.task_15;

public class Triangle extends Shape {
    private double base, side1, side2, height;

    Triangle(double base, double side1, double side2) {
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
        this.height = 2 * (side1 + side2 + base) / base;
    }

    @Override
    double calculateArea() {
        return Math.round(height * base / 2 * 100.0) / 100.0;
    }

    @Override
    double calculatePerimeter() {
        return Math.round((side1 + base + side2) * 100.0) / 100.0;
    }
}
