package students.jelena_kaverska.lesson_6.level_3.task_12;

class ArrayServiceTest {
    ArrayService arrayService = new ArrayService();

    public String printResult(boolean result) {
        if (result) {
            return "PASSED";
        }
        return "FAILED";
    }

    public boolean checkResults(boolean exp, boolean act) {
        return exp == act;
    }

    public void testHasNumber() {
        int target = 10;
        int[] arr = {8, 7, 50, 22, 10};
        boolean exp = true;
        boolean act = arrayService.contains(arr, target);
        System.out.println("Array contains - test: " + printResult(checkResults(exp, act)));
    }

    public void testHasNoNumber() {
        int target = 1;
        int[] arr = {8, 7, 50, 22, 10};
        boolean exp = false;
        boolean act = arrayService.contains(arr, target);
        System.out.println("Array does not contain - test: " + printResult(checkResults(exp, act)));
    }

    public static void main(String[] args) {
        ArrayServiceTest serviceTest = new ArrayServiceTest();
        serviceTest.testHasNumber();
        serviceTest.testHasNoNumber();
    }
}