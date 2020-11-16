package instructor.lesson_3;

class PointDemo {

    public static void main(String[] args) {

        System.out.println("Point a:");
        Point a = new Point(1, 6);

        System.out.println("a.x = " + a.x);
        System.out.println("a.y = " + a.y);

        a.x = 3;
        a.y = 5;

        System.out.println("a.x = " + a.x);
        System.out.println("a.y = " + a.y);

        Point b = new Point(8);
        b.x = 10;
        b.y = 4;

        Point c = new Point();
        c.x = 8;
        c.y = 1;

    }

}

class Point {

    int x;
    int y;

    Point() {

    }

    Point(int coordinateX) {
        x = coordinateX;
    }

    Point(int coordinateX, int coordinateY) {
        x = coordinateX;
        y = coordinateY;
    }

}
