package students.jelena_kaverska.lesson_11.level_6.task_30_38;

import java.util.Scanner;

class FindByTitleUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    //task 34
    @Override
    public void execute() {
        System.out.println("Book search by title");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title: ");
        String title = scanner.nextLine();
        System.out.println(bookDatabase.findByTitle(title));
    }
}