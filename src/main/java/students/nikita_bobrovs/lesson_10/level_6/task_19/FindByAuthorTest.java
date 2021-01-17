package students.nikita_bobrovs.lesson_10.level_6.task_19;

import java.util.ArrayList;
import java.util.List;

class FindByAuthorTest {
    public static void main(String[] args) {
        FindByAuthorTest findByAuthorTest = new FindByAuthorTest();
        findByAuthorTest.findByAuthorTest1();
        findByAuthorTest.findByAuthorTest2();
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

    void findByAuthorTest1() {
        BookReaderImpl bookReader = new BookReaderImpl();
        setBookList(bookReader.getLibrary());

        List<Book> expected = new ArrayList<>();
        expected.add(book3);
        expected.add(book4);

        System.out.println("Find book by author (not null) : " + testResult
                (expected.equals(bookReader.findByAuthor("Leroy"))));
    }

    void findByAuthorTest2() {
        BookReaderImpl bookReader = new BookReaderImpl();
        setBookList(bookReader.getLibrary());

        List<Book> expected = new ArrayList<>();

        System.out.println("Find book by author (null) : " + testResult
                (expected.equals(bookReader.findByAuthor("Sarah"))));
    }
}
