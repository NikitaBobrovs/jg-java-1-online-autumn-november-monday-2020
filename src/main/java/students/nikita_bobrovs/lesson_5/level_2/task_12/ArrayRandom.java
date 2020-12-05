package students.nikita_bobrovs.lesson_5.level_2.task_12;

import java.util.Random;

public class ArrayRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int [3];

        number[0] = random.nextInt(101);    // (101) = 0 to 100 To read console easier
        number[1] = random.nextInt(101);    //**
        number[2] = random.nextInt(101);
        int sum = 0;

//task 12
        System.out.println("Array numbers are : ");
        for (int i : number){
            System.out.println(i);
        }
        System.out.println();

//task 13
        for (int i : number){     //for (int i =0;i<number.length;i++){
            sum += i;             //sum = sum + number[i];}
        }
        System.out.println("Array sum is : "+sum);
        System.out.println();

//task 14
        int average = sum / number.length;        // double average = ((double)sum / number.length); For decimals
        System.out.println("Array average is : "+average );
        System.out.println();

//task 15
        System.out.println("Array numbers +2 are : ");
        for (int i : number){
            int newNumbers = i+2;
            System.out.println(newNumbers);
        }
    }
}
