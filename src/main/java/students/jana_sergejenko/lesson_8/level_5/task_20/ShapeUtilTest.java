package students.jana_sergejenko.lesson_8.level_5.task_20;

public class ShapeUtilTest {
    public static void main(String[] args) {

        ShapeUtil su = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shapes[0] = su.createRandomCircle();
        shapes[1] = su.createRandomSquare();
        shapes[2] = su.createRandomRectangle();
        shapes[3] = su.createRandomTriangle();
        System.out.println("=============PERIMETER======================");
        double perimeter=shapes[0].calculatePerimeter()+shapes[1].calculatePerimeter()+shapes[2].calculatePerimeter()+shapes[3].calculatePerimeter();

        System.out.println(shapes[0].calculatePerimeter());
        System.out.println(shapes[1].calculatePerimeter());
        System.out.println(shapes[2].calculatePerimeter());
        System.out.println(shapes[3].calculatePerimeter());

       double perimeter2=su.calculatePerimeter(shapes);
       System.out.println(perimeter2);
       System.out.println(perimeter);

        System.out.println("=======================AREA======================");
        System.out.println(shapes[0].calculateArea());
        System.out.println(shapes[1].calculateArea());
        System.out.println(shapes[2].calculateArea());
        System.out.println(shapes[3].calculateArea());
        double area=shapes[0].calculateArea()+shapes[1].calculateArea()+shapes[2].calculateArea()+shapes[3].calculateArea();
        System.out.println(area);
        double area2=su.calculateArea(shapes);
        System.out.println(area2);
    }
}
