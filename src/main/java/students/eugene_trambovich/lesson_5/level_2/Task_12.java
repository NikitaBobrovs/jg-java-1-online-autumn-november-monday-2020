package students.eugene_trambovich.lesson_5.level_2;

import java.util.Random;

public class Task_12 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();
        numbers[0] = random.nextInt();
        numbers[1] = random.nextInt();
        numbers[2] = random.nextInt();

        for (int i : numbers) {
            System.out.println(i);
        }

    }
}
