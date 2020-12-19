package instructor.lesson_7.tictactoe;

public class TicTacToe {

    public static void main(String[] args) {

        Board board = new Board();
        MoveSupplier moveSupplier = new MoveSupplier();

        Move move = moveSupplier.askUser();

        board.move(move);

        board.isWinner('X');
        board.isWinner('O');

    }
}
