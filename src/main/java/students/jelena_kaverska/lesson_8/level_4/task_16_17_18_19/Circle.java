package students.jelena_kaverska.lesson_8.level_4.task_16_17_18_19;

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.round(radius * radius * Math.PI * 100.0) / 100.0;
    }

    @Override
    double calculatePerimeter() {
        return Math.round(2 * Math.PI * radius * 100.0) / 100.0;
    }
}