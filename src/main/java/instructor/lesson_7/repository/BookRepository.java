package instructor.lesson_7.repository;

class BookRepository {

    private Book[] books = new Book[100];
    private int cursor = 0;

    public Book find(String isbn) {
        for (Book book : books) {
            if (book == null) {
                continue;
            }
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public void save(Book book) {
        books[cursor] = book;
        cursor++;
    }
}
