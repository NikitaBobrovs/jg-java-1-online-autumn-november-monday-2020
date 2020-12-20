package students.jekaterina_aleksejeva.lesson_6.level_6.all_tasks;

import java.util.Arrays;
import java.util.Scanner;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int[] row : field) {
            if (row[0] == playerToCheck && row[1] == playerToCheck && row[2] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == playerToCheck && field[1][i] == playerToCheck && field[2][i] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[1][1] == playerToCheck && field[1][1] == field[0][0] && field[0][0] == field[2][2] ||
                    field[1][1] == playerToCheck && field[1][1] == field[0][2] && field[0][2] == field[2][0]) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] != -1 && !isWinPosition(field, 0) && !isWinPosition(field, 1)) {
                    return true;
                }
            }
        }
        return false;

    }

    // task 27
    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    // task 28
    public Move getNextMove() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X coordinate from 0 to 2: ");
        int x = scanner.nextInt();
        System.out.println("Enter Y coordinate from 0 to 2: ");
        int y = scanner.nextInt();

        return new Move(x, y);

    }

    // task 29
    public void printFieldToConsole(int[][] field) {
        System.out.println("FIELD: ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    // task 30
    public void play() {
        int[][] field = createField();
        while (true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }


}

// task 28
class Move {
    private int x;
    private int y;

    Move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {

        return y;
    }

}

// Test for  task 27
class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.emptyFieldCreated();

    }

    public void emptyFieldCreated() {
        TicTacToe game = new TicTacToe();
        String scenario  = " empty field created";
        int[][] expectedField = {
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}
        };
        if (Arrays.deepEquals(expectedField,game.createField())) {
            System.out.println("PASSED" + scenario);
        } else System.out.println("FAIL" + scenario);
    }


}
