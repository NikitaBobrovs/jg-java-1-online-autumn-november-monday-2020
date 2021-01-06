package students.nikita_bobrovs.lesson_8.level_4.task_15;

class Triangle extends Shape {
    private double base, sideA, sideB, height;

    Triangle(double base, double sideA, double sideB) {
        this.base = base;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = 2 * (sideA + sideB + base) / base;
    }

    @Override
    double calculateArea() {
        return Math.round(height * base / 2 * 100.0) / 100.0;
    }

    @Override
    double calculatePerimeter() {
        return Math.round((sideA + base + sideB) * 100.0) / 100.0;
    }
}
