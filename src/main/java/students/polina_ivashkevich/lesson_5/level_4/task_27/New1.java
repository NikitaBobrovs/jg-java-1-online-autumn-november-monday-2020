package students.polina_ivashkevich.lesson_5.level_4.task_27;

import java.util.Arrays;
import java.util.Random;

public class New1 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        } System.out.println(Arrays.toString(numbers));
        if(numbers[0]>numbers.length){
            System.out.println(numbers[0]);
            return;
        }if (numbers[1]>numbers.length){
            System.out.println(numbers[1]);
            return;
        }if (numbers[2]>numbers.length){
            System.out.println(numbers[2]);
            return;
        }if(numbers[3]>numbers.length){
            System.out.println(numbers[3]);
            return;
        }if(numbers[4]>numbers.length){
            System.out.println(numbers[4]);
            return;
        }

        }
    }




