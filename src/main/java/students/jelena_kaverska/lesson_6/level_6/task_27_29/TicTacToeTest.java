package students.jelena_kaverska.lesson_6.level_6.task_27_29;

import java.util.Arrays;

class TicTacToeTest {
    TicTacToe ticTacToe = new TicTacToe();

    public boolean areArraysEqual(int[][] exp, int[][] act) {
        if (exp.length != act.length) {
            return false;
        }
        for (int i = 0; i < exp.length; i++) {
            for (int j = 0; j < exp[i].length; j++) {
                if (exp[i][j] != act[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean areArraysEqual2(int[][] exp, int[][] act) {
        return Arrays.deepEquals(exp, act);
    }

    public String printResult(boolean result) {
        if (result) {
            return "PASSED";
        } else {
            return "FAILED";
        }
    }

    public void testEmptyField() {
        int[][] expected = {{-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}};
        int[][] actual = ticTacToe.createField();
        System.out.println("Empty field creation test: " + printResult(areArraysEqual(expected, actual)));
    }

    public void testEmptyField2() {
        int[][] expected = {{-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}};
        int[][] actual = ticTacToe.createField();
        System.out.println("Empty field creation test (2): " + printResult(areArraysEqual2(expected, actual)));
    }

    public static void main(String[] args) {
        TicTacToeTest t = new TicTacToeTest();
        t.testEmptyField();
        t.testEmptyField2();
    }
}