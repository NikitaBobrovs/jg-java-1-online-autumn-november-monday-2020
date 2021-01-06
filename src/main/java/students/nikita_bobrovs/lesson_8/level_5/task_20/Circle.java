package students.nikita_bobrovs.lesson_8.level_5.task_20;

class Circle extends Shape {
    private int radius;

    Circle(String title, int radius) {
        super(title);
        this.radius = radius;
    }


    @Override
    double calculatePerimeter() {
        return Math.round(2 * Math.PI * radius * 100.0) / 100.0;
    }

    @Override
    double calculateArea() {
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0;
    }
}
