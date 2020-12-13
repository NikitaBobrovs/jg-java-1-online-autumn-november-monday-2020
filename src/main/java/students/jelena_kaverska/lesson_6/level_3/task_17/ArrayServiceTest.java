package students.jelena_kaverska.lesson_6.level_3.task_17;

import java.util.Arrays;

class ArrayServiceTest {
    ArrayService arrayService = new ArrayService();

    public String printResult(boolean result) {
        if (result) {
            return "PASSED";
        }
        return "FAILED";
    }

    public boolean checkArrays(int[] exp, int[] act) {
        return Arrays.equals(exp, act);
    }

    public void checkSortingAsc() {
        int [] initial = {8, 9, 3, 1, 4, 100, 85, 9, 1,-8};
        int [] expected = {-8, 1, 1, 3, 4, 8, 9, 9, 85, 100};
        arrayService.sortArrAsc(initial);
        System.out.println("Sorting ASC: " + printResult(checkArrays(initial, expected)));
    }

    public void checkSortingDesc() {
        int [] initial = {8, 9, 3, 1, 4, 100, 85, 9, 1,-8};
        int [] expected = {100, 85, 9, 9, 8, 4, 3, 1, 1, -8};
        arrayService.sortArrDesc(initial);
        System.out.println("Sorting DESC: " + printResult(checkArrays(initial, expected)));
    }

    public static void main(String[] args) {
        ArrayServiceTest serviceTest = new ArrayServiceTest();
        serviceTest.checkSortingAsc();
        serviceTest.checkSortingDesc();
    }
}