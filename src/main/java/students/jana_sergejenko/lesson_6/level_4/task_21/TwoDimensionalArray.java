package students.jana_sergejenko.lesson_6.level_4.task_21;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDemensionalArrayMethods array = new TwoDemensionalArrayMethods();
        int[][] myArray=array.createTwoDimensionalArray(3);
        array.generateRandomArray(myArray);
        array.printArray(myArray);
        array.sumElemenets(myArray);

    }
}
