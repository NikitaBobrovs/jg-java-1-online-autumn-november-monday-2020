package students.nikita_bobrovs.lesson_10.level_6.task_19;

import java.util.ArrayList;
import java.util.List;

class IsReadTest {
    public static void main(String[] args) {
        IsReadTest isReadTest = new IsReadTest();
        isReadTest.isReadTest1();
        isReadTest.isReadTest2();
        isReadTest.isReadTest3();
    }

    private String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }

    private final BookReader bookReader = new BookReaderImpl();
    private List<Book> bookList = new ArrayList<>();

    private final Book book0 = new Book("Jack R", "Leroy Jenkins");
    private final Book book1 = new Book("Magic Academy", "Stephane Mayer");

    private void setBookList(List<Book> bookList) {
        bookList.add(book0);
        bookList.add(book1);
        this.bookList = bookList;
    }

    void isReadTest1() {
        setBookList(bookList);
        bookReader.isRead("Jack R", "Leroy Jenkins", bookList);
        System.out.println("Is read book test (contains book) : " + testResult
                (bookList.get(0).isRead()));
    }

    void isReadTest2() {
        setBookList(bookList);
        bookReader.isRead("Magic", "May", bookList);
        System.out.println("Is read book test (does not contain) : " + testResult
                (!bookList.get(1).isRead()));
    }

    void isReadTest3() {
        setBookList(bookList);
        System.out.println("Is read book test(boolean true) : " + testResult
                (bookReader.isRead("Jack R", "Leroy Jenkins", bookList)));
        System.out.println("Is read book test(boolean false) : " + testResult
                (!bookReader.isRead("Potter", "Bruh", bookList)));
    }
}
