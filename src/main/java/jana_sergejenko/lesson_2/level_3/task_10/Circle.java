package jana_sergejenko.lesson_2.level_3.task_10;

import java.util.Scanner;

public class Circle {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Radius: ");
        double radius = sc.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("Area is: " + area);
        double circumference= Math.PI * 2*radius;
        System.out.println( "Perimeter is:"+circumference) ;
    }
}

