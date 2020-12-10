package students.jana_sergejenko.lesson_6.level_3.task_12;

public class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.scenario1();
        test.scenario2();

    }
    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }
    public void scenario1() {
        ArrayService array = new ArrayService();
        int[][] myArray= array.createTwoDimensionalArray();
        array.generateArray(myArray);
        array.printArray(myArray);
        boolean result=array.contains(myArray,4);
        boolean expected=true;
        checkTestResult(expected==result,"Array contains number");
    }
    public void scenario2() {
        ArrayService array = new ArrayService();
        int[][] myArray= array.createTwoDimensionalArray();
        array.generateArray(myArray);
        boolean result=array.contains(myArray,19);
        boolean expected=false;
        checkTestResult(expected==result,"Array does not contains number");
    }
}