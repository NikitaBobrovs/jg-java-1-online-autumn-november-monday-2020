package students.jekaterina_aleksejeva.lesson_8.level_5.all_tasks;

class Square extends Shape {

    private double sLength;

    Square(double sLength) {
        super("Square");
        this.sLength = sLength;
    }

    @Override
    double calculateArea() {
        return Math.round(sLength * sLength * 100.0) / 100.0;
    }

    @Override
    double calculatePerimeter() {
        return Math.round(sLength * 4 * 100.0) / 100.0;
    }

}

class SquareTest {

    public static void main(String[] args) {
        SquareTest test =  new SquareTest();
        test.squareAreaCalculation();
        test.squareAreaCalculationSideLess1();
        test.squarePerimeterCalculation();
        test.squarePerimeterCalculationSideLess1();
    }

    boolean checkBooleanTest(double expectedResult, double actualResult) {
        return expectedResult == actualResult;
    }

    void squareAreaCalculation() {
        Square square = new Square (5);
        if (checkBooleanTest(25, square.calculateArea())) {
            System.out.println("For square with side length 5 area calculation = PASS");
        } else {
            System.out.println("For square with side length 5 area calculation = FAILED");
        }

    }

    void squareAreaCalculationSideLess1() {
        Square square = new Square (0.5);
        if (checkBooleanTest(0.25, square.calculateArea())) {
            System.out.println("For square with side length 0.5 area calculation = PASS");
        } else {
            System.out.println("For square with side length 0.5 are calculation = FAILED");
        }

    }

    void squarePerimeterCalculation() {
        Square square = new Square (2);
        if (checkBooleanTest(8, square.calculatePerimeter())) {
            System.out.println("For square with side length 2 perimeter calculation = PASS");
        } else {
            System.out.println("For square with side length 2 perimeter calculation = FAILED");
        }
    }

    void squarePerimeterCalculationSideLess1() {
        Square square = new Square (0.05);
        if (checkBooleanTest(0.2, square.calculatePerimeter())) {
            System.out.println("For square with side length 0.05 perimeter calculation = PASS");
        } else {
            System.out.println("For square with side length 0.05 perimeter calculation = FAILED");
        }
    }
}

