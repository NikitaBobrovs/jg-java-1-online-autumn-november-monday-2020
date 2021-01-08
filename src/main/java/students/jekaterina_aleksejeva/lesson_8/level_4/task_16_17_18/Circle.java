package students.jekaterina_aleksejeva.lesson_8.level_4.task_16_17_18;

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0;
    }

    @Override
    double calculatePerimeter() {
        return Math.round(2 * Math.PI * radius * 100.0) / 100.0;
    }

}

class CircleTest {
    public static void main(String[] args) {
        CircleTest test =  new CircleTest();
        test.circleAreaCalculation();
        test.circleZeroAreaCalculation();
        test.circlePerimeterCalculation();
        test.circleZeroPerimeterCalculation();
    }

    boolean checkBooleanTest(double expectedResult, double actualResult) {
        return expectedResult == actualResult;
    }

    void circleAreaCalculation() {
        Circle circle = new Circle (1);
        if (checkBooleanTest(3.14, circle.calculateArea())) {
            System.out.println("For circle radius 1 area calculation = PASS");
        } else {
            System.out.println("For circle radius 1 area calculation = FAILED");
        }

    }

    void circleZeroAreaCalculation() {
        Circle circle = new Circle (0);
        if (checkBooleanTest(0, circle.calculateArea())) {
            System.out.println("For circle radius 0 area calculation = PASS");
        } else {
            System.out.println("For circle radius 0 area calculation = FAILED");
        }

    }

    void circlePerimeterCalculation() {
        Circle circle = new Circle (1);
        if (checkBooleanTest(6.28, circle.calculatePerimeter())) {
            System.out.println("For circle radius 1 perimeter calculation = PASS");
        } else {
            System.out.println("For circle radius 1 perimeter calculation = FAILED");
        }
    }

    void circleZeroPerimeterCalculation() {
        Circle circle = new Circle (0);
        if (checkBooleanTest(0, circle.calculatePerimeter())) {
            System.out.println("For circle radius 0 perimeter calculation = PASS");
        } else {
            System.out.println("For circle radius 0 perimeter calculation = FAILED");
        }
    }
}
