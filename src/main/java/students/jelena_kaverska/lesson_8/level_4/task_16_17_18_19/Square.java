package students.jelena_kaverska.lesson_8.level_4.task_16_17_18_19;

class Square extends Shape {
    private double side;

    Square(double side) {
        this.side = side;
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