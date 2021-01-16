package students.nikita_bobrovs.lesson_10.level_6.task_19;

import java.util.ArrayList;
import java.util.List;

class IsNotReadTest {
    public static void main(String[] args) {
        IsNotReadTest isNotReadTest = new IsNotReadTest();
        isNotReadTest.isNotReadTest1();
        isNotReadTest.isNotReadTest2();
        isNotReadTest.isNotReadTest3();
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

    void isNotReadTest1() {
        setBookList(bookList);
        bookReader.isNotRead("Jack R", "Leroy Jenkins", bookList);
        System.out.println("Is not read book test (true) : " + testResult
                (bookList.get(0).isNotRead()));
    }

    void isNotReadTest2() {
        setBookList(bookList);
        bookReader.isNotRead("Magic", "May", bookList);
        System.out.println("Is not read book test (false) : " + testResult
                (!bookList.get(1).isNotRead()));
    }

    void isNotReadTest3() {
        setBookList(bookList);
        System.out.println("Is not read book test(boolean true) : " + testResult
                (bookReader.isNotRead("Jack R", "Leroy Jenkins", bookList)));
        System.out.println("Is not read book test(boolean false) : " + testResult
                (!bookReader.isNotRead("Potter", "Bruh", bookList)));
    }
}
