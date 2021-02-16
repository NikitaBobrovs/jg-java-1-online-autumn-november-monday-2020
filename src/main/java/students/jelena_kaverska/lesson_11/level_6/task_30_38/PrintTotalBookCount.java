package students.jelena_kaverska.lesson_11.level_6.task_30_38;

class PrintTotalBookCount implements UIAction {
    private BookDatabase bookDatabase;

    public PrintTotalBookCount(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("Total books count: " + bookDatabase.countAllBooks());
    }
}