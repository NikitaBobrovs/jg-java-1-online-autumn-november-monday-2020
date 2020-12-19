package students.polina_ivashkevich.lesson_2.level_3.task_10;

import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number for r: ");
        double r=scanner.nextDouble();
        System.out.println("Enter pi : ");
        double pi= scanner.nextDouble();
        double p= r*pi*pi;
        System.out.println(p+" Периметр круга");
        double s = pi*r*r;
        System.out.println(s + " Площадь круга");

    }
}
