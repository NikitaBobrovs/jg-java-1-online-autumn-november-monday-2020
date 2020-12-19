package students.jekaterina_aleksejeva.lesson_6.level_5.all_tasks;

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
}

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isHorizontalWin_1stPlayer();
        test.isHorizontalWin_2ndPlayer();
        test.noHorizontalWin_1stPlayer();
        test.noHorizontalWin_2ndPlayer();
        test.isVerticalWin_1stPlayer();
        test.isVerticalWin_2ndPlayer();
        test.noVerticalWin_1stPlayer();
        test.noVerticalWin_2ndPlayer();
        test.isDiagonalWin_1stPlayer();
        test.isDiagonalWin_2ndPlayer();
        test.noDiagonalWin_1stPlayer();
        test.noDiagonalWin_2ndPlayer();
        test.isWin_1stPlayerOnHorizontals();
        test.isWin_2ndPlayerOnVerticals();
        test.isWin_1stPlayerOnDiagonal();
        test.noWin_1stPlayerOnVerticals();
        test.noWin_2ndPlayerOnHorizontals();
        test.noWin_1stPlayerOnDiagonal();
        test.noWin_2ndPlayerOnDiagonal();
        test.isDraw_noWins();
        test.noDraw_emptyField();
        test.noDraw_isWin();
    }

    boolean checkTestResult(boolean expected, boolean actual) {
        return expected == actual;
    }

    public void isHorizontalWin_1stPlayer() {
        TicTacToe game = new TicTacToe();
        String scenario = " = win position for horizontals in row 2 in favour of the 1st player";
        int[][] testField = {
                {0, 1, 1},
                {1, 0, 1},
                {0, 0, 0}
        };
        if (checkTestResult(true, game.isWinPositionForHorizontals(testField, 0))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void isHorizontalWin_2ndPlayer() {
        TicTacToe game = new TicTacToe();
        String scenario = " = win position for horizontals in row 0 in favour of the 2nd player";
        int[][] testField = {
                {1, 1, 1},
                {0, 0, 1},
                {0, 1, 0}
        };
        if (checkTestResult(true, game.isWinPositionForHorizontals(testField, 1))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void noHorizontalWin_1stPlayer() {
        TicTacToe game = new TicTacToe();
        String scenario = " = no win position for horizontals in favour of the 1st player";
        int[][] testField = {
                {0, 0, 1},
                {0, 1, 1},
                {1, 0, 1}
        };
        if (checkTestResult(false, game.isWinPositionForHorizontals(testField, 0))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void noHorizontalWin_2ndPlayer() {
        TicTacToe game = new TicTacToe();
        String scenario = " = no win position for horizontals in favour of the 2nd player";
        int[][] testField = {
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1}
        };
        if (checkTestResult(false, game.isWinPositionForHorizontals(testField, 1))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void isVerticalWin_1stPlayer() {
        TicTacToe game = new TicTacToe();
        String scenario = " = win position for verticals in column 1 in favour of the 1st player";
        int[][] testField = {
                {0, 0, 1},
                {1, 0, 0},
                {1, 0, 1}
        };
        if (checkTestResult(true, game.isWinPositionForVerticals(testField, 0))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void isVerticalWin_2ndPlayer() {
        TicTacToe game = new TicTacToe();
        String scenario = " = win position for verticals in column 2 in favour of the 2nd player";
        int[][] testField = {
                {0, 0, 1},
                {0, 1, 1},
                {1, 0, 1}
        };
        if (checkTestResult(true, game.isWinPositionForVerticals(testField, 1))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void noVerticalWin_1stPlayer() {
        TicTacToe game = new TicTacToe();
        String scenario = " = no win position for verticals in favour of the 1st player";
        int[][] testField = {
                {0, 1, 1},
                {0, 0, 0},
                {1, 0, 1}
        };
        if (checkTestResult(false, game.isWinPositionForVerticals(testField, 0))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void noVerticalWin_2ndPlayer() {
        TicTacToe game = new TicTacToe();
        String scenario = " = no win position for verticals in favour of the 2nd player";
        int[][] testField = {
                {0, 1, 1},
                {1, 1, 0},
                {1, 0, 0}
        };
        if (checkTestResult(false, game.isWinPositionForVerticals(testField, 1))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void isDiagonalWin_1stPlayer() {
        TicTacToe game = new TicTacToe();
        String scenario = " = win position for diagonal in favour of the 1st player";
        int[][] testField = {
                {0, 1, 0},
                {1, 0, 0},
                {0, 1, 1}
        };
        if (checkTestResult(true, game.isWinPositionForDiagonals(testField, 0))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void isDiagonalWin_2ndPlayer() {
        TicTacToe game = new TicTacToe();
        String scenario = " = win position for diagonal in favour of the 2nd player";
        int[][] testField = {
                {1, 0, 1},
                {0, 1, 0},
                {1, 0, 1}
        };
        if (checkTestResult(true, game.isWinPositionForDiagonals(testField, 1))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void noDiagonalWin_1stPlayer() {
        TicTacToe game = new TicTacToe();
        String scenario = " = no win position for diagonal in favour of the 1st player";
        int[][] testField = {
                {0, 1, 1},
                {1, 0, 0},
                {0, 1, 1}
        };
        if (checkTestResult(false, game.isWinPositionForDiagonals(testField, 0))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void noDiagonalWin_2ndPlayer() {
        TicTacToe game = new TicTacToe();
        String scenario = " = no win position for diagonal in favour of the 2nd player";
        int[][] testField = {
                {0, 1, 0},
                {1, 0, 1},
                {0, 1, 0}
        };
        if (checkTestResult(false, game.isWinPositionForDiagonals(testField, 1))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void isWin_1stPlayerOnHorizontals() {
        TicTacToe game = new TicTacToe();
        String scenario = " = win position for horizontals in favour of the 1st player";
        int[][] testField = {
                {1, 1, 0},
                {0, 0, 0},
                {0, 1, 1}
        };
        if (checkTestResult(true, game.isWinPosition(testField, 0))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void isWin_2ndPlayerOnVerticals() {
        TicTacToe game = new TicTacToe();
        String scenario = " = win position for verticals in favour of the 2nd player";
        int[][] testField = {
                {1, 0, 1},
                {0, 0, 1},
                {1, 0, 1}
        };
        if (checkTestResult(true, game.isWinPosition(testField, 1))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void isWin_1stPlayerOnDiagonal() {
        TicTacToe game = new TicTacToe();
        String scenario = " = win position for diagonal in favour of the 1st player";
        int[][] testField = {
                {1, 1, 0},
                {0, 0, 1},
                {0, 0, 1}
        };
        if (checkTestResult(true, game.isWinPosition(testField, 0))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void noWin_1stPlayerOnVerticals() {
        TicTacToe game = new TicTacToe();
        String scenario = " = no win position for verticals in favour of the 1st player";
        int[][] testField = {
                {1, 0, 1},
                {0, 1, 1},
                {0, 0, 1}
        };
        if (checkTestResult(false, game.isWinPosition(testField, 0))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void noWin_2ndPlayerOnHorizontals() {
        TicTacToe game = new TicTacToe();
        String scenario = " = no win position for horizontals in favour of the 2nd player";
        int[][] testField = {
                {1, 1, 0},
                {0, 0, 0},
                {0, 1, 1}
        };
        if (checkTestResult(false, game.isWinPosition(testField, 1))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void noWin_1stPlayerOnDiagonal() {
        TicTacToe game = new TicTacToe();
        String scenario = " = no win position for diagonal in favour of the 1st player";
        int[][] testField = {
                {1, 1, 0},
                {0, 1, 1},
                {0, 0, 1}
        };
        if (checkTestResult(false, game.isWinPosition(testField, 0))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void noWin_2ndPlayerOnDiagonal() {
        TicTacToe game = new TicTacToe();
        String scenario = " = no win position for diagonal in favour of the 2nd player";
        int[][] testField = {
                {1, 1, 0},
                {0, 0, 1},
                {0, 0, 1}
        };
        if (checkTestResult(false, game.isWinPosition(testField, 1))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void isDraw_noWins() {
        TicTacToe game = new TicTacToe();
        String scenario = " = is draw position";
        int[][] testField = {
                {1, 1, 0},
                {0, 0, 1},
                {1, 0, 1}
        };
        if (checkTestResult(true, game.isDrawPosition(testField))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void noDraw_emptyField() {
        TicTacToe game = new TicTacToe();
        String scenario = " = no draw position, empty field";
        int[][] testField = {
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}
        };
        if (checkTestResult(false, game.isDrawPosition(testField))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

    public void noDraw_isWin() {
        TicTacToe game = new TicTacToe();
        String scenario = " = no draw position, diagonal wins detected";
        int[][] testField = {
                {1, 0, 1},
                {0, 1, 0},
                {1, 0, 1}
        };
        if (checkTestResult(false, game.isDrawPosition(testField))) {
            System.out.println("PASS " + scenario);
        } else {
            System.out.println("FAIL " + scenario);
        }
    }

}