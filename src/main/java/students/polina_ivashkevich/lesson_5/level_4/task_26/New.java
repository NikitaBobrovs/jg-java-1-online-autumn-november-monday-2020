package students.polina_ivashkevich.lesson_5.level_4.task_26;

import java.util.Arrays;
import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number for array length:");
        int num= scanner.nextInt();
        int []array= new int[num];
        System.out.println("Enter elements for arrays:");

        for (int i = 0; i < array.length; i++) {
            array[i]= scanner.nextInt();

        }
        System.out.println(Arrays.toString(array));
    }
}
