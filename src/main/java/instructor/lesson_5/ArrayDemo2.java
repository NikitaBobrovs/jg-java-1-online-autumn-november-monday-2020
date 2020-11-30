package instructor.lesson_5;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo2 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[random.nextInt(15)];

        System.out.println(Arrays.toString(array));

        // Init
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

//        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("Sum = " + sum);

    }
}
