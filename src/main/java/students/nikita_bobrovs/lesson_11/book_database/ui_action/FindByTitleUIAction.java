package students.nikita_bobrovs.lesson_11.book_database.ui_action;

import students.nikita_bobrovs.lesson_11.book_database.Book;
import students.nikita_bobrovs.lesson_11.book_database.BookDatabase;
import students.nikita_bobrovs.lesson_11.book_database.UIAction;

import java.util.List;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction {
    private final BookDatabase database;

    FindByTitleUIAction(BookDatabase database) {
        this.database = database;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter books title : ");
        String title = scanner.next();
        List<Book> booksByTitle = database.findByTitle(title);
        booksByTitle.forEach(book -> System.out.println(book.toString()));
    }
}
