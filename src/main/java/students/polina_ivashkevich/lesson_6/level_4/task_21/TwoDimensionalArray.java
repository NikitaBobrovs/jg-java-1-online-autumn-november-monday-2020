package students.polina_ivashkevich.lesson_6.level_4.task_21;

import java.util.Random;

public class TwoDimensionalArray {

    public static void randomNumber(){

        Random random =new Random();
        int[][] r=new int[3][3];
        r[0][0]= random.nextInt();
        r[1][1]= random.nextInt();
        r[2][2]= random.nextInt();
        int sum=r[0][0]+r[1][1]+r[2][2];
        System.out.println(sum);
        }


    }

class TwoDimensionalArrayTest{
    public static void main(String[] args) {
        TwoDimensionalArray array1=new TwoDimensionalArray();
        array1.randomNumber();
    }
}

