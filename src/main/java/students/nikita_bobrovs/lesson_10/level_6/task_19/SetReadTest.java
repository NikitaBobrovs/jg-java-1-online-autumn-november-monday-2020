package students.nikita_bobrovs.lesson_10.level_6.task_19;

import java.util.List;

class SetReadTest {
    public static void main(String[] args) {
        SetReadTest setReadTest = new SetReadTest();
        setReadTest.setReadTest1();
        setReadTest.setReadTest2();
        setReadTest.setReadTest3();
    }

    private String testResult(boolean tester) {
        return tester ? "OK" : "FAIL";
    }

    private final Book book0 = new Book("Jack R", "Leroy Jenkins");
    private final Book book1 = new Book("Magic Academy", "Stephane Mayer");

    private void setBookList(List<Book> bookList) {
        bookList.add(book0);
        bookList.add(book1);
    }

    void setReadTest1() {
        BookReaderImpl bookReader = new BookReaderImpl();
        setBookList(bookReader.getLibrary());

        bookReader.setRead("Jack R", "Leroy Jenkins");
        System.out.println("Is read book test (contains book) : " + testResult
                (bookReader.getLibrary().get(0).isRead()));
    }

    void setReadTest2() {
        BookReaderImpl bookReader = new BookReaderImpl();
        setBookList(bookReader.getLibrary());

        bookReader.setRead("Magic", "May");
        System.out.println("Is read book test (does not contain) : " + testResult
                (!bookReader.getLibrary().get(1).isRead()));
    }

    void setReadTest3() {
        BookReaderImpl bookReader = new BookReaderImpl();
        setBookList(bookReader.getLibrary());

        System.out.println("Is read book test(boolean true) : " + testResult
                (bookReader.setRead("Jack R", "Leroy Jenkins")));
        System.out.println("Is read book test(boolean false) : " + testResult
                (!bookReader.setRead("Potter", "Bruh")));
    }
}
