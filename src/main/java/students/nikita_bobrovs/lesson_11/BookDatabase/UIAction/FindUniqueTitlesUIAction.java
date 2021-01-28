package students.nikita_bobrovs.lesson_11.BookDatabase.UIAction;

import students.nikita_bobrovs.lesson_11.BookDatabase.BookDatabase;

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
