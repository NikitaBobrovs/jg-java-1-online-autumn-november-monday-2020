package students.jelena_kaverska.lesson_11.level_6.task_30_38;

class PrintAllBooks implements UIAction{
    private BookDatabase bookDatabase;

    public PrintAllBooks(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Printing all existing books");
        System.out.println(bookDatabase.getAllBooks());
    }
}