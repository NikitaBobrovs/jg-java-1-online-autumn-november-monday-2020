package students.nikita_bobrovs.lesson_11.book_database.ui_action;

import students.nikita_bobrovs.lesson_11.book_database.BookDatabase;
import students.nikita_bobrovs.lesson_11.book_database.UIAction;

class FindUniqueTitlesUIAction implements UIAction {
    private final BookDatabase database;

    FindUniqueTitlesUIAction(BookDatabase database) {
        this.database = database;
    }

    @Override
    public void execute() {
        System.out.println("Unique titles : ");
        System.out.println(database.findUniqueTitles());
    }
}
