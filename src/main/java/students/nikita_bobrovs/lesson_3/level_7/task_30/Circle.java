package students.nikita_bobrovs.lesson_3.level_7.task_30;

public class Circle {
    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    double calculateArea(){
        return radius*radius*Math.PI;
        }
}

class CircleDemo{
    public static void main(String[] args) {
        Circle testCircle = new Circle(4);
        testCircle.calculateArea();
        System.out.println("Radius is :"+testCircle.calculateArea());
    }
}
