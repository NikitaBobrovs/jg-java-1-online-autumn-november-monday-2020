package students.nikita_bobrovs.lesson_11.book_database.ui_action;

import students.nikita_bobrovs.lesson_11.book_database.Book;
import students.nikita_bobrovs.lesson_11.book_database.BookDatabase;
import students.nikita_bobrovs.lesson_11.book_database.UIAction;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter books author : ");
        String author = scanner.next();

        System.out.println("Enter books title : ");
        String title = scanner.next();

        System.out.println("Enter books year year of issue : ");
        String yearOfIssue = scanner.next();

        Book book = new Book(author, title, yearOfIssue);

        bookDatabase.save(book);
    }
}
