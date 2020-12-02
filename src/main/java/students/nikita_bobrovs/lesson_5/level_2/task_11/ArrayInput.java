package students.nikita_bobrovs.lesson_5.level_2.task_11;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers");

        int[] number = new int[3];
        number[0] = scan.nextInt();
        number[1] = scan.nextInt();
        number[2] = scan.nextInt();

        for (int n : number){
            System.out.println(n);
        }
    }
}
