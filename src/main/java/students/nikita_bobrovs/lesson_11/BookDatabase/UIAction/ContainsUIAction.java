package students.nikita_bobrovs.lesson_11.BookDatabase.UIAction;

import students.nikita_bobrovs.lesson_11.BookDatabase.Book;
import students.nikita_bobrovs.lesson_11.BookDatabase.BookDatabase;

import java.util.Scanner;

class ContainsUIAction implements UIAction{
    private final BookDatabase database;

    ContainsUIAction(BookDatabase database) {
        this.database = database;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter books author : ");
        String author = scanner.next();
        System.out.println("Enter books title : ");
        String title = scanner.next();
        System.out.println("Enter books year of issue : ");
        String yearOfIssue = scanner.next();

        Book book = new Book(author,title,yearOfIssue);
        if (database.contains(book)){
            System.out.println("Library contains this book");
        } else {
            System.out.println("Library does not contain this book");
        }
    }
}
