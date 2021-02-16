package students.nikita_bobrovs.lesson_11.book_database.ui_action;

import students.nikita_bobrovs.lesson_11.book_database.Book;
import students.nikita_bobrovs.lesson_11.book_database.BookDatabase;
import students.nikita_bobrovs.lesson_11.book_database.UIAction;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter books id : ");
        Long id = scanner.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        if (bookOpt.isPresent()) {
            System.out.println(bookOpt.toString());
        } else {
            System.out.println(bookOpt.isEmpty());
        }
    }
}
