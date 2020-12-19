package students.anna_tim.lesson_2.level_7.task_28;

class DemoSquare {
    public static void main(String[] args) {

        Square s1 = new Square(5);
        Square s2 = new Square(3);

        s1.printInfo();

        int s1Perimeter = s1.perimeter();

        System.out.println("s1Perimeter = " + s1Perimeter);
        System.out.println("s2Perimeter = " + s2.perimeter());
    }

}

public class Square {

    int side;

    Square(int side) {
        this.side= side;
    }

    int perimeter() {
        int p = side * 4;
        return p; //znachenie p my vozvraschaem kak rezuljtat vypolnenija metoda
    }

    void printInfo(){

        System.out.println("Legend: S - Side, P - Perimeter");
        System.out.println("S = "+ side);
        System.out.println("P = " + perimeter());
    }

}
