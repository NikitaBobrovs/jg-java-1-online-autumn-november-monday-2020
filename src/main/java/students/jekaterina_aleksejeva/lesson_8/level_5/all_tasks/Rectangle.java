package students.jekaterina_aleksejeva.lesson_8.level_5.all_tasks;

class Rectangle extends Shape {

    private double aLength;
    private double bLength;

    Rectangle (double aLength, double bLength) {
        super("Rectangle");
        this.aLength = aLength;
        this.bLength = bLength;
    }

    @Override
    double calculateArea() {
        return Math.round(aLength * bLength * 100.0) / 100.0;
    }

    @Override
    double calculatePerimeter() {
        return Math.round((aLength + bLength) * 2 * 100.0) / 100.0;
    }

}

class RectangleTest {
    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.rectangleAreaCalculation();
        test.rectangleAreaCalculationOneSideLess1();
        test.rectangleAreaCalculationAnotherSideLess1();
        test.rectanglePerimeterCalculation();
        test.rectanglePerimeterCalculationBothSidesLess1();
    }

    boolean checkBooleanTest(double expectedResult, double actualResult) {
        return expectedResult == actualResult;
    }

    void rectangleAreaCalculation() {
        Rectangle rectangle = new Rectangle(1,2);
        if (checkBooleanTest(2, rectangle.calculateArea())) {
            System.out.println("For rectangle with a length 1 and b length 2 area calculation = PASS");
        } else {
            System.out.println("For rectangle with a length 1 and b length 2 area calculation = FAILED");
        }

    }

    void rectangleAreaCalculationOneSideLess1() {
        Rectangle rectangle = new Rectangle(10,0.1);
        if (checkBooleanTest(1, rectangle.calculateArea())) {
            System.out.println("For rectangle with a length 10 and b length 0.1 area calculation = PASS");
        } else {
            System.out.println("For rectangle with a length 10 and b length 0.1 area calculation = FAILED");
        }

    }

    void rectangleAreaCalculationAnotherSideLess1() {
        Rectangle rectangle = new Rectangle(0.01,11);
        if (checkBooleanTest(0.11, rectangle.calculateArea())) {
            System.out.println("For rectangle with a length 0.01 and b length 11 area calculation = PASS");
        } else {
            System.out.println("For rectangle with a length 0.01 and b length 11 area calculation = FAILED");
        }

    }

    void rectanglePerimeterCalculation() {
        Rectangle rectangle = new Rectangle(5,4);
        if (checkBooleanTest(18, rectangle.calculatePerimeter())) {
            System.out.println("For rectangle with a length 5 and b length 4 area calculation = PASS");
        } else {
            System.out.println("For rectangle with a length 5 and b length 4 area calculation = FAILED");
        }
    }

    void rectanglePerimeterCalculationBothSidesLess1() {
        Rectangle rectangle = new Rectangle(0.02,0.3);
        if (checkBooleanTest(0.64, rectangle.calculatePerimeter())) {
            System.out.println("For rectangle with a length 0.02 and b length 0.3 area calculation = PASS");
        } else {
            System.out.println("For rectangle with a length 0.02 and b length 0.3 area calculation = FAILED");
        }

    }
}
