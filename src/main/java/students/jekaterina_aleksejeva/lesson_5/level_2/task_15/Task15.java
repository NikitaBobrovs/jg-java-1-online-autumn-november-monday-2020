package students.jekaterina_aleksejeva.lesson_5.level_2.task_15;

import java.util.Arrays;
import java.util.Random;

class Task15 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt();
        }
        System.out.println("3 random numbers: " + Arrays.toString(number));

        System.out.println("3 random numbers each increased by 2: ");
        for (int i : number) {
            int newNumber = i+2;
        System.out.print(newNumber + " ");
        }
    }
}