package students.polina_ivashkevich.lesson_3.level_7.task_30;

public class Circle {
    double pi = 3.14;
    double radius = 2.1;
    double area;
    public void calculateArea() {
        double area = pi* (radius+radius);
        System.out.println("Circle : ");
        System.out.println("pi : "+ pi);
        System.out.println("radius :" + radius);
        System.out.println("area :" + area);
    }

}
