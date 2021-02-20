package students.tatjana_topcilina.lesson_5.level_2.task_12;

import java.util.Random;

public class WholeNumber3 {


    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[3];

        number[0] = random.nextInt();
        number[1] = random.nextInt();
        number[2] = random.nextInt();

        for (int i : number) {
            System.out.println(i);}
    }
}