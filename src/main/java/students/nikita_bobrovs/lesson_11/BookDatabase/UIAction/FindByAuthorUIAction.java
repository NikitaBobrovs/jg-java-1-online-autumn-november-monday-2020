package students.nikita_bobrovs.lesson_11.BookDatabase.UIAction;

import students.nikita_bobrovs.lesson_11.BookDatabase.Book;
import students.nikita_bobrovs.lesson_11.BookDatabase.BookDatabase;

import java.util.List;
import java.util.Scanner;

class FindByAuthorUIAction implements UIAction {
    private BookDatabase database;

    public FindByAuthorUIAction(BookDatabase database) {
        this.database = database;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter authors name : ");
        String author = scanner.next();
        List<Book> booksByAuthor = database.findByAuthor(author);
        booksByAuthor.forEach(book -> System.out.println(book.toString()));
    }
}
