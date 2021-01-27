package students.nikita_bobrovs.lesson_11.BookDatabase.UIAction;

import students.nikita_bobrovs.lesson_11.BookDatabase.BookDatabase;

import java.util.Scanner;

public class DeleteByTitleUIAction implements UIAction{
    private final BookDatabase database;

    DeleteByTitleUIAction(BookDatabase database){
        this.database = database;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter books title : ");
        String title = scanner.next();
        database.deleteByTitle(title);
    }
}
