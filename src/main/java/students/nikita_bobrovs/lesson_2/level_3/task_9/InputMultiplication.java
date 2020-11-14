package students.nikita_bobrovs.lesson_2.level_3.task_9;

import java.util.Scanner;

public class InputMultiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number : ");
        int inputNum = scan.nextInt();

        for(int m =1;m<11;m++)
        {
            System.out.printf("%d * %d = %d \n", inputNum, m, inputNum * m);
        }
    }
    }

