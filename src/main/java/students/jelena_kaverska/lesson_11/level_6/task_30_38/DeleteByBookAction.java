package students.jelena_kaverska.lesson_11.level_6.task_30_38;

import java.util.Scanner;

class DeleteByBookAction implements UIAction{
    private BookDatabase bookDatabase;

    public DeleteByBookAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Book deletion by author and title");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book author: ");
        String author = scanner.nextLine();
        System.out.println("Enter book title: ");
        String title = scanner.nextLine();
        boolean result = bookDatabase.delete(new Book(author, title));
        if (result){
            System.out.println("Book deleted");
        }
        else {
            System.out.println("Book not found");
        }
    }
}