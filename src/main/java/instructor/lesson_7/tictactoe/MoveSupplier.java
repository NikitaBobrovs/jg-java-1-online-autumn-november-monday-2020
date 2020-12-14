package instructor.lesson_7.tictactoe;

import java.util.Scanner;

public class MoveSupplier {

    Move askUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter row:");
        int row = scanner.nextInt();

        System.out.print("Enter col:");
        int col = scanner.nextInt();

        return new Move(row, col);
    }

}
