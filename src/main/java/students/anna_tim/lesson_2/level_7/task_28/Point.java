package students.anna_tim.lesson_2.level_7.task_28;

class PointDemo{

    public static void main(String[] args) {

        Point a = new Point(3,5);
        System.out.println("Tochka a");
        System.out.println(a.x+", "+a.y);

        a.x = 3;
        a.y = 5;
        System.out.println("new a: " + a.x +", "+ a.y);

        Point b = new Point(5);
        System.out.println("Tochka b");
        System.out.println(b.x+", "+b.y);

        b.x = 10;
        b.y = 4;

        System.out.println("new b: " + b.x+", "+b.y);

        Point c = new Point();
        System.out.println("Tochka c");
        System.out.println(c.x+", "+c.y);

        c.x = 10;
        c.y = 4;

    }
}


class Point {
    int x;
    int y;

    Point() {

    }

    Point(int coordX) {
        x = coordX;
    }


    //moj ljubimij konstruktor
    Point(int coordX, int coordY) {
        x = 10; //x = coordX
        y = 5;  //y = coordY
    }


}
