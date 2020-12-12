package students.jana_sergejenko.lesson_5.level_7.task_26;

import students.jana_sergejenko.lesson_5.level_6.task_34.ArrayUtil;

import java.util.Scanner;

class Array2 {
    public static void main(String[] args) {
        ArrayUtil array=new ArrayUtil();
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Please enter array length");
        n = input.nextInt();
        //int[] numbers = new int[n];
        int[] myArrray=array.createArray(n);

        for (int i = 0; i < n; i++) {
            myArrray[i] = ((int) (Math.random() * 10));
        }
        //for (int i = 0; i < n; i++) {
          //  System.out.print(numbers[i] + " ");
        //}
        array.printArrayToConsole(myArrray);
    }
}
