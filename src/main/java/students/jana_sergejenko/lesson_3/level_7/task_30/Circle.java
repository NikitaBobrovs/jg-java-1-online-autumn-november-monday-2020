package students.jana_sergejenko.lesson_3.level_7.task_30;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    double calculateArea(){
        return Math.PI * (radius * radius);
    }
    void printArea() {
        System.out.println("Area: " + Math.PI * (radius * radius));
    }
}
