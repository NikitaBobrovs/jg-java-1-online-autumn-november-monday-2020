package students.jana_sergejenko.lesson_6.level_7.task_33;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == playerToCheck && field[i][1] == playerToCheck &&
                    field[i][2] == playerToCheck) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[0][i] == playerToCheck && field[1][i] == playerToCheck && field[2][i] == playerToCheck)
                return true;
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if ((field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck) ||
                    (field[2][0] == playerToCheck && field[1][1] == playerToCheck && field[0][2] == playerToCheck)) {
                return true;
            }
        }

        return false;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        if (isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) || isWinPositionForDiagonals(field, playerToCheck)) {
            return true;
        }
        return false;
    }

    public boolean isDrawPosition(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if ((field[i][j] == -1) || isWinPosition(field, 1) || isWinPosition(field, 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    public int[][] createField() {
        int[][] field = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = -1;

            }
        }
        return field;
    }

    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(field[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }

    public Move getNextMove() {
        // запросите у пользователя с консоли две координаты
        // клетки куда хочет походить игрок
        //Scanner scan = new Scanner(System.in);
        //System.out.print("Enter any number: ");
        //int x = scan.nextInt();
        //Scanner scan2 = new Scanner(System.in);
        //System.out.print("Enter any number: ");
        Random ran = new Random();
        int x = ran.nextInt(3) + 0;
        //int y = scan.nextInt();
        int y=ran.nextInt(3) + 0;
        // создайте экземпляр класса Move и передайте ему
        // в конструктор введённые пользователем координаты
        Move move = new Move(x,y);
        // верните созданный объект Move из метода.
        return move;

    }
    public void play() {
        int[][] field = createField();
        while(true) {
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
