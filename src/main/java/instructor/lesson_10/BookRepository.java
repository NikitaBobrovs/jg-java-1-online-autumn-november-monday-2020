package instructor.lesson_10;


import java.util.Objects;
import java.util.Optional;

class BookRepositoryDemo {

    public static void main(String[] args) {

        BookRepository repository = new InMemoryBookRepository();

        repository.save(new Book("123", "Hello World", "John Doe"));
        Optional<Book> bookOptional = repository.findById("123");
        repository.delete(bookOptional.get());

    }
}

interface BookRepository {

    Optional<Book> findById(String id);

    boolean save(Book book);

    boolean delete(Book book);

}

class InMemoryBookRepository implements BookRepository {

    private final Book[] books = new Book[10];
    private int cursor = 0;

    @Override
    public Optional<Book> findById(String id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public boolean save(Book book) {
        books[cursor] = book;
        cursor++;
        return true;
    }

    @Override
    public boolean delete(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(book)) {
                books[i] = null;
                return true;
            }
        }
        return false;
    }
}

// POJO
class Book {

    private final String id;
    private final String title;
    private final String author;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }
}
