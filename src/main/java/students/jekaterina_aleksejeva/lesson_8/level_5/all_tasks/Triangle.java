package students.jekaterina_aleksejeva.lesson_8.level_5.all_tasks;

class Triangle extends Shape {

    private double length;

    Triangle(double length) {
        super ("Equilateral Triangle");
        this.length = length;
    }

    @Override
    double calculateArea() {
        return Math.round(Math.sqrt(3)/4 * length * length * 100.0)/100.0;
    }

    @Override
    double calculatePerimeter() {
        return Math.round(length * 3 * 100.0) / 100.0 ;
    }
}

class TriangleTest {

    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
        test.triangleAreaCalculation();
        test.triangleAreaCalculationSideLess1();
        test.trianglePerimeterCalculation();
        test.trianglePerimeterCalculationSideLess1();

    }

    boolean checkBooleanTest(double expectedResult, double actualResult) {
        return expectedResult == actualResult;
    }

    void triangleAreaCalculation() {
        Triangle triangle  = new Triangle(10);
        if (checkBooleanTest(43.3, triangle.calculateArea())) {
            System.out.println("For equilateral triangle  with side length 10  area calculation = PASS");
        } else {
            System.out.println("For equilateral triangle  with side length 10  area calculation = FAILED");
        }
    }

    void triangleAreaCalculationSideLess1() {
        Triangle triangle  = new Triangle(0.01);
        if (checkBooleanTest(0.00, triangle.calculateArea())) {
            System.out.println("For equilateral triangle  with side length 0.01  area calculation = PASS");
        } else {
            System.out.println("For equilateral triangle  with side length 0.01  area calculation = FAILED");
        }
    }

    void trianglePerimeterCalculation() {
        Triangle triangle  = new Triangle(3);
        if (checkBooleanTest(9, triangle.calculatePerimeter())) {
            System.out.println("For equilateral triangle  with side length 3  perimeter calculation = PASS");
        } else {
            System.out.println("For equilateral triangle  with side length 3  perimeter calculation = FAILED");
        }
    }

    void trianglePerimeterCalculationSideLess1() {
        Triangle triangle  = new Triangle(0.5);
        if (checkBooleanTest(1.5, triangle.calculatePerimeter())) {
            System.out.println("For equilateral triangle  with side length 0.5  perimeter calculation = PASS");
        } else {
            System.out.println("For equilateral triangle  with side length 0.5  perimeter calculation = FAILED");
        }
    }

}