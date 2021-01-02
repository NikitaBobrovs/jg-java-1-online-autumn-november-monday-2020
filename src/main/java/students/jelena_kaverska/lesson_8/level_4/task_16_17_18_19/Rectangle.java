package students.jelena_kaverska.lesson_8.level_4.task_16_17_18_19;

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return Math.round(length * width * 100.0) / 100.0;
    }

    @Override
    double calculatePerimeter() {
        return Math.round(2 * (length + width) * 100.0) / 100.0;
    }
}