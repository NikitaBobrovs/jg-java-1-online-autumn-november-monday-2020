package students.viktors_cesnokovs.lesson_6.level_6.task_27;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

    boolean isWinPositionForHorizontals(int[][] field, int playerCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == playerCheck && field[i][1] == playerCheck && field[i][2] == playerCheck) {
                return true;
            }
        }
        return false;
    }

    boolean isWinPositionForVerticals(int[][] field, int playerCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == playerCheck && field[1][i] == playerCheck && field[2][i] == playerCheck)
                return true;
        }
        return false;
    }

    boolean isWinPositionForDiagonals(int[][] field, int playerCheck) {
        for (int i = 0; i < field.length; i++) {
            if ((field[0][0] == playerCheck && field[1][1] == playerCheck && field[2][2] == playerCheck) ||
                    (field[2][0] == playerCheck && field[1][1] == playerCheck && field[0][2] == playerCheck)) {
                return true;
            }
        }
        return false;
    }

    boolean isWinPosition(int[][] field, int playerCheck) {
        if (isWinPositionForHorizontals(field, playerCheck) || isWinPositionForVerticals(field, playerCheck) ||
                isWinPositionForDiagonals(field, playerCheck)) {
            return true;
        }
        return false;
    }

    boolean isDrawPosition(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int y = 0; y < field.length; y++) {
                if ((field[i][y] == -1) || isWinPosition(field, 1) || isWinPosition(field, 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 3; y++) {
                field[i][y] = -1;
            }
        }
        return field;
    }

    public Move getNextMove() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number in x axis : ");
        int x = scan.nextInt();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter number in y axis : ");
        int y = scan.nextInt();

        Move move = new Move(x, y);
        return move;
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < 3; i++) {
            for (int y = 0; y < 3; y++)
                System.out.print(field[i][y] + " ");
            System.out.println();
        }
        System.out.println();
    }

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
}
