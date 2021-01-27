package students.nikita_bobrovs.lesson_11.BookDatabase.UIAction;

import students.nikita_bobrovs.lesson_11.BookDatabase.BookDatabase;

import java.util.Scanner;

public class DeleteByAuthorUIAction implements UIAction{
    private final BookDatabase database;

    DeleteByAuthorUIAction(BookDatabase database){
        this.database = database;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter books author : ");
        String author = scanner.next();
        database.deleteByAuthor(author);
    }
}
