package students.jana_sergejenko.lesson_5.level_7.task_28;

import students.jana_sergejenko.lesson_5.level_6.task_34.ArrayUtil;

class Array4 {
    public static void main(String[] args) {
        ArrayUtil array = new ArrayUtil();
        //int[] numbers = new int[10];
        int[] myArrray = array.createArray(10);
        for (int i = 0; i <10; i++) {
            myArrray[i] = ((int) (Math.random() * 10));
        }
        //int minValue = numbers[0];
        //for (int i = 0; i < 10; i++) {
          //  System.out.print(numbers[i] + " ");
       // }
        array.printArrayToConsole(myArrray);
        //for (int i = 0; i < 10; i++) {
         //   if(numbers[i] < minValue){
            //    minValue = numbers[i];
           // }

       // }
       // System.out.print("min:" + minValue);
        int min=array.findMinNumber(myArrray);
        System.out.println("");
        System.out.println("min: "+min);
    }
}