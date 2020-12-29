package students.jana_sergejenko.lesson_8.level_5.task_20;

public class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        System.out.println("======CIRCLE==========");
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        System.out.println(circleArea);
        System.out.println(circlePerimeter);
        System.out.println("=======SQUARE============");

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);
        System.out.println(squareArea);
        System.out.println(squarePerimeter);
    }

}