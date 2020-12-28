package students.jana_sergejenko.lesson_8.level_4.task_15;

public class Demo {
    public static void main(String[] args) {

        Circle cir = new Circle(3);
        System.out.println("Area of circle is " + cir.calculateArea());
        System.out.println("Perimeter of circle is " + cir.calculatePerimeter());
        System.out.println("============================");

        Square sq = new Square(3);
        System.out.println("Area of square is " + sq.calculateArea());
        System.out.println("Perimeter of square is " + sq.calculatePerimeter());
        System.out.println("============================");

        Rectangle rc = new Rectangle(3, 4);
        System.out.println("Area of rectangle is " + rc.calculateArea());
        System.out.println("Perimeter of rectangle is " + rc.calculatePerimeter());
        System.out.println("============================");

        Triangle tr = new Triangle(3, 3, 6, 4);
        System.out.println("Area of triangle is " + tr.calculateArea());
        System.out.println("Perimeter of triangle is " + tr.calculatePerimeter());
        System.out.println("============================");
    }
}
