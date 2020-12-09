package students.polina_ivashkevich.lesson_5.level_4.task_25;

import java.util.Arrays;
import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number for massive length: ");
        int length = scanner.nextInt();
        int myArray[]=new int[length];
        System.out.println("Enter the elements of the array:");




        for (int i =0; i < length; i++) {
            myArray[i]= scanner.nextInt();
            System.out.println(Arrays.toString(myArray));
        }
            }


    }

