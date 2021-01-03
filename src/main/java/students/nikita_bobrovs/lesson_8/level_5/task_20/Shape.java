package students.nikita_bobrovs.lesson_8.level_5.task_20;

abstract class Shape {
    private String title;

    public String getTitle() {
        return title;
    }

    Shape(String title) {
        this.title = title;
    }

    abstract double calculatePerimeter();

    abstract double calculateArea();
}
