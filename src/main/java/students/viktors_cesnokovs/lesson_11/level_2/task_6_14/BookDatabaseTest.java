package students.viktors_cesnokovs.lesson_11.level_2.task_6_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseTest {
    public static void main(String[] args) {
        BookDatabaseTest test = new BookDatabaseTest();
        test.bookDeletionById1();
        test.bookDeletionById2();
        test.bookDeletion1();
        test.bookDeletion2();
        test.findById1();
        test.findById2();
        test.findByAuthor1();
        test.findByAuthor2();
        test.findByTitle1();
        test.findByTitle2();
        test.countAllBooks();
        test.removeAllBooksByAuthor();
        test.removeAllBooksByTitle();
    }

    String testResult(boolean tester) {
        if (tester) {
            return "(OK)";
        } else
            return "(FAIL)";
    }

    void bookDeletionById1() {
        Book book = new Book("Dima", "Smetana");
        BookDatabaseImpl database = new BookDatabaseImpl();
        boolean expected = true;
        Long id = database.save(book);
        boolean result = database.delete(id);
        System.out.println("Delete book by Id : " + testResult(expected == result));
    }

    void bookDeletionById2() {
        Book book = new Book("Dima", "Smetana");
        BookDatabaseImpl database = new BookDatabaseImpl();
        boolean expected = false;
        Long id = database.save(book);
        boolean result = database.delete(2L);
        System.out.println("Delete book by Id(NOT EXISTING) : " + testResult(expected == result));
    }

    void bookDeletion1() {
        Book book = new Book("Dima", "Smetana");
        BookDatabaseImpl database = new BookDatabaseImpl();
        boolean expected = true;
        Long id = database.save(book);
        boolean result = database.delete(new Book(id, book.getAuthor(), book.getTitle()));
        System.out.println("Delete book  : " + testResult(expected == result));
    }

    void bookDeletion2() {
        Book book = new Book("Dima", "Smetana");
        BookDatabaseImpl database = new BookDatabaseImpl();
        boolean expected = false;
        Long id = database.save(book);
        boolean result = database.delete(new Book("Andrej", "Golub"));
        System.out.println("Delete book (NOT EXISTING) : " + testResult(expected == result));
    }

    void findById1() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book = new Book("Dima", "Smetana");
        Long id = database.save(book);
        Optional<Book> expected = Optional.of(new Book(id, book.getAuthor(), book.getTitle()));
        Optional<Book> result = database.findById(id);
        System.out.println("Find book by Id : " + testResult(expected.equals(result)));
    }

    void findById2() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book = new Book("Dima", "Smetana");
        Optional<Book> expected = Optional.empty();
        database.save(book);
        Optional<Book> result = database.findById(10L);
        System.out.println("Find book by Id(NOT EXISTING) : " + testResult(expected.equals(result)));
    }

    void findByAuthor1() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Dima", "Smetana");
        Book book2 = new Book("Dima", "Moloko");
        Book book3 = new Book("Andrej", "Golub");
        Book book4 = new Book("Borja", "Samolet");
        Long id1 = database.save(book1);
        Long id2 = database.save(book2);
        List<Book> expected = new ArrayList<>(List.of(new Book(id1, book1.getAuthor(), book1.getTitle()),
                new Book(id2, book2.getAuthor(), book2.getTitle())));
        List<Book> result = database.findByAuthor("Dima");
        System.out.println("Find book by author : " + testResult(expected.equals(result)));
    }

    void findByAuthor2() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Dima", "Smetana");
        Book book2 = new Book("Dima", "Moloko");
        Book book3 = new Book("Andrej", "Golub");
        Book book4 = new Book("Borja", "Samolet");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        List<Book> expected = new ArrayList<>();
        List<Book> result = database.findByAuthor("Chiki-Briki");
        System.out.println("Find book by author(NOT EXISTING) : " + testResult(expected.equals(result)));
    }

    void findByTitle1() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Dima", "Smetana");
        Book book2 = new Book("Dima", "Moloko");
        Book book3 = new Book("Andrej", "Golub");
        Book book4 = new Book("Borja", "Samolet");
        database.save(book1);
        database.save(book2);
        database.save(book4);
        Long id1 = database.save(book3);
        List<Book> expected = new ArrayList<>(List.of(new Book(id1, book3.getAuthor(), book3.getTitle())));
        List<Book> result = database.findByTitle("Golub");
        System.out.println("Find book by title : " + testResult(expected.equals(result)));
    }

    void findByTitle2() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Dima", "Smetana");
        Book book2 = new Book("Dima", "Moloko");
        Book book3 = new Book("Andrej", "Golub");
        Book book4 = new Book("Borja", "Samolet");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        List<Book> expected = new ArrayList<>();
        List<Book> result = database.findByTitle("Chiki-Briki");
        System.out.println("Find book by title(NOT EXISTING) : " + testResult(expected.equals(result)));
    }

    void countAllBooks() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Dima", "Smetana");
        Book book2 = new Book("Dima", "Moloko");
        Book book3 = new Book("Andrej", "Golub");
        Book book4 = new Book("Borja", "Samolet");
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        int expected = 4;
        int result = database.countAllBooks();
        System.out.println("Count all books : " + testResult(expected == result));
    }

    void removeAllBooksByAuthor() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Dima", "Smetana");
        Book book2 = new Book("Dima", "Smetana");
        Book book3 = new Book("Andrej", "Golub");
        Book book4 = new Book("Andrej", "Samolet");
        Long id1 = database.save(book1);
        Long id2 = database.save(book2);
        database.save(book3);
        database.save(book4);
        List<Book> expected = new ArrayList<>(List.of(new Book(id1, book1.getAuthor(), book1.getTitle()),
                new Book(id2, book2.getAuthor(), book2.getTitle())));
        database.deleteByAuthor("Andrej");
        List<Book> result = database.getBooks();
        System.out.println("Delete all books by author : " + testResult(expected.equals(result)));
    }

    void removeAllBooksByTitle() {
        BookDatabaseImpl database = new BookDatabaseImpl();
        Book book1 = new Book("Dima", "Smetana");
        Book book2 = new Book("Dima", "Golub");
        Book book3 = new Book("Andrej", "Chiki");
        Book book4 = new Book("Borja", "Chiki");
        Long id1 = database.save(book1);
        Long id2 = database.save(book2);
        database.save(book3);
        database.save(book4);
        List<Book> expected = new ArrayList<>(List.of(new Book(id1, book1.getAuthor(), book1.getTitle()),
                new Book(id2, book2.getAuthor(), book2.getTitle())));
        database.deleteByTitle("Chiki");
        List<Book> result = database.getBooks();
        System.out.println("Delete all books by title : " + testResult(expected.equals(result)));
    }
}
