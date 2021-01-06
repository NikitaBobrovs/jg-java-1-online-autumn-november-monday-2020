package students.nikita_bobrovs.lesson_8.level_5.task_20;

class Rectangle extends Shape {
    private int sideA, sideB;

    Rectangle(String title, int sideA, int sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculatePerimeter() {
        return Math.round(2 * (sideA + sideB) * 100.0) / 100.0;
    }

    @Override
    double calculateArea() {
        return Math.round(sideA * sideB * 100.0) / 100.0;
    }
}
