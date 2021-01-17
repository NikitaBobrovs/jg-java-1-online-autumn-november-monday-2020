package students.nikita_bobrovs.lesson_10.level_5.task_13;

import java.util.ArrayList;
import java.util.List;

class findByAuthorPartNameTest {
    public static void main(String[] args) {
        findByAuthorPartNameTest findByAuthorPartNameTest = new findByAuthorPartNameTest();
        findByAuthorPartNameTest.findByAuthorPartNameTest1();
        findByAuthorPartNameTest.findByAuthorPartNameTest2();
    }

    private String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }

    Book book1 = new Book("Harry Potter", "Nikolay Gogol");
    Book book2 = new Book("Magic Academy", "Stephane Mayer");
    Book book3 = new Book("Henry", "Leroy J");
    Book book4 = new Book("Jack R", "Leroy Jenkins");

    private void setBookList(List<Book> bookList) {
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
    }

    void findByAuthorPartNameTest1() {
        BookReaderImpl bookReader = new BookReaderImpl();
        setBookList(bookReader.getLibrary());

        List<Book> expected = new ArrayList<>();
        expected.add(book3);
        expected.add(book4);

        System.out.println("Find book by authors part name(not null) : " + testResult
                (expected.equals(bookReader.findByAuthorPartName("Leroy"))));
    }

    void findByAuthorPartNameTest2() {
        BookReaderImpl bookReader = new BookReaderImpl();
        setBookList(bookReader.getLibrary());

        List<Book> expected = new ArrayList<>();

        System.out.println("Find book by authors part name(not null) : " + testResult
                (expected.equals(bookReader.findByAuthorPartName("Sarah"))));
    }
}
