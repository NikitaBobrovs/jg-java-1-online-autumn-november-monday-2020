package students.nikita_bobrovs.lesson_3.level_7.task_30;

public class Circle {
    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    void calculateArea(){
        System.out.println("Entered radius = "+radius);
        System.out.println("Area of this circle is "+radius*radius*Math.PI);}
}

class CircleDemo{
    public static void main(String[] args) {
        Circle testCircle = new Circle(4);
        testCircle.calculateArea();
    }
}
