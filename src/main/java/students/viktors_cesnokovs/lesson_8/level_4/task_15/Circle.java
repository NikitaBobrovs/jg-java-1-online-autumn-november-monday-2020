package students.viktors_cesnokovs.lesson_8.level_4.task_15;

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0;
    }

    @Override
    double calculatePerimeter() {
        return Math.round(2 * Math.PI * radius * 100.0) / 100.0;
    }
}
