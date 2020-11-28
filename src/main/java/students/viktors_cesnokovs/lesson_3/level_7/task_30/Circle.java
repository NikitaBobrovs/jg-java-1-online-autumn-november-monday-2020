package students.viktors_cesnokovs.lesson_3.level_7.task_30;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return radius * radius * Math.PI;
    }
}



class CircleDemo{
    public static void main(String[] args) {
        Circle myCircle = new Circle(6.8);
        System.out.println("Area of a circle = " + myCircle.calculateArea());
    }
}








