package students.viktors_cesnokovs.lesson_5.level_2.task_15;

import java.util.Random;

public class Numbers5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[3];

        number[0] = random.nextInt(50);
        number[1] = random.nextInt(50);
        number[2] = random.nextInt(50);

        for (int i : number) {
            System.out.println("Array number: ");
            System.out.println(i);
        }
        for (int i : number) {
            int newI = i + 2;
            {
                System.out.println("Array number +2: ");
                System.out.println(newI);
            }
        }
    }
}