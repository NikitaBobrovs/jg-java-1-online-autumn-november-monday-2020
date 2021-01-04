package students.jelena_kaverska.lesson_8.level_7.task_31;

class Library {
    private Book [] books = new Book[100];
    private int position = 0;

    public Book[] getBooks() {
        return books;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}