package students.jana_sergejenko.lesson_6.level_5.task_22;

public class TicTacToe {
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
                if ((field[i][j] == -1) || isWinPosition(field, 1)||isWinPosition(field, 0)) {
                    return false;
                }
            }
        }
        return true;
    }
}

