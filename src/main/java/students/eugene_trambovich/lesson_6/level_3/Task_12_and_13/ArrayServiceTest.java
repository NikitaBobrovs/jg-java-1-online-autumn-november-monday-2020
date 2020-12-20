package students.eugene_trambovich.lesson_6.level_3.Task_12_and_13;

public class ArrayServiceTest {

    ArrayService arrayService = new ArrayService();

    public String printActualResultStatus(boolean actualResultStatus) {
        if (actualResultStatus) {
            return "True";
        }
        return "False";
    }

    public boolean checkResult(boolean expected, boolean actual) {
        return expected == actual;
    }

    public boolean checkIntResult(int expected, int actual) {
        return expected == actual;
    }

    public void HasMyIntTest() {
        int myInt = 7;
        int[] array = {8, 6, 7, 9, 3};
        boolean actual = arrayService.contains(array, myInt);
        System.out.println("My int is in array - " + printActualResultStatus(checkResult(true, actual)));
    }

    public void HasNotMyIntTest() {
        int myInt = 3;
        int[] array = {5, 6, 7, 9, 45, 9};
        boolean actual = arrayService.contains(array, myInt);
        System.out.println("My int isn't in array - " + printActualResultStatus(checkResult(false, actual)));
    }

    void countOccurrencesTest() {
        int[] subject = {7, 11, 88, 10, 0, 7, 7};
        System.out.println("Expected occurrences count are : " + printActualResultStatus(checkIntResult
                (3, arrayService.countOccurrences(subject, 7))));
    }

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.HasMyIntTest();
        test.HasNotMyIntTest();
        test.countOccurrencesTest();
    }
}
