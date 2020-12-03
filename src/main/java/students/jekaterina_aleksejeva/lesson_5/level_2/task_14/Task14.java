package students.jekaterina_aleksejeva.lesson_5.level_2.task_14;

import java.util.Arrays;
import java.util.Random;

class Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt();
        }
        System.out.println("3 random numbers: " + Arrays.toString(number));

        double sum = 0;
        for (int i : number) {
            sum += i;
        }
        double average = sum/ number.length;

        System.out.println("3 random numbers AVERAGE = " + average );

    }
}


