package students.jelena_kaverska.lesson_6.level_6.task_27_29;

import students.jelena_kaverska.lesson_6.level_6.task_28.Move;

import java.util.Arrays;
import java.util.Scanner;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            int j = 0;
            int firstNum = field[i][j];
            if (firstNum == playerToCheck && firstNum == field[i][j + 1] && firstNum == field[i][j + 2])
                return true;
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int j = 0; j < field.length; j++) {
            int i = 0;
            int firstNum = field[i][j];
            if (firstNum == playerToCheck && firstNum == field[i + 1][j] && firstNum == field[i + 2][j])
                return true;
        }
        return false;
    }

    //new
    public boolean isDiagonalWinLeftToRight(int[][] field, int playerToCheck) {
        return playerToCheck == field[0][0] && field[0][0] == field[1][1] && field[1][1] == field[2][2];
    }

    //new
    public boolean isDiagonalWinRightToLeft(int[][] field, int playerToCheck) {
        return playerToCheck == field[2][0] && field[2][0] == field[1][1] && field[1][1] == field[0][2];
    }

    //updated
    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return isDiagonalWinLeftToRight(field, playerToCheck) || isDiagonalWinRightToLeft(field, playerToCheck);
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForDiagonals(field, playerToCheck) || isWinPositionForHorizontals(field, playerToCheck)
                || isWinPositionForVerticals(field, playerToCheck);
    }

    //check at least one is -1 -> true
    public boolean anyEmpty(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    return true;
                }
            }
        }
        return false;
    }

    //updated
    public boolean isDrawPosition(int[][] field) {
       return !(anyEmpty(field)) && !isWinPosition(field, 1) && !isWinPosition(field, 0);
    }

    // 27 task
    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = -1;
            }
        }
        return field;
    }

    // 28 task
    public Move getNextMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number from 1 to 3 for X coordinate: ");
        int x = scanner.nextInt();
        System.out.print("Enter number from 1 to 3 for Y coordinate: ");
        int y = scanner.nextInt();
        return new Move(x - 1, y - 1);
    }

    // 29 task
    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            System.out.println(Arrays.toString(field[i]));
        }
    }

    // 30 task
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
        TicTacToe t = new TicTacToe();
        t.play();
    }
}