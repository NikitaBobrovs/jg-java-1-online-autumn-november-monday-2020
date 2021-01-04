package students.polina_ivashkevich.lesson_8.level_4.task_15;



abstract class Shape {

        private String title;


        Shape(String title) {
            this.title = title;
        }

    public Shape() {

    }

    abstract double calculateArea();

        abstract double calculatePerimeter();
    }
    class Cycle  extends Shape{
         Cycle (String title) {
             super(title);
         }
         private double radius;
            Cycle(double radius){
                super();
                this.radius = radius;

            }

        public Cycle() {

        }

        @Override
         double  calculateArea(){
                return Math.round(Math.PI *radius *radius*100.0) /100.0;

            }

         @Override
        double calculatePerimeter() {
             return Math.round(Math.PI * radius * 100.0) / 100.0;
         }
    }
class CycleTest{
    public static void main(String[] args) {
        Cycle figure = new Cycle();
        figure.calculateArea();
        figure.calculatePerimeter();

    }
    String testResult(boolean tester){
        return tester ? "OK" : "FALSE";
    }
    boolean doubleTester(double expectedResult, double realResult) {
        return expectedResult == realResult;
    }
        void calculateAreaTest() {
            System.out.println("Cycle area test :" + testResult(doubleTester(20.63,new Cycle(3.14).calculateArea())));
        }
        void calculatePerimeterTest() {
            System.out.println("Cycle perimeter test: "+ testResult(doubleTester(13.54, new Cycle(3.14).calculatePerimeter())));
    }
}
 class Square extends Shape {
    private double sideLength;
    Square(double sideLength){
        this.sideLength = sideLength;
    }


     @Override
     double calculateArea() {
        return Math.round(sideLength * sideLength * 100.0)/100.0;
     }

     @Override
     double calculatePerimeter() {
         return Math.round(sideLength * 4 * 100.0)/100.0;
     }
 }
 class SquareTest {
     public static void main(String[] args) {
         SquareTest figure = new SquareTest();
         figure.calculateAreaTest();
         figure.calculatePerimeterTest();
     }

     String testResult(boolean tester) {
         return tester ? "Ok" : "False";
     }

     boolean doubleTester(double expectedResult, double realResult) {
         return expectedResult == realResult;
     }

     void calculateAreaTest() {
         System.out.println("Square area test: " + testResult(doubleTester(16.00, new Square(4).calculateArea())));
     }

     void calculatePerimeterTest() {
         System.out.println("Square perimeter test:" + testResult(doubleTester(16.0, new Square(4).calculatePerimeter())));
     }
 }
     class Triangle extends Shape{
        private double side1 , side2, base, height;
        Triangle (double side1 ,double side2,double  base,double height) {
            this.side1 = side1;
            this.side2 = side2;
            this.base = base;
            this.height = 2 * (side1 +side2 +base)/base;

        }

         @Override
         double calculateArea() {
            return Math.round(height * base / 2 *100.0)/100.0;
         }

         @Override
         double calculatePerimeter() {
            return Math.round((side1 + side2 + base ) *100.0)/100.0;
         }


     }

class TriangleTest {
    public static void main(String[] args) {
        TriangleTest figure = new TriangleTest();
        figure.calculateAreaTest();
        figure.calculatePerimeterTest();
    }
    String testResult (boolean tester) {
        return tester ? "Ok" : "FALSE";
    }
    boolean doubleTester( double expectedResult,double realResult) {
        return expectedResult == realResult;
    }
    void calculateAreaTest() {
        System.out.println("Triangle area test: "+ testResult(doubleTester(3.75, new Triangle (3.0,3.0,3.0,2.5).calculateArea())));
    }
    void calculatePerimeterTest() {
        System.out.println("Triangle perimeter test: "+ testResult(doubleTester(9.0, new Triangle(3.0,3.0,3.0,2.5).calculatePerimeter())));
    }
}






