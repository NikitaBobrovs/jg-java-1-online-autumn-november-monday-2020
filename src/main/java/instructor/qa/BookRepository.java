package instructor.qa;

import java.util.ArrayList;
import java.util.List;

class BookRepository {

    private final List<Book> books;

    public BookRepository(List<Book> books) {
        this.books = books;
    }

    public Book findById(String id) {
        //TODO REAL LOGIC
        return new Book();
    }

    public void save(Book book) {
        this.books.add(book);
    }
}

class Book {

    private String id;
    private String title;

}

class BookRepositoryTest {

    public static void shouldFind() {
        List<Book> books = List.of(new Book(), new Book(), new Book());
        BookRepository subject = new BookRepository(books);

        // assertion
        subject.findById("123");
    }
}
