package students.nikita_bobrovs.lesson_10.level_6.task_19;

import java.util.List;

class SetNotReadTest {
    public static void main(String[] args) {
        SetNotReadTest setNotReadTest = new SetNotReadTest();
        setNotReadTest.setNotReadTest1();
        setNotReadTest.setNotReadTest2();
        setNotReadTest.setNotReadTest3();
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

    void setNotReadTest1() {
        BookReaderImpl bookReader = new BookReaderImpl();
        setBookList(bookReader.getLibrary());

        bookReader.setNotRead("Jack R", "Leroy Jenkins");
        System.out.println("Is not read book test (true) : " + testResult
                (bookReader.getLibrary().get(0).isNotRead()));
    }

    void setNotReadTest2() {
        BookReaderImpl bookReader = new BookReaderImpl();
        setBookList(bookReader.getLibrary());

        bookReader.setNotRead("Magic", "May");
        System.out.println("Is not read book test (false) : " + testResult
                (!bookReader.getLibrary().get(1).isNotRead()));
    }

    void setNotReadTest3() {
        BookReaderImpl bookReader = new BookReaderImpl();
        setBookList(bookReader.getLibrary());
        System.out.println("Is not read book test(boolean true) : " + testResult
                (bookReader.setNotRead("Jack R", "Leroy Jenkins")));
        System.out.println("Is not read book test(boolean false) : " + testResult
                (!bookReader.setNotRead("Potter", "Bruh")));
    }
}
