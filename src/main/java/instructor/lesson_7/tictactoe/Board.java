package instructor.lesson_7.tictactoe;

public class Board {

    private char[][] field = {
            {'.', '.', '.'},
            {'.', '.', '.'},
            {'.', '.', '.'}
    };

    public boolean move(Move move) {
        field[move.getRow()][move.getCol()] = 'X';
        return true;
    }

    public boolean isWinner(char player) {
        return hasHorizontalWin(player)
                || hasVerticalWin(player)
                || hasDiagonalWin(player);
    }

    private boolean hasHorizontalWin(char player) {
        //TODO
        return true;
    }

    private boolean hasVerticalWin(char player) {
        return true;
    }

    private boolean hasDiagonalWin(char player) {
        return true;
    }
}
