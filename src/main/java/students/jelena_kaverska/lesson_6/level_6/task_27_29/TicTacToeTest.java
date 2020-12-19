package students.jelena_kaverska.lesson_6.level_6.task_27_29;

import java.util.Arrays;

class TicTacToeTest {
    TicTacToe ticTacToe = new TicTacToe();

    public void testWinDiagonals1() {
        int[][] t = {{1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}};
        System.out.println("Diagonals test #1 " + printResult(isEqual(true, ticTacToe.isWinPositionForDiagonals(t, 1))));
    }

    public void testWinDiagonals2() {
        int[][] t = {{1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}};
        System.out.println("Diagonals test #2 " + printResult(isEqual(false, ticTacToe.isWinPositionForDiagonals(t, 0))));
    }

    public void testWinDiagonals3() {
        int[][] t = {{1, 0, 0},
                {1, 1, 1},
                {0, 0, 1}};
        System.out.println("Diagonals test #3 " + printResult(isEqual(true, ticTacToe.isWinPositionForDiagonals(t, 1))));
    }

    public void testWinDiagonals4() {
        int[][] t = {{0, 0, 1},
                {1, 1, 1},
                {1, 0, 1}};
        System.out.println("Diagonals test #4 " + printResult(isEqual(true, ticTacToe.isWinPositionForDiagonals(t, 1))));
    }

    public void testWinDiagonals5() {
        int[][] t = {{0, 1, 0},
                {1, 0, 1},
                {0, 1, 0}};
        System.out.println("Diagonals test #5 " + printResult(isEqual(true, ticTacToe.isWinPositionForDiagonals(t, 0))));
    }

    public void testIsDraw1() {
        int[][] t = {{0, 1, 0},
                {0, 1, 1},
                {1, 1, -1}};
        ticTacToe.isWinPosition(t, 0);
        ticTacToe.isWinPosition(t, 1);
        System.out.println("No draw (has empty) test " + printResult(isEqual(false, ticTacToe.isDrawPosition(t))));
    }

    public void testIsDraw2() {
        int[][] t = {{0, 1, 0},
                {0, 0, 1},
                {1, 1, 1}};
        ticTacToe.isWinPosition(t, 0);
        ticTacToe.isWinPosition(t, 1);
        System.out.println("No draw (one wins) test " + printResult(isEqual(false, ticTacToe.isDrawPosition(t))));
    }

    public void testIsDraw3() {
        int[][] t = {{0, 1, 0},
                {0, 0, 1},
                {1, 0, 1}};
        ticTacToe.isWinPosition(t, 0);
        ticTacToe.isWinPosition(t, 1);
        System.out.println("Draw test " + printResult(isEqual(true, ticTacToe.isDrawPosition(t))));
    }

    public boolean isEqual(boolean exp, boolean act) {
        return exp == act;
    }

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

        t.testWinDiagonals1();
        t.testWinDiagonals2();
        t.testWinDiagonals3();
        t.testWinDiagonals4();
        t.testWinDiagonals5();
        t.testIsDraw1();
        t.testIsDraw2();
        t.testIsDraw3();
    }
}