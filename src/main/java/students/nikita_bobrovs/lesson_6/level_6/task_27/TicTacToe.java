package students.nikita_bobrovs.lesson_6.level_6.task_27;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public void play() {
        int[][] field = createField();
            printFieldToConsole(field);
        while(true) {
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPlayer(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }

            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPlayer(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
    int[][] createField(){
        int[][] field = new int[3][3];
        for(int[] ints : field){
            for(int j = 0;j< field[0].length;j++){
                ints[j] = -1;
            }
        } return field;
    }
    Move getNextMove(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter next X coordinate : ");
        int x = scan.nextInt();
        System.out.println("Enter next Y coordinate : ");
        int y = scan.nextInt();
        return new Move(x,y);
    }
    void printFieldToConsole(int[][] field){
        for (int[] arr : field) {
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(arr[j] + "  ");
            }
            System.out.println();
        }
    }
    boolean hasSameElements(int[] field) {
        for (int r : field) {
            if (field[0] != r) {
                return false;
            }
        } return true;
    }
    boolean isWinHorizontals(int[][] field, int player) {
        for (int[] row : field) {
            if (row[0] == player && hasSameElements(row)) {
                return true;
            }
        } return false;
    }

    boolean isWinVerticals(int[][] field, int player) {
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == field[1][i]
                    && field[1][i] == field[2][i]
                    && field[2][i] == player) {
                return true;
            }
        } return false;
    }

    boolean isWinDiagonals(int[][] field, int player){
        if (field[0][0] == field[1][1]
                && field[1][1] == field[2][2]
                && field[2][2] == player){
            return true;
        }
        return field[2][0] == field[1][1]
                && field[0][2] == field[1][1]
                && field[1][1] == player;
    }

    boolean isWinPlayer(int[][] field, int player){
        return isWinDiagonals(field, player)
                || isWinVerticals(field, player)
                || isWinHorizontals(field, player);
    }
    boolean isFieldComplete(int[][] field){
        for (int[] ints : field){
            for (int j =0;j<field[0].length;j++){
                if (Arrays.stream(ints).anyMatch(x -> x ==-1)){
                    return false;
                }
            }
        } return true;
    }
    boolean isDraw(int[][] field){
        return isFieldComplete(field) && !isWinPlayer(field, 1) && !isWinPlayer(field, 0);
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}


class Move {
    int x;
    int y;

    Move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}


class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest subject = new TicTacToeTest();
        subject.isWinHorizontalsTest1();
        subject.isWinHorizontalsTest2();
        subject.isWinVerticalsTest1();
        subject.isWinVerticalsTest2();
        subject.isWinDiagonalsTest1();
        subject.isWinDiagonalsTest2();
        subject.isWinPlayerTest1();
        subject.isWinPlayerTest2();
        subject.isWinPlayerTest3();
        subject.isWinPlayerTest4();
        subject.isDrawTest1();
        subject.isDrawTest2();
        subject.isDrawTest3();
        subject.createFieldTest1();
    }

    boolean booleanTester(boolean expectedResult, boolean realResult) {
        return expectedResult == realResult;
    }

    String printTestResult(boolean tester) {
        if (tester) {
            return "OK";
        }
        return "FAIL";
    }

    void isWinHorizontalsTest1() {
        int[][] field = {{1, 0, 1}, {0, 0, 0}, {1, 1, 0}};
        System.out.println("Horizontal win(YES) test : " + printTestResult
                (booleanTester(true, new TicTacToe().isWinHorizontals(field, 0))));
    }

    void isWinHorizontalsTest2() {
        int[][] field = {{1, 1, 1}, {0, 1, 0}, {1, 1, 0}};
        System.out.println("Horizontal win(NO) test : " + printTestResult
                (booleanTester(false, new TicTacToe().isWinHorizontals(field, 0))));
    }

    void isWinVerticalsTest1() {
        int[][] field = {{1, 1, 1}, {1, 0, 0}, {1, 0, 0}};
        System.out.println("Verticals win(YES) test : " + printTestResult
                (booleanTester(true, new TicTacToe().isWinVerticals(field, 1))));
    }

    void isWinVerticalsTest2() {
        int[][] field = {{0, 1, 1}, {1, 0, 0}, {1, 0, 0}};
        System.out.println("Verticals win(NO) test : " + printTestResult
                (booleanTester(false, new TicTacToe().isWinVerticals(field, 1))));
    }

    void isWinDiagonalsTest1() {
        int[][] field = {{0, 0, 1}, {0, 1, 0}, {1, 0, 1}};
        System.out.println("Diagonals win(YES) test : " + printTestResult
                (booleanTester(true, new TicTacToe().isWinDiagonals(field, 1))));
    }

    void isWinDiagonalsTest2() {
        int[][] field = {{0, 0, 1}, {0, 0, 0}, {1, 1, 1}};
        System.out.println("Diagonals win(NO) test : " + printTestResult
                (booleanTester(false, new TicTacToe().isWinDiagonals(field, 1))));
    }

    void isWinPlayerTest1() {
        int[][] field = {{1, 0, 1}, {0, 0, 1}, {0, 1, 1}};
        System.out.println("Player 1 win(YES)(vertical) : " + printTestResult
                (booleanTester(true, new TicTacToe().isWinPlayer(field, 1))));
    }

    void isWinPlayerTest2() {
        int[][] field = {{1, 1, 1}, {0, 0, 1}, {0, 1, 0}};
        System.out.println("Player 1 win(YES)(horizontal) : " + printTestResult
                (booleanTester(true, new TicTacToe().isWinPlayer(field, 1))));
    }

    void isWinPlayerTest3() {
        int[][] field = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        System.out.println("Player 1 win(YES)(diagonal) : " + printTestResult
                (booleanTester(true, new TicTacToe().isWinPlayer(field, 1))));
    }

    void isWinPlayerTest4() {
        int[][] field = {{1, 0, 1}, {0, 1, 0}, {0, 1, 0}};
        System.out.println("Player 1 win(NO) : " + printTestResult
                (booleanTester(false, new TicTacToe().isWinPlayer(field, 1))));
    }

    void isDrawTest1() {
        int[][] field = {{1, 0, 1}, {0, 1, 1}, {0, 1, 0}};
        System.out.println("Is it draw(YES) test : " + printTestResult
                (booleanTester(true, new TicTacToe().isDraw(field))));
    }

    void isDrawTest2() {
        int[][] field = {{-1, 1, 1}, {-1, 1, -1}, {-1, 1, 1}};
        System.out.println("Is it draw(NO) test : " + printTestResult
                (booleanTester(false, new TicTacToe().isDraw(field))));
    }

    void isDrawTest3() {
        int[][] field = {{-1, 0, 1}, {-1, 1, 1}, {-1, 1, 0}};
        System.out.println("Is it draw(YES (empty cells)) test : " + printTestResult
                (booleanTester(true, new TicTacToe().isDraw(field))));
    }

    void createFieldTest1() {
        int[][] expectedResult = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
        System.out.println("Create empty field test : " + printTestResult
                (Arrays.deepEquals(expectedResult, new TicTacToe().createField())));
    }
}
