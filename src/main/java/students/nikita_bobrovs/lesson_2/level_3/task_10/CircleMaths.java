package students.nikita_bobrovs.lesson_2.level_3.task_10;


import java.util.Scanner;

public class CircleMaths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("PLease enter radius :");
        double rad = scan.nextDouble();
        double perimeter = 2*Math.PI*rad;
        double area = Math.PI*(rad*rad);
        System.out.println("Perimeter is : "+perimeter);
        System.out.println("Area is : "+area);

    }
}

