package students.nikita_bobrovs.lesson_10.level_6.task_19;

import java.util.ArrayList;
import java.util.List;

class GetNotReadBooksTest {
    public static void main(String[] args) {
        GetNotReadBooksTest getNotReadBooksTest = new GetNotReadBooksTest();
        getNotReadBooksTest.getNotReadBooksTest1();
        getNotReadBooksTest.getNotReadBooksTest2();
    }

    private String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }

    private final Book book1 = new Book("Harry Potter", "Nikolay Gogol");
    private final Book book2 = new Book("Magic Academy", "Stephane Mayer");
    private final Book book3 = new Book("Henry", "Leroy J");
    private final Book book4 = new Book("Jack R", "Leroy Jenkins");

    private void setBookList(List<Book> bookList) {
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
    }

    void getNotReadBooksTest1() {
        book3.setNotRead(true);
        book4.setNotRead(true);
        BookReaderImpl bookReader = new BookReaderImpl();
        setBookList(bookReader.getLibrary());

        List<Book> expected = new ArrayList<>();
        expected.add(book3);
        expected.add(book4);

        System.out.println("Get read books (not null) : " + testResult
                (expected.equals(bookReader.getNotReadBooks())));
    }

    void getNotReadBooksTest2() {
        book3.setNotRead(false);
        book4.setNotRead(false);
        BookReaderImpl bookReader = new BookReaderImpl();
        setBookList(bookReader.getLibrary());

        List<Book> expected = new ArrayList<>();

        System.out.println("Find book by author (null) : " + testResult
                (expected.equals(bookReader.getNotReadBooks())));
    }
}
