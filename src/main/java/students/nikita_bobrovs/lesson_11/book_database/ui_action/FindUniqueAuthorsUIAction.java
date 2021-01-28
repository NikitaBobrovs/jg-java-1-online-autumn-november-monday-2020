package students.nikita_bobrovs.lesson_11.book_database.ui_action;

import students.nikita_bobrovs.lesson_11.book_database.BookDatabase;
import students.nikita_bobrovs.lesson_11.book_database.UIAction;

class FindUniqueAuthorsUIAction implements UIAction {
    private final BookDatabase database;

    FindUniqueAuthorsUIAction(BookDatabase database) {
        this.database = database;
    }

    @Override
    public void execute() {
        System.out.println("All unique authors : ");
        System.out.println(database.findUniqueAuthors());
    }
}
