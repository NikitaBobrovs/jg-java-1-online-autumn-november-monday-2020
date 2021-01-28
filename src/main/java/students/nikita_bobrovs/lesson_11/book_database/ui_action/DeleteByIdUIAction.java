package students.nikita_bobrovs.lesson_11.book_database.ui_action;

import students.nikita_bobrovs.lesson_11.book_database.BookDatabase;
import students.nikita_bobrovs.lesson_11.book_database.UIAction;

import java.util.Scanner;

class DeleteByIdUIAction implements UIAction {
    private BookDatabase database;

    public DeleteByIdUIAction(BookDatabase database) {
        this.database = database;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter books ID : ");
        Long id = scanner.nextLong();
        if (database.deleteById(id)) {
            System.out.println("Book deleted successfully");
        } else {
            System.out.println("Failed to find book");
        }
    }
}
