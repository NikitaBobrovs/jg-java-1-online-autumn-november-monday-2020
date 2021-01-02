package students.jelena_kaverska.lesson_8.level_5.tasks_20_28;

class Rectangle extends Shape{
    private double length;
    private double width;

    Rectangle(String title, double length, double width) {
        super(title);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
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