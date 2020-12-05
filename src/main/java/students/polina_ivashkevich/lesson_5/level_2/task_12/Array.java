package students.polina_ivashkevich.lesson_5.level_2.task_12;

import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args) {


        Random random=new Random();
        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i]= random.nextInt(10);
            System.out.println(Arrays.toString(new int[]{array[i]}));

        }
    }
}
