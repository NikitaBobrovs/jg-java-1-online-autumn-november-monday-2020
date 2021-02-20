package students.nikita_bobrovs.lesson_11.book_database.ui_action;

import students.nikita_bobrovs.lesson_11.book_database.Book;
import students.nikita_bobrovs.lesson_11.book_database.BookDatabase;
import students.nikita_bobrovs.lesson_11.book_database.UIAction;

import java.util.Scanner;

class DeleteBookUIAction implements UIAction {
    private BookDatabase database;

    DeleteBookUIAction(BookDatabase database) {
        this.database = database;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter books author : ");
        String author = scanner.next();
        System.out.println("Enter books title : ");
        String title = scanner.next();
        System.out.println("Enter books year of issue : ");
        String yearOfIssue = scanner.next();

        Book book = new Book(author, title, yearOfIssue);
        if (database.delete(book)) {
            System.out.println("Book deleted successfully");
        } else {
            System.out.println("Failed to find book");
        }
    }
}
