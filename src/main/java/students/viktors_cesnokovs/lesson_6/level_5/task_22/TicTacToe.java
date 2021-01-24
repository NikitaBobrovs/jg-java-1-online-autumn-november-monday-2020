package students.viktors_cesnokovs.lesson_6.level_5.task_22;

public class TicTacToe {
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
}
