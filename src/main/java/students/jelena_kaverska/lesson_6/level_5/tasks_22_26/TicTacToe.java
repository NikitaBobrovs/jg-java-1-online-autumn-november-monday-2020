package students.jelena_kaverska.lesson_6.level_5.tasks_22_26;

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

    //check: at least one is -1 -> true
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
}