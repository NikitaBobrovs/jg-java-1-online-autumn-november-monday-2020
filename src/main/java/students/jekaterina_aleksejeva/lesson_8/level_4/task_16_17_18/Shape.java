package students.jekaterina_aleksejeva.lesson_8.level_4.task_16_17_18;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
