package students.jana_sergejenko.lesson_6_level_5.task_22;

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.scenario1();
        test.scenario2();
        test.scenario3();
        test.scenario4();
        test.scenario5();
        test.scenario6();
        test.scenario7();
        test.scenario8();
        test.scenario9();
        test.scenario10();
        test.scenario11();
        test.scenario12();
        test.scenario13();
        test.scenario14();
        test.scenario15();
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    public void scenario1() {
        TicTacToe array = new TicTacToe();
        int[][] myArray = {
                {1, 1, 1},
                {0, 0, 0},
                {1, 0, 0}};
        boolean result=array.isWinPositionForHorizontals(myArray, 1);
        boolean expected=true;
        checkTestResult(expected == result, "isWinPositionForHorizontals");
    }
    public void scenario2() {
        TicTacToe array = new TicTacToe();
        int[][] myArray = {
                {1, 1, 1},
                {0, 0, 0},
                {1, 0, 0}};
        boolean result=array.isWinPositionForHorizontals(myArray, 0);
        boolean expected=true;
        checkTestResult(expected == result, "isWinPositionForHorizontals");
    }
    public void scenario3() {
        TicTacToe array = new TicTacToe();
        int[][] myArray = {
                {1, 1, 0},
                {0, 0, 0},
                {1, 0, 0}};
        boolean result=array.isWinPositionForVerticals(myArray, 0);
        boolean expected=true;
        checkTestResult(expected == result, "isWinPositionForVerticals");
    }
    public void scenario4() {
        TicTacToe array = new TicTacToe();
        int[][] myArray = {
                {1, 1, 0},
                {0, 0, 0},
                {1, 0, 0}};
        boolean result=array.isWinPositionForVerticals(myArray, 1);
        boolean expected=false;
        checkTestResult(expected == result, "isWinPositionForVerticals");
    }
    public void scenario5() {
        TicTacToe array = new TicTacToe();
        int[][] myArray = {
                {1, 1, 0},
                {0, 1, 0},
                {1, 0, 1}};
        boolean result=array.isWinPositionForDiagonals(myArray, 1);
        boolean expected=true;
        checkTestResult(expected == result, "isWinPositionForDiagonals");
    }
    public void scenario6() {
        TicTacToe array = new TicTacToe();
        int[][] myArray = {
                {1, 1, 0},
                {0, 0, 0},
                {1, 0, 0}};
        boolean result=array.isWinPositionForDiagonals(myArray, 1);
        boolean expected=false;
        checkTestResult(expected == result, "isWinPositionForDiagonals");
    }
    public void scenario7() {
        TicTacToe array = new TicTacToe();
        int[][] myArray = {
                {1, 1, 0},
                {0, 0, 0},
                {1, 0, 0}};
        boolean result=array.isWinPositionForDiagonals(myArray, 0);
        boolean expected=false;
        checkTestResult(expected == result, "isWinPositionForDiagonals");
    }
    public void scenario8() {
        TicTacToe array = new TicTacToe();
        int[][] myArray = {
                {1, 1, 0},
                {0, 0, 0},
                {0, 0, 0}};
        boolean result=array.isWinPositionForDiagonals(myArray, 0);
        boolean expected=true;
        checkTestResult(expected == result, "isWinPositionForDiagonals");
    }
    public void scenario9() {
        TicTacToe array = new TicTacToe();
        int[][] myArray = {
                {1, 1, 1},
                {0, 0, 0},
                {0, 0, 0}};
        boolean result=array.isWinPosition(myArray,1);
        boolean expected=true;
        checkTestResult(expected == result, "isWinPosition");
    }
    public void scenario10() {
        TicTacToe array = new TicTacToe();
        int[][] myArray = {
                {1, 0, 1},
                {0, 0, 0},
                {0, 0, 0}};
        boolean result=array.isWinPosition(myArray,1);
        boolean expected=false;
        checkTestResult(expected == result, "isWinPosition");
    }
    public void scenario11() {
        TicTacToe array = new TicTacToe();
        int[][] myArray = {
                {1, 0, 1},
                {0, 0, 0},
                {0, 0, 0}};
        boolean result=array.isWinPosition(myArray,0);
        boolean expected=true;
        checkTestResult(expected == result, "isWinPosition");
    }
    public void scenario12() {
        TicTacToe array = new TicTacToe();
        int[][] myArray = {
                {1, 0, 1},
                {0, 1, 0},
                {0, 1, 0}};
        boolean result=array.isWinPosition(myArray,0);
        boolean expected=false;
        checkTestResult(expected == result, "isWinPosition");
    }
    public void scenario13() {
        TicTacToe array = new TicTacToe();
        int[][] myArray = {
                {1, 0, 1},
                {0, 1, 0},
                {0, 1, 0}};
        boolean result=array.isDrawPosition(myArray);
        boolean expected=true;
        checkTestResult(expected == result, "isDrawPosition");
    }
    public void scenario14() {
        TicTacToe array = new TicTacToe();
        int[][] myArray = {
                {0, -1, 0},
                {0, 1, 0},
                {0, 1, 0}};
        boolean result=array.isDrawPosition(myArray);
        boolean expected=false;
        checkTestResult(expected == result, "isDrawPosition");
    }
    public void scenario15() {
        TicTacToe array = new TicTacToe();
        int[][] myArray = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 1, 0}};
        boolean result=array.isDrawPosition(myArray);
        boolean expected=false;
        checkTestResult(expected == result, "isDrawPosition");
    }

}

