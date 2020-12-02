package students.polina_ivashkevich.lesson_5.level_2.task_12;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[]array =new int[3];
       Random random=new Random();
       int array1= random.nextInt(100);
        System.out.println(array1);
        int array2= random.nextInt(100);
        System.out.println(array2);
        int array3= random.nextInt(100);
        System.out.print(array3);
    }
}
