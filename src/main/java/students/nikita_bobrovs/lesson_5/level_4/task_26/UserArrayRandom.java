package students.nikita_bobrovs.lesson_5.level_4.task_26;

import java.util.Random;
import java.util.Scanner;

class UserArrayRandom {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter array length : ");
        int[] array = new int[scan.nextInt()];

        for (int i = 0;i < array.length;i++){
            array[i] = new Random().nextInt();
        }
        System.out.println("Array numbers are : ");
        for (int print : array){
            System.out.println(print);
        }
    }
}
