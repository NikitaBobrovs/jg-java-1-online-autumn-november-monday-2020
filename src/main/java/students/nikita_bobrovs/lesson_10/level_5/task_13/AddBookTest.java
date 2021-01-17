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


    void addBookTest1() {
        BookReaderImpl bookReader = new BookReaderImpl();
        List<Book> expected = new ArrayList<>();
        Book book1 = new Book("Harry Potter", "Nikolay Gogol");
        Book book2 = new Book("Magic Academy", "Stephane Mayer");
        expected.add(book1);
        expected.add(book2);

        bookReader.addBook(book1);
        bookReader.addBook(book2);

        System.out.println("Add books test (list check)(not null) : " + testResult
                (expected.equals(bookReader.getLibrary())));
    }

    void addBookTest2() {
        BookReaderImpl bookReader = new BookReaderImpl();
        List<Book> expected = new ArrayList<>();
        Book book1 = new Book("Harry Potter", "Nikolay Gogol");
        Book book2 = new Book("Magic Academy", null);
        expected.add(book1);

        bookReader.addBook(book1);
        bookReader.addBook(book2);

        System.out.println("Add book test (list check)(null) : " + testResult
                (expected.equals(bookReader.getLibrary())));
    }

    void addBookTest3() {
        BookReaderImpl bookReader = new BookReaderImpl();
        Book book1 = new Book("Harry Potter", "Nikolay Gogol");
        Book book2 = new Book("Magic Academy", null);

        System.out.println("Add book test (boolean result true) : " + testResult
                (bookReader.addBook(book1)));
        System.out.println("Add book test(boolean result false) : " + testResult
                (!bookReader.addBook(book2)));
    }
}
