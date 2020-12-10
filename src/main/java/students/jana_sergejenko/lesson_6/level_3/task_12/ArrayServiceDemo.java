package students.jana_sergejenko.lesson_6.level_3.task_12;

public class ArrayServiceDemo {
    public static void main(String[] args) {
        ArrayService array = new ArrayService();
        int[][] myArray = array.createTwoDimensionalArray();
        //array.generateArray(myArray);
        array.printArray(myArray);
        array.contains(myArray, 2);
        System.out.println("count occurrences: " + array.countOccurrences(myArray, 2));
        array.replaceElementByCoordinate(myArray, 0, 0, 3);
        array.printArray(myArray);
        //array.replaceFirst(myArray,2,11);
        //array.printArray(myArray);
        array.replaceAll(myArray, 2, 88);
        System.out.println("count of all replaced: " + array.replaceAll(myArray, 2, 88));
        array.printArray(myArray);
        array.revert(myArray);
        array.printArray(myArray);
        array.sort(myArray);
        array.printArray(myArray);
    }
}
