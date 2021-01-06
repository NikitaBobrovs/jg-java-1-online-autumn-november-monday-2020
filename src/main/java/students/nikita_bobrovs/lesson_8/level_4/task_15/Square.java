package students.nikita_bobrovs.lesson_8.level_4.task_15;

class Square extends Shape {
    private double sideLength;

    Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double calculateArea() {
        return Math.round(sideLength*sideLength * 100.0) / 100.0;
    }

    @Override
    double calculatePerimeter() {
        return Math.round(sideLength*4 * 100.0) / 100.0;
    }
}
