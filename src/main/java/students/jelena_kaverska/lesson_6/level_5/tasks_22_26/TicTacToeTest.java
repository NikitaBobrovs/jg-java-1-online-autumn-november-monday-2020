package students.jelena_kaverska.lesson_6.level_5.tasks_22_26;

class TicTacToeTest {
    TicTacToe ticTacToe = new TicTacToe();

    public boolean isEqual(boolean exp, boolean act) {
        return exp == act;
    }

    public String printResult(boolean result) {
        if (result) {
            return "PASSED";
        } else {
            return "FAILED";
        }
    }

    public void testWinHorizontals1() {
        int[][] t = {{0, 1, 0},
                {0, 1, 1},
                {1, 0, 0}};
        System.out.println("Horizontals test #1 " + printResult(isEqual(false, ticTacToe.isWinPositionForHorizontals(t, 0))));
    }

    public void testWinHorizontals2() {
        int[][] t = {{0, 1, 0},
                {0, 1, 1},
                {1, 0, 0}};
        System.out.println("Horizontals test #2 " + printResult(isEqual(false, ticTacToe.isWinPositionForHorizontals(t, 1))));
    }

    public void testWinHorizontals3() {
        int[][] t = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        System.out.println("Horizontals test #3 " + printResult(isEqual(false, ticTacToe.isWinPositionForHorizontals(t, 1))));
    }

    public void testWinHorizontals4() {
        int[][] t = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        System.out.println("Horizontals test #4 " + printResult(isEqual(true, ticTacToe.isWinPositionForHorizontals(t, 0))));
    }

    public void testWinHorizontals5() {
        int[][] t = {{1, 0, 0},
                {1, 1, 1},
                {1, 0, 0}};
        System.out.println("Horizontals test #5 " + printResult(isEqual(true, ticTacToe.isWinPositionForHorizontals(t, 1))));
    }

    public void testWinHorizontals6() {
        int[][] t = {{1, 1, 1},
                {1, 0, 1},
                {1, 0, 0}};
        System.out.println("Horizontals test #6 " + printResult(isEqual(true, ticTacToe.isWinPositionForHorizontals(t, 1))));
    }

    public void testWinHorizontals7() {
        int[][] t = {{0, 1, 0},
                {1, 0, 1},
                {0, 0, 0}};
        System.out.println("Horizontals test #7 " + printResult(isEqual(true, ticTacToe.isWinPositionForHorizontals(t, 0))));
    }

    public void testWinVerticals1() {
        int[][] t = {{0, 1, 0},
                {1, 0, 1},
                {0, 0, 0}};
        System.out.println("Verticals test #1 " + printResult(isEqual(false, ticTacToe.isWinPositionForVerticals(t, 0))));
    }

    public void testWinVerticals2() {
        int[][] t = {{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        System.out.println("Verticals test #2 " + printResult(isEqual(false, ticTacToe.isWinPositionForVerticals(t, 1))));
    }

    public void testWinVerticals3() {
        int[][] t = {{1, 0, 0},
                {1, 0, 0},
                {1, 0, 0}};
        System.out.println("Verticals test #3 " + printResult(isEqual(true, ticTacToe.isWinPositionForVerticals(t, 1))));
    }

    public void testWinVerticals4() {
        int[][] t = {{1, 0, 0},
                {0, 0, 0},
                {1, 0, 1}};
        System.out.println("Verticals test #4 " + printResult(isEqual(true, ticTacToe.isWinPositionForVerticals(t, 0))));
    }

    public void testWinVerticals5() {
        int[][] t = {{1, 0, 0},
                {0, 1, 0},
                {1, 0, 0}};
        System.out.println("Verticals test #5 " + printResult(isEqual(true, ticTacToe.isWinPositionForVerticals(t, 0))));
    }

    public void testWinVerticals6() {
        int[][] t = {{1, 0, 0},
                {1, 1, 0},
                {1, 0, 1}};
        System.out.println("Verticals test #6 " + printResult(isEqual(true, ticTacToe.isWinPositionForVerticals(t, 1))));
    }

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

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.testWinHorizontals1();
        test.testWinHorizontals2();
        test.testWinHorizontals3();
        test.testWinHorizontals4();
        test.testWinHorizontals5();
        test.testWinHorizontals6();
        test.testWinHorizontals7();
        test.testWinVerticals1();
        test.testWinVerticals2();
        test.testWinVerticals3();
        test.testWinVerticals4();
        test.testWinVerticals5();
        test.testWinVerticals6();
        test.testWinDiagonals1();
        test.testWinDiagonals2();
        test.testWinDiagonals3();
        test.testWinDiagonals4();
        test.testWinDiagonals5();
        test.testIsDraw1();
        test.testIsDraw2();
        test.testIsDraw3();
    }
}