package students.jelena_kaverska.lesson_8.level_5.tasks_20_28;

class Circle extends Shape{
    private double radius;

    Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
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