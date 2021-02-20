package students.jelena_kaverska.lesson_11.level_6.task_30_38;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    //task 32
    @Override
    public void execute() {
        System.out.println("Book search by id");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book id: ");
        Long id = scanner.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        System.out.println(bookOpt);
    }
}