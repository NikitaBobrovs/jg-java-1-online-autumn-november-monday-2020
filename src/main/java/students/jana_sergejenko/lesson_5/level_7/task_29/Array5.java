package students.jana_sergejenko.lesson_5.level_7.task_29;

import students.jana_sergejenko.lesson_5.level_6.task_34.ArrayUtil;

class Array5 {
    public static void main(String[] args) {
        ArrayUtil array = new ArrayUtil();
        Array5 array1=new Array5();
        int n;
        n = ((int) (Math.random() * 10));
        //int[] numbers = new int[n];
        int[] myArrray = array.createArray(10);
        for (int i = 0; i < n; i++) {
            myArrray[i] = ((int) (Math.random() * 10));
        }
        //for (int i = 0; i < n; i++) {
        //   System.out.print(myArrray[i] + " ");
       // }
        array.printArrayToConsole(myArrray);
        System.out.println("");
        for (int i = 0; i < n; i++) {
            if (myArrray[i] % 2 == 0) {
                System.out.println("even:" + myArrray[i]);
            }
        }

    }
}
