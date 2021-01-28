package students.nikita_bobrovs.lesson_11.BookDatabase.UIAction;

import students.nikita_bobrovs.lesson_11.BookDatabase.BookDatabase;

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
