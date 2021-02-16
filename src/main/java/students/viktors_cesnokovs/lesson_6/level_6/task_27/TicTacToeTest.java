package students.viktors_cesnokovs.lesson_6.level_6.task_27;

import java.util.Arrays;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
        test.test7();
        test.test8();
        test.test9();
        test.test10();
        test.test11();
        test.test12();
        test.test13();
        test.test14();
        test.test15();
        test.test16();
    }

    boolean tester(boolean expected, boolean real) { return expected == real; }

    String result(boolean test) {
        if (test) {
            return "PASSED";
        } else
            return "FAILED";
    }

    void test1() {
        int[][] field = {
                {1, 1, 1},
                {0, 0, 0},
                {1, 0, 0}};
        System.out.println("Win for horizontal 'YES' : " + result
                (tester(true, new TicTacToe().isWinPositionForHorizontals(field, 1))));
    }

    void test2() {
        int[][] field = {
                {1, 1, 1},
                {0, 0, 0},
                {1, 0, 0}};
        System.out.println("Win for horizontal 'YES' : " + result
                (tester(true, new TicTacToe().isWinPositionForHorizontals(field, 0))));
    }

    void test3() {
        int[][] field = {
                {1, 1, 0},
                {0, 0, 0},
                {1, 0, 0}};
        System.out.println("Win for verticals 'YES' : " + result
                (tester(true, new TicTacToe().isWinPositionForVerticals(field, 0))));
    }

    void test4() {
        int[][] field = {
                {1, 1, 0},
                {0, 0, 0},
                {1, 0, 0}};
        System.out.println("Win for verticals 'NO' : " + result
                (tester(false, new TicTacToe().isWinPositionForVerticals(field, 1))));
    }

    void test5() {
        int[][] field = {
                {1, 1, 0},
                {0, 1, 0},
                {1, 0, 1}};
        System.out.println("Win for diagonals 'YES' : " + result
                (tester(true, new TicTacToe().isWinPositionForDiagonals(field, 1))));
    }

    void test6() {
        int[][] field = {
                {1, 1, 0},
                {0, 0, 0},
                {1, 0, 0}};
        System.out.println("Win for diagonals 'NO' : " + result
                (tester(false, new TicTacToe().isWinPositionForDiagonals(field, 1))));
    }

    void test7() {
        int[][] field = {
                {1, 1, 0},
                {0, 0, 0},
                {1, 0, 0}};
        System.out.println("Win for diagonals 'NO' : " + result
                (tester(false, new TicTacToe().isWinPositionForDiagonals(field, 0))));
    }

    void test8() {
        int[][] field = {
                {1, 1, 0},
                {0, 0, 0},
                {0, 0, 0}};
        System.out.println("Win for diagonals 'YES' : " + result
                (tester(true, new TicTacToe().isWinPositionForDiagonals(field, 0))));
    }

    void test9() {
        int[][] field = {
                {1, 1, 1},
                {0, 0, 0},
                {0, 0, 0}};
        System.out.println("Win position 'YES' : " + result
                (tester(true, new TicTacToe().isWinPosition(field, 1))));
    }

    void test10() {
        int[][] field = {
                {1, 0, 1},
                {0, 0, 0},
                {0, 0, 0}};
        System.out.println("Win position 'NO' : " + result
                (tester(false, new TicTacToe().isWinPosition(field, 1))));
    }

    void test11() {
        int[][] field = {
                {1, 0, 1},
                {0, 0, 0},
                {0, 0, 0}};
        System.out.println("Win position 'YES' : " + result
                (tester(true, new TicTacToe().isWinPosition(field, 0))));
    }

    void test12() {
        int[][] field = {
                {1, 0, 1},
                {0, 1, 0},
                {0, 1, 0}};
        System.out.println("Win position 'NO' : " + result
                (tester(false, new TicTacToe().isWinPosition(field, 0))));
    }

    void test13() {
        int[][] field = {
                {1, 0, 1},
                {0, 1, 0},
                {0, 1, 0}};
        System.out.println("Draw position 'YES' : " + result
                (tester(true, new TicTacToe().isDrawPosition(field))));
    }

    void test14() {
        int[][] field = {
                {0, -1, 0},
                {0, 1, 0},
                {0, 1, 0}};
        System.out.println("Draw position 'NO' : " + result
                (tester(false, new TicTacToe().isDrawPosition(field))));
    }

    void test15() {
        int[][] field = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 1, 0}};
        System.out.println("Draw position 'NO' : " + result
                (tester(false, new TicTacToe().isDrawPosition(field))));
    }

    void test16() {
        int[][] expected = {
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}};
        System.out.println("Create field test : " + result
                (Arrays.deepEquals(expected, new TicTacToe().createField())));
    }
}
