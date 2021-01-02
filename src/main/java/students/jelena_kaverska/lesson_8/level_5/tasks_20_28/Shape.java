package students.jelena_kaverska.lesson_8.level_5.tasks_20_28;

abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

    public String getTitle() {
        return title;
    }
}