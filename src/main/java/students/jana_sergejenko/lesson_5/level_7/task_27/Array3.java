package students.jana_sergejenko.lesson_5.level_7.task_27;

import students.jana_sergejenko.lesson_5.level_6.task_34.ArrayUtil;

class Array3 {
    public static void main(String[] args) {
        ArrayUtil array = new ArrayUtil();
        int n;
        n = ((int) (Math.random() * 10));
        //int[] numbers = new int[n];
        int[] myArrray = array.createArray(n);
        for (int i = 0; i < n; i++) {
            myArrray[i] = ((int) (Math.random() * 10));
        }
        //for (int i = 0; i < n; i++) {
        // System.out.print(myArrray[i] + " ");
        // }
        array.printArrayToConsole(myArrray);
        int max=array.findMaxNumber(myArrray);
        System.out.println("");
        System.out.println("max: "+max);

        //int maxValue = myArrray[0];
        //for (int i = 0; i < n; i++) {
        // if (myArrray[i] > maxValue) {
        //  maxValue = myArrray[i];
        // }

        // }
        // System.out.print("max:" + maxValue);
    }
}

