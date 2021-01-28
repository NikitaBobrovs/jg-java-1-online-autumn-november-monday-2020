package students.nikita_bobrovs.lesson_11.book_database.ui_action;

import students.nikita_bobrovs.lesson_11.book_database.BookDatabase;
import students.nikita_bobrovs.lesson_11.book_database.UIAction;


class CountAllBooksUIAction implements UIAction {
    private BookDatabase database;

    CountAllBooksUIAction(BookDatabase database) {
        this.database = database;
    }

    @Override
    public void execute() {
        System.out.println("Currently in library : " + database.countAllBooks() + " books.");
    }
}
