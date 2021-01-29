package students.jelena_kaverska.lesson_11.level_6.task_30_38;

import java.util.Scanner;

class FindByAuthorUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    //task 33
    @Override
    public void execute() {
        System.out.println("Book search by author");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book author: ");
        String author = scanner.nextLine();
        System.out.println(bookDatabase.findByAuthor(author));
    }
}