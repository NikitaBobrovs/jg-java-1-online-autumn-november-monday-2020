package instructor.lesson_3;

class SquareDemo {

    public static void main(String[] args) {

        Square s1 = new Square(5);
        Square s2 = new Square(3);

        s1.printInfo();
        s2.printInfo();

        int s1Perimeter = s1.perimeter();
        int s1Area = s1.area();

        System.out.println("s1Perimeter = " + s1Perimeter);
        System.out.println("s1Area = " + s1Area);

        System.out.println("s2Perimeter = " + s2.perimeter());
        System.out.println("s2Area = " + s2.area());
    }
}

class Square {

    int side;

    Square(int side) {
        this.side = side;
    }

    int perimeter() {
        int p = side * 4;
        return p;
    }

    int area() {
        return side * side;
    }

    void printInfo() {
        System.out.println(" -= Square =- ");
        System.out.println("Legend: S - Side, P - Perimeter, A - Area");
        System.out.println("S = " + side);
        System.out.println("P = " + perimeter());
        System.out.println("A = " + area());
        System.out.println();
    }
}
