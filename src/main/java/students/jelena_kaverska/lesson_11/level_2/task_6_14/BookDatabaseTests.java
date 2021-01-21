package students.jelena_kaverska.lesson_11.level_2.task_6_14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseTests {

    private BookDatabase db;

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testBookDeletionByID() {
        Book book = new Book("AAA", "BBB");
        db = new BookDatabaseImpl();
        boolean exp = true;
        db.save(book);
        boolean act = db.delete(book.getId());
        System.out.println("Book deletion by ID: " + printResults(exp == act));
    }

    void testBookDeletionByID2() {
        Book book = new Book("AAA", "BBB");
        List<Book> expectedBooks = new ArrayList<>(List.of(book));
        expectedBooks.remove(book);
        BookDatabaseImpl d = new BookDatabaseImpl();
        db.save(book);
        db.delete(book.getId());
        System.out.println("Book deletion by ID-2: " + printResults(d.getBooks().equals(expectedBooks)));
    }

    void testBookDeletionByID1() {
        Book book = new Book("AAA", "BBB");
        db = new BookDatabaseImpl();
        db.save(book);
        boolean exp = false;
        boolean act = db.delete(2L);
        System.out.println("Book deletion by non-existing ID: " + printResults(exp == act));
    }

    void testBookDeletion() {
        Book book = new Book("AAA", "BBB");
        db = new BookDatabaseImpl();
        boolean exp = true;
        db.save(book);
        boolean act = db.delete(book);
        System.out.println("Book deletion by book: " + printResults(exp == act));
    }

    void testBookDeletion1() {
        Book book = new Book("AAA", "BBB");
        db = new BookDatabaseImpl();
        boolean exp = false;
        db.save(book);
        boolean act = db.delete(new Book("CCC", "DDD"));
        System.out.println("Book deletion by non-existing book: " + printResults(exp == act));
    }

    void testFindByID() {
        db = new BookDatabaseImpl();
        Book book = new Book("AAA", "BBB");
        Optional<Book> exp = Optional.of(book);
        db.save(book);
        Optional<Book> act = db.findById(book.getId());
        System.out.println("Finding book by ID: " + printResults(exp.equals(act)));
    }

    void testFindByID1() {
        db = new BookDatabaseImpl();
        Book book = new Book("AAA", "BBB");
        Optional<Book> exp = Optional.empty();
        db.save(book);
        Optional<Book> act = db.findById(5L);
        System.out.println("Finding book by non-existing ID: " + printResults(exp.equals(act)));
    }

    void testFindByAuthor() {
        db = new BookDatabaseImpl();
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        db.save(book1);
        db.save(book2);
        db.save(book3);
        List<Book> exp = new ArrayList<>(List.of(book1, book2));
        List<Book> act = db.findByAuthor("Agatha Christie");
        System.out.println("Finding books by author: " + printResults(exp.equals(act)));
    }

    void testFindByAuthorNoBooks() {
        db = new BookDatabaseImpl();
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        db.save(book1);
        db.save(book2);
        db.save(book3);
        List<Book> exp = new ArrayList<>();
        List<Book> act = db.findByAuthor("AAAABBB");
        System.out.println("Finding books by non-existing author: " + printResults(exp.equals(act)));
    }

    void testFindByAuthor2() {
        BookDatabaseImpl d = new BookDatabaseImpl();
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        d.save(book1);
        d.save(book2);
        d.save(book3);
        List<Book> exp = new ArrayList<>(List.of(book1, book2));
        List<Book> act = d.findByAuthor1("Agatha Christie");
        System.out.println("Finding books by author one more: " + printResults(exp.equals(act)));
    }

    void testFindByAuthorNoBooks2() {
        BookDatabaseImpl d = new BookDatabaseImpl();
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        d.save(book1);
        d.save(book2);
        d.save(book3);
        List<Book> exp = new ArrayList<>();
        List<Book> act = d.findByAuthor1("AAAABBB");
        System.out.println("Finding books by non-existing author: " + printResults(exp.equals(act)));
    }

    void testfindByTitle() {
        db = new BookDatabaseImpl();
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        db.save(book1);
        db.save(book2);
        db.save(book3);
        List<Book> exp = new ArrayList<>(List.of(book3));
        List<Book> act = db.findByTitle("Atlas Shrugged");
        System.out.println("Finding books by title: " + printResults(exp.equals(act)));
    }

    void testfindByTitle1() {
        db = new BookDatabaseImpl();
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        db.save(book1);
        db.save(book2);
        db.save(book3);
        List<Book> exp = new ArrayList<>();
        List<Book> act = db.findByTitle("Atlas");
        System.out.println("Finding books by non-existing title: " + printResults(exp.equals(act)));
    }

    void testCountAllBooks() {
        db = new BookDatabaseImpl();
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        db.save(book1);
        db.save(book2);
        db.save(book3);
        int exp = 3;
        int act = db.countAllBooks();
        System.out.println("Counting all books: " + printResults(exp == act));
    }

    void testRemoveAllBookByAuthor() {
        BookDatabaseImpl bd = new BookDatabaseImpl();
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        bd.save(book1);
        bd.save(book2);
        bd.save(book3);
        List<Book> exp = new ArrayList<>(List.of(book3));
        bd.deleteByAuthor("Agatha Christie");
        List<Book> act = bd.getBooks();
        System.out.println("Delete all books (author): " + printResults(exp.equals(act)));
    }

    void testRemoveAllBookByTitle() {
        BookDatabaseImpl bd = new BookDatabaseImpl();
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        bd.save(book1);
        bd.save(book2);
        bd.save(book3);
        List<Book> exp = new ArrayList<>(List.of(book1, book3));
        bd.deleteByTitle("Poirot 2");
        List<Book> act = bd.getBooks();
        System.out.println("Delete all books (title): " + printResults(exp.equals(act)));
    }


    public static void main(String[] args) {
        BookDatabaseTests tests = new BookDatabaseTests();
        tests.testBookDeletionByID();
        tests.testBookDeletionByID2();
        tests.testBookDeletionByID1();
        tests.testBookDeletion();
        tests.testBookDeletion1();
        tests.testFindByID();
        tests.testFindByID1();
        tests.testFindByAuthor();
        tests.testFindByAuthorNoBooks();
        tests.testFindByAuthor2();
        tests.testFindByAuthorNoBooks2();
        tests.testfindByTitle();
        tests.testfindByTitle1();
        tests.testCountAllBooks();
        tests.testRemoveAllBookByAuthor();
        tests.testRemoveAllBookByTitle();
    }
}