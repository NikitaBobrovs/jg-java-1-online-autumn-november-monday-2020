package students.jana_sergejenko.lesson_5.level_7.task_30;

import students.jana_sergejenko.lesson_5.level_6.task_34.ArrayUtil;

class Array6 {
    public static void main(String[] args) {
        ArrayUtil array = new ArrayUtil();
        int n;
        n = ((int) (Math.random() * 10));
        //int[] numbers = new int[n];
        int[] myArrray = array.createArray(n);
        for (int i = 0; i < n; i++) {
            myArrray[i] = ((int) (Math.random() * 10));
        }
       // for (int i = 0; i < n; i++) {
            //System.out.print(myArrray[i] + " ");
        //}
        array.printArrayToConsole(myArrray);
        System.out.println("");
        for (int i = 0; i < n; i++) {
            if (myArrray[i] % 2 != 0) {
                System.out.println("odd:" + myArrray[i]);
            }
        }
    }
}

