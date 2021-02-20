package students.tatjana_topcilina.lesson_5.level_2.task_15;

import java.util.Arrays;
import java.util.Random;

public class Random3 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt();
        }
        System.out.println("Three random numbers are: " + Arrays.toString(number));


            System.out.println("Three random numbers + 2 to each: ");
            for (int i : number) {
                int newNumber = i + 2;
                System.out.print(newNumber);
            }
        }
    }



