package students.darja_fedosova.lessons_2.level_3.task_10;

import java.util.Scanner;
public class Task_10 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radiusData = data.nextDouble();
        System.out.println("Perimeter is = " + 2 * Math.PI * radiusData );
        System.out.println("Area is = " + Math.PI * (radiusData*radiusData)); // может есть какая штучка которая
        // вводит сразу в квадрат (Метод Math.pow())
    }
}