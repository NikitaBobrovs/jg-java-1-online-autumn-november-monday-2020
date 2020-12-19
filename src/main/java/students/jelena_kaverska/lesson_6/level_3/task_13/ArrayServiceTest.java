package students.jelena_kaverska.lesson_6.level_3.task_13;

class ArrayServiceTest {
    ArrayService arrayService = new ArrayService();

    public String printResult(boolean result) {
        if (result) {
            return "PASSED";
        }
        return "FAILED";
    }

    public boolean checkResults(int exp, int act) {
        return exp == act;
    }

    public void testCount(int exp, int target) {
        int[] arr = {1, 2, 3, 3};
        int act = arrayService.countOccurrences(arr, target);
        System.out.println(exp + "-occurrences test: " + printResult(checkResults(exp, act)));
    }

    public static void main(String[] args) {
        ArrayServiceTest serviceTest = new ArrayServiceTest();
        serviceTest.testCount(0, 7);
        serviceTest.testCount(2, 3);
        serviceTest.testCount(1, 1);
    }
}