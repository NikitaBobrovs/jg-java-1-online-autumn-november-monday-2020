package students.nikita_bobrovs.lesson_8.level_4.task_15;

class TriangleTest {
    public static void main(String[] args) {
        TriangleTest subject = new TriangleTest();
        subject.calculateAreaTest();
        subject.calculatePerimeterTest();
    }
    String testResult(boolean tester){
        return tester ? "OK" : "FAIL";
    }
    boolean doubleTester(double expectedResult, double realResult){
        return expectedResult == realResult;
    }

    void calculateAreaTest() {
        System.out.println("Calculate triangle area test: " + testResult(doubleTester
                (14.00, new Triangle(5,4,5).calculateArea())));
    }

    void calculatePerimeterTest() {
        System.out.println("Calculate triangle perimeter test: " + testResult(doubleTester
                (14.00, new Triangle(5,4,5).calculatePerimeter())));
    }
}