package students.jana_sergejenko.lesson_6.level_3.task_12;

public class ArrayServiceDemo {
    public static void main(String[] args) {
        ArrayService array = new ArrayService();
        int[][] myArray = array.createTwoDimensionalArray();
        array.generateArray(myArray);
        array.printArray(myArray);
        array.contains(myArray, 4);
    }
}
