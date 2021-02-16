package students.nikita_bobrovs.lesson_11.book_database.ui_action;

import students.nikita_bobrovs.lesson_11.book_database.BookDatabase;
import students.nikita_bobrovs.lesson_11.book_database.UIAction;

import java.util.Arrays;

class FindUniqueBooksUIAction implements UIAction {
    private final BookDatabase database;

    FindUniqueBooksUIAction(BookDatabase database) {
        this.database = database;
    }

    @Override
    public void execute() {
        System.out.println("Unique books : ");
        System.out.println(Arrays.toString(database.findUniqueBooks().toArray()));
    }
}
