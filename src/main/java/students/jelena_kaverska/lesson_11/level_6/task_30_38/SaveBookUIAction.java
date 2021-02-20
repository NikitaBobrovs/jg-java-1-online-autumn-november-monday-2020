package students.jelena_kaverska.lesson_11.level_6.task_30_38;

import java.util.Scanner;

class SaveBookUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    //task 31
    @Override
    public void execute() {
        System.out.println("Saving book");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title: ");
        String title = scanner.nextLine();
        System.out.println("Enter book author: ");
        String author = scanner.nextLine();
        bookDatabase.save(new Book(author, title));
    }
}