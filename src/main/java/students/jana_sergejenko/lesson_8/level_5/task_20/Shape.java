package students.jana_sergejenko.lesson_8.level_5.task_20;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }


    abstract double calculateArea();

    abstract double calculatePerimeter();

}

