package students.nikita_bobrovs.lesson_11.BookDatabase.UIAction;

import students.nikita_bobrovs.lesson_11.BookDatabase.BookDatabase;


class CountAllBooksUIAction implements UIAction{
    private BookDatabase database;

    CountAllBooksUIAction(BookDatabase database){
        this.database = database;
    }

    @Override
    public void execute() {
        System.out.println("Currently in library : " +database.countAllBooks()+" books.");
    }
}
