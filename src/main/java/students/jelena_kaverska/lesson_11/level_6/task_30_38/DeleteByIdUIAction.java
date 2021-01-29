package students.jelena_kaverska.lesson_11.level_6.task_30_38;

import java.util.Scanner;

class DeleteByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    //task 35
    @Override
    public void execute() {
        System.out.println("Book deletion by ID");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book ID: ");
        Long id = Long.parseLong(scanner.nextLine());
        boolean result = bookDatabase.delete(id);
        if (result){
            System.out.println("Book deleted");
        }
        else {
            System.out.println("Book not found");
        }
    }
}