package students.nikita_bobrovs.lesson_3.level_7.task_30;

public class Circle {
    double radius;
    double area;

    Circle(double getRadius){
        this.radius = getRadius;
    }
    void calculateArea(){
        this.area = radius*radius*Math.PI;
        System.out.println("Entered radius = "+radius);
        System.out.println("Area of this circle is "+area);
    }
}

class CircleDemo{
    public static void main(String[] args) {
        Circle testCircle = new Circle(4);
        testCircle.calculateArea();
    }
}
