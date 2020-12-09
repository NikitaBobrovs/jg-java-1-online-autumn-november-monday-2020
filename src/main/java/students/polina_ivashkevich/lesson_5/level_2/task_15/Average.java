package students.polina_ivashkevich.lesson_5.level_2.task_15;

import java.util.Arrays;
import java.util.Random;

public class Average {
    public static void main(String[] args) {
        Random random=new Random();
        int[]numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=random.nextInt(100);
            System.out.println(Arrays.toString(new int[]{numbers[i]}));
            if(numbers[i]<=100){
                numbers[i]=numbers[i]+2;
                System.out.println(numbers[i]);
            }
        }
        }
    }

