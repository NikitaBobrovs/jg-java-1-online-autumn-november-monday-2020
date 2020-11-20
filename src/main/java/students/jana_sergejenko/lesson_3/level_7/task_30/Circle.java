package students.jana_sergejenko.lesson_3.level_7.task_30;

public class Circle {
    double radius;
    double area;

    Circle(double radius) {
        this.radius = radius;
    }
    double calculateArea(){
        area = Math.PI * (radius * radius);
        return area;
    }
    void printArea() {
        System.out.println("Area: " + area);
    }
}
