package students.jelena_kaverska.lesson_8.level_4.task_16_17_18_19;

class Triangle extends Shape {
    private double side;

    Triangle(double side) {
        this.side = side;
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