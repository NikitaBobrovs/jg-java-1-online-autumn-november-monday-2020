package students.jekaterina_aleksejeva.lesson_8.level_5.all_tasks;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
