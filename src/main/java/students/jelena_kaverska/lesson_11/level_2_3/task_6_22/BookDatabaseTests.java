package students.jelena_kaverska.lesson_11.level_2_3.task_6_22;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseTests {

    private BookDatabaseImpl db;
    private SearchCriteria sc;

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testBookDeletionByID() {
        Book book = new Book("AAA", "BBB");
        db = new BookDatabaseImpl();
        boolean exp = true;
        Long id = db.save(book);
        boolean act = db.delete(id);
        System.out.println("Book deletion by ID: " + printResults(exp == act));
    }

    void testBookDeletionByID1() {
        Book book = new Book("AAA", "BBB");
        db = new BookDatabaseImpl();
        Long id = db.save(book);
        boolean exp = false;
        boolean act = db.delete(2L);
        System.out.println("Book deletion by non-existing ID: " + printResults(exp == act));
    }

    void testBookDeletion() {
        Book book = new Book("AAA", "BBB");
        db = new BookDatabaseImpl();
        boolean exp = true;
        Long id = db.save(book);
        boolean act = db.delete(new Book(id, book.getAuthor(), book.getTitle()));
        System.out.println("Book deletion by book: " + printResults(exp == act));
    }

    void testBookDeletion1() {
        Book book = new Book("AAA", "BBB");
        db = new BookDatabaseImpl();
        boolean exp = false;
        Long id = db.save(book);
        boolean act = db.delete(new Book("CCC", "DDD"));
        System.out.println("Book deletion by non-existing book: " + printResults(exp == act));
    }

    void testFindByID() {
        db = new BookDatabaseImpl();
        Book book = new Book("AAA", "BBB");
        Long id = db.save(book);
        Optional<Book> exp = Optional.of(new Book(id, book.getAuthor(), book.getTitle()));
        Optional<Book> act = db.findById(id);
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
        Long id1 = db.save(book1);
        Long id2 = db.save(book2);
        List<Book> exp = new ArrayList<>(List.of(new Book(id1, book1.getAuthor(), book2.getTitle()),
                new Book(id2, book2.getAuthor(), book2.getTitle())));
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
        Long id3 = db.save(book3);
        List<Book> exp = new ArrayList<>(List.of(new Book(id3, book3.getAuthor(), book3.getTitle())));
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
        Long id3 = bd.save(book3);
        List<Book> exp = new ArrayList<>(List.of(new Book(id3, book3.getAuthor(), book3.getTitle())));
        bd.deleteByAuthor("Agatha Christie");
        List<Book> act = bd.getBooks();
        System.out.println("Delete all books (author): " + printResults(exp.equals(act)));
    }

    void testRemoveAllBookByTitle() {
        BookDatabaseImpl bd = new BookDatabaseImpl();
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book2 = new Book("Agatha Christie", "Poirot 2");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        Long id1 = bd.save(book1);
        bd.save(book2);
        Long id3 = bd.save(book3);
        List<Book> exp = new ArrayList<>(List.of(new Book(id1, book1.getAuthor(), book1.getTitle()),
                new Book(id3, book3.getAuthor(), book3.getTitle())));
        bd.deleteByTitle("Poirot 2");
        List<Book> act = bd.getBooks();
        System.out.println("Delete all books (title): " + printResults(exp.equals(act)));
    }

    void testBookList() {
        sc = new OrSearchCriteria(new TitleSearchCriteria("Atlas Shrugged"),
                new AuthorSearchCriteria("Turgenev"));
        db = new BookDatabaseImpl();
        Book book1 = new Book("Agatha Christie", "Poirot 1");
        Book book2 = new Book("Turgenev", "Mumu");
        Book book3 = new Book("Ayn Rand", "Atlas Shrugged");
        Long id1 = db.save(book1);
        Long id2 = db.save(book2);
        Long id3 = db.save(book3);
        List<Book> exp = List.of(new Book(id2, book2.getAuthor(), book2.getTitle()),
                new Book(id3, book3.getAuthor(), book3.getTitle()));
        List<Book> act = db.find(sc);
        System.out.println("Find books by multiple criterion: " + printResults(exp.equals(act)));
    }


    public static void main(String[] args) {
        BookDatabaseTests tests = new BookDatabaseTests();
        tests.testBookDeletionByID();
        tests.testBookDeletionByID1();
        tests.testBookDeletion();
        tests.testBookDeletion1();
        tests.testFindByID();
        tests.testFindByID1();
        tests.testFindByAuthor();
        tests.testFindByAuthorNoBooks();
        tests.testFindByAuthorNoBooks2();
        tests.testfindByTitle();
        tests.testfindByTitle1();
        tests.testCountAllBooks();
        tests.testRemoveAllBookByAuthor();
        tests.testRemoveAllBookByTitle();
        tests.testBookList();
    }
}