package students.nikita_bobrovs.lesson_5.level_4.task_25;

import java.util.Scanner;

class UserArrayGet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array length : ");
        int[] array = new int [scan.nextInt()];

        System.out.println("Fill your array with "+array.length+" numbers : ");

        for (int i =0;i < array.length ;i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Array numbers are :");
        for (int print : array){
            System.out.println(print);
        }
    }
}
