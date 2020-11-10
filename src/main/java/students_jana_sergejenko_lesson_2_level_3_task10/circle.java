package students_jana_sergejenko_lesson_2_level_3_task10;

import java.util.Scanner;

public class circle {
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

