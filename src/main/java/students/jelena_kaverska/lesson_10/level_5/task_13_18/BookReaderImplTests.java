package students.jelena_kaverska.lesson_10.level_5.task_13_18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class BookReaderImplTests {
    private BookReader bookReader;

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testAddBook() {
        bookReader = new BookReaderImpl();
        boolean exp = true;
        boolean act = bookReader.add(new Book("Atlas Shrugged", "Ayn Rand"));
        System.out.println("Test add a new book: " + printResults(exp == act));
    }

    void testAddBook1() {
        bookReader = new BookReaderImpl();
        Book bookToAdd = new Book("Atlas Shrugged", "Ayn Rand");
        bookReader.add(bookToAdd);
        boolean exp = false;
        boolean act = bookReader.add(bookToAdd);
        System.out.println("Test add already added book: " + printResults(exp == act));
    }

    void testAddBlankTitle() {
        bookReader = new BookReaderImpl();
        boolean exp = false;
        boolean act = bookReader.add(new Book("", "Ayn Rand"));
        System.out.println("Test add a new book with blank title: " + printResults(exp == act));
    }

    void testAddBlankAuthor() {
        bookReader = new BookReaderImpl();
        boolean exp = false;
        boolean act = bookReader.add(new Book("Atlas Shrugged", ""));
        System.out.println("Test add a new book with blank author: " + printResults(exp == act));
    }

    void testAddBlankAuthorAndTitle() {
        bookReader = new BookReaderImpl();
        boolean exp = false;
        boolean act = bookReader.add(new Book("", ""));
        System.out.println("Test add a new book with blank title and author: " + printResults(exp == act));
    }

    void testAddEmptyAuthorAndTitle() {
        bookReader = new BookReaderImpl();
        boolean exp = false;
        boolean act = bookReader.add(new Book(null, null));
        System.out.println("Test add a new book without title and author: " + printResults(exp == act));
    }

    void testAddEmptyAuthor() {
        bookReader = new BookReaderImpl();
        boolean exp = false;
        boolean act = bookReader.add(new Book("Atlas Shrugged", null));
        System.out.println("Test add a new book without author: " + printResults(exp == act));
    }

    void testAddEmptyTitle() {
        bookReader = new BookReaderImpl();
        boolean exp = false;
        boolean act = bookReader.add(new Book(null, "Ayn Rand"));
        System.out.println("Test add a new book without title: " + printResults(exp == act));
    }

    void testDeletion() {
        bookReader = new BookReaderImpl();
        Book book = new Book("1984", "George Orwell");
        bookReader.add(book);
        boolean exp = true;
        boolean act = bookReader.delete(book);
        System.out.println("Test book deletion: " + printResults(exp == act));
    }

    void testDeletion1() {
        bookReader = new BookReaderImpl();
        Book book = new Book("1984", "George Orwell");
        bookReader.add(book);
        boolean exp = false;
        boolean act = bookReader.delete(new Book("Atlas Shrugged", "Ayn Rand"));
        System.out.println("Test book deletion 2: " + printResults(exp == act));
    }

    void testFindByAuthorOneBook() {
        Book book = new Book("1984", "George Orwell");
        List<Book> exp = new ArrayList<>(List.of(book));
        bookReader = new BookReaderImpl();
        bookReader.add(book);
        List<Book> act = bookReader.findByAuthor("George Orwell");
        System.out.println("Test finding one book by author: " + printResults(exp.equals(act)));
    }

    void testFindByAuthorMultipleBooks() {
        Book book1 = new Book("Poirot", "Agatha Christie");
        Book book2 = new Book("Ms Marple", "Agatha Christie");
        List<Book> exp = new ArrayList<>(List.of(book1, book2));
        bookReader = new BookReaderImpl();
        bookReader.add(book1);
        bookReader.add(book2);
        List<Book> act = bookReader.findByAuthor("Agatha Christie");
        System.out.println("Test finding multiple books by author: " + printResults(exp.equals(act)));
    }

    void testFindByAuthorOneBook2() {
        Book book = new Book("1984", "George Orwell");
        List<Book> exp = new ArrayList<>(List.of(book));
        bookReader = new BookReaderImpl();
        bookReader.add(book);
        List<Book> act = bookReader.findByAuthor("Orwell");
        System.out.println("Test finding one book by author (partially): " + printResults(exp.equals(act)));
    }

    void testFindByAuthorMultipleBooks2() {
        Book book1 = new Book("Poirot", "Agatha Christie");
        Book book2 = new Book("Ms Marple", "Agatha Christie");
        List<Book> exp = new ArrayList<>(List.of(book1, book2));
        bookReader = new BookReaderImpl();
        bookReader.add(book1);
        bookReader.add(book2);
        List<Book> act = bookReader.findByAuthor("Agatha");
        System.out.println("Test finding multiple books by author (partially): " + printResults(exp.equals(act)));
    }

    void testGetAllBooks() {
        bookReader = new BookReaderImpl();
        Book b1 = new Book("Atlas Shrugged", "Ayn Rand");
        Book b2 = new Book("1984", "George Orwell");
        bookReader.add(b1);
        bookReader.add(b2);
        List<Book> exp = new ArrayList<>(List.of(b2, b1));
        List<Book> act = bookReader.getAllBooks();
        exp.sort(Comparator.comparing(Book::getTitle));
        act.sort(Comparator.comparing(Book::getTitle));
        System.out.println("All books test: " + printResults(exp.equals(act)));
    }

    public static void main(String[] args) {
        BookReaderImplTests tests = new BookReaderImplTests();
        tests.testAddBook();
        tests.testAddBook1();
        tests.testAddBlankTitle();
        tests.testAddBlankAuthor();
        tests.testAddBlankAuthorAndTitle();
        tests.testAddEmptyAuthorAndTitle();
        tests.testAddEmptyAuthor();
        tests.testAddEmptyTitle();
        tests.testDeletion();
        tests.testDeletion1();
        tests.testFindByAuthorOneBook();
        tests.testFindByAuthorMultipleBooks();
        tests.testFindByAuthorOneBook2();
        tests.testFindByAuthorMultipleBooks2();
        tests.testGetAllBooks();
    }
}