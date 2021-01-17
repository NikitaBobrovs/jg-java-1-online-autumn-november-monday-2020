package students.jelena_kaverska.lesson_10.level_6.tasks_19_24;

import java.util.ArrayList;
import java.util.List;

class BookReaderTests {
    private BookReader bookReader;

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testFindByTitleOneBook() {
        Book book = new Book("Atlas Shrugged", "Ayn Rand");
        List<Book> exp = new ArrayList<>(List.of(book));
        bookReader = new BookReaderImpl();
        bookReader.add(book);
        List<Book> act = bookReader.findByTitle("Atlas Shrugged");
        System.out.println("Find one book by title: " + printResults(exp.equals(act)));
    }

    void testFindByTitleOneBook1() {
        Book book = new Book("Atlas Shrugged", "Ayn Rand");
        List<Book> exp = new ArrayList<>(List.of(book));
        bookReader = new BookReaderImpl();
        bookReader.add(book);
        List<Book> act = bookReader.findByTitle("Atlas");
        System.out.println("Find one book by partial title: " + printResults(exp.equals(act)));
    }

    void testFindByTitleMultipleBooks() {
        Book book1 = new Book("Poirot 1", "Agatha Christie");
        Book book2 = new Book("Poirot 2", "Agatha Christie");
        List<Book> exp = new ArrayList<>(List.of(book1, book2));
        bookReader = new BookReaderImpl();
        bookReader.add(book1);
        bookReader.add(book2);
        List<Book> act = bookReader.findByTitle("Poir");
        System.out.println("Find multiple books by partial title: " + printResults(exp.equals(act)));
    }

    void testMarkAsRead() {
        Book book = new Book("Poirot 1", "Agatha Christie");
        bookReader = new BookReaderImpl();
        bookReader.add(book);
        boolean exp = true;
        boolean act = bookReader.markAsRead(book);
        System.out.println("Mark as read non-read book: " + printResults(exp == act));
    }

    void testMarkAsReadAlreadyRead() {
        Book book = new Book("Poirot 1", "Agatha Christie");
        book.setRead(true);
        bookReader = new BookReaderImpl();
        bookReader.add(book);
        boolean exp = false;
        boolean act = bookReader.markAsRead(book);
        System.out.println("Mark as read already read book: " + printResults(exp == act));
    }

    void testMarkAsReadNonExisting() {
        Book book = new Book("Poirot 1", "Agatha Christie");
        bookReader = new BookReaderImpl();
        boolean exp = false;
        boolean act = bookReader.markAsRead(book);
        System.out.println("Mark as read non-existing book: " + printResults(exp == act));
    }

    void testMarkAsUnRead() {
        Book book = new Book("Poirot 1", "Agatha Christie");
        book.setRead(true);
        bookReader = new BookReaderImpl();
        bookReader.add(book);
        boolean exp = true;
        boolean act = bookReader.markAsUnRead(book);
        System.out.println("Mark as unread already read book: " + printResults(exp == act));
    }

    void testMarkAsUnReadAlreadyUnRead() {
        Book book = new Book("Poirot 1", "Agatha Christie");
        bookReader = new BookReaderImpl();
        bookReader.add(book);
        boolean exp = false;
        boolean act = bookReader.markAsUnRead(book);
        System.out.println("Mark as unread already unread book: " + printResults(exp == act));
    }

    void testMarkAsUnReadNonExisting() {
        Book book = new Book("Poirot 1", "Agatha Christie");
        bookReader = new BookReaderImpl();
        boolean exp = false;
        boolean act = bookReader.markAsRead(book);
        System.out.println("Mark as unread non-existing book: " + printResults(exp == act));
    }

    public static void main(String[] args) {
        BookReaderTests tests = new BookReaderTests();
        tests.testFindByTitleOneBook();
        tests.testFindByTitleOneBook1();
        tests.testFindByTitleMultipleBooks();
        tests.testMarkAsRead();
        tests.testMarkAsReadAlreadyRead();
        tests.testMarkAsReadNonExisting();
        tests.testMarkAsUnRead();
        tests.testMarkAsUnReadAlreadyUnRead();
        tests.testMarkAsUnReadNonExisting();
    }
}