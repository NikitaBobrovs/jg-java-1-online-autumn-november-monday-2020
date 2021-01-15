package students.nikita_bobrovs.lesson_10.level_5.task_13;

import java.util.ArrayList;
import java.util.List;

class AddBookTest {
    public static void main(String[] args) {
        AddBookTest addBookTest = new AddBookTest();
        addBookTest.addBookTest1();
        addBookTest.addBookTest2();
        addBookTest.addBookTest3();
    }

    private String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }

    BookReader bookReader = new BookReaderImpl();

    void addBookTest1() {
        BookLibrary bookLibrary = new BookLibrary();
        List<Book> expected = new ArrayList<>();
        Book book1 = new Book("Harry Potter", "Nikolay Gogol");
        Book book2 = new Book("Magic Academy", "Stephane Mayer");
        expected.add(book1);
        expected.add(book2);

        bookReader.addBook(book1, bookLibrary.getLibrary());
        bookReader.addBook(book2, bookLibrary.getLibrary());

        System.out.println("Add books test (list check)(not null) : " + testResult
                (expected.equals(bookLibrary.getLibrary())));
    }

    void addBookTest2() {
        BookLibrary bookLibrary = new BookLibrary();
        List<Book> expected = new ArrayList<>();
        Book book1 = new Book("Harry Potter", "Nikolay Gogol");
        Book book2 = new Book("Magic Academy", null);
        expected.add(book1);

        bookReader.addBook(book1, bookLibrary.getLibrary());
        bookReader.addBook(book2, bookLibrary.getLibrary());

        System.out.println("Add book test (list check)(null) : " + testResult
                (expected.equals(bookLibrary.getLibrary())));
    }

    void addBookTest3() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book1 = new Book("Harry Potter", "Nikolay Gogol");
        Book book2 = new Book("Magic Academy", null);

        System.out.println("Add book test (boolean result true) : " + testResult
                (bookReader.addBook(book1, bookLibrary.getLibrary())));
        System.out.println("Add book test(boolean result false) : " + testResult
                (!bookReader.addBook(book2, bookLibrary.getLibrary())));
    }
}
