package instructor.lesson_5;

import java.util.Arrays;

public class ArrayDemo1 {

    public static void main(String[] args) {

        //Product product1 = new Product(); ...
        //Product product2 = new Product();

        // Product[] products = new Product[100];
        // products[0] =

        int[] forecast = new int[24];
        forecast[0] = 3;
        forecast[1] = 2;
        forecast[2] = 0;
        forecast[3] = -1;
        forecast[4] = -1;
        forecast[5] = -3;
        forecast[6] = -3;
        forecast[7] = -2;
        forecast[8] = 0;

        System.out.println(Arrays.toString(forecast));

        int idx = 4;
        System.out.println(forecast[idx]);

        for (int i = 0; i < forecast.length; i++) {
            if (forecast[i] == -3) {
                System.out.println(i);
            }
        }

    }
}
