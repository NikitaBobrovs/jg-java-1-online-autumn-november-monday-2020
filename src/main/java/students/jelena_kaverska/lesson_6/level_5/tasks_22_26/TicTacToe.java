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

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        int firstNum = field[0][0];
        int lastNum = field[2][0];
        return (firstNum == playerToCheck && firstNum == field[1][1] && field[1][1] == field[2][2]) ||
                (lastNum == playerToCheck && lastNum == field[1][1] && field[1][1] == field[0][2]);
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForDiagonals(field, playerToCheck) || isWinPositionForHorizontals(field, playerToCheck)
                || isWinPositionForVerticals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {
        boolean draw = false;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] != -1 && !isWinPosition(field, 1) && !isWinPosition(field, 0)) {
                    draw = true;
                }
            }

        }
        return draw;
    }

}

class MyTicTacToeDemo {
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        int[][] t = {{0, 1, 0},
                {0, 1, 1},
                {1, 1, -1}};
        System.out.println(ticTacToe.isWinPositionForHorizontals(t, 0));

        System.out.println(ticTacToe.isWinPositionForVerticals(t, 1));

        System.out.println(ticTacToe.isWinPositionForDiagonals(t, 0));

        System.out.println(ticTacToe.isWinPosition(t, 0));
        System.out.println(ticTacToe.isWinPosition(t, 1));

        System.out.println(ticTacToe.isDrawPosition(t));
    }
}