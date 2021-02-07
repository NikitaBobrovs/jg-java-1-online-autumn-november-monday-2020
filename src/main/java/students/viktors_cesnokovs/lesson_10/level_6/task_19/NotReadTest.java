package students.viktors_cesnokovs.lesson_10.level_6.task_19;

import java.util.List;

class NotReadTest {
    public static void main(String[] args) {
        NotReadTest notReadTest = new NotReadTest();
        notReadTest.test1();
        notReadTest.test2();
        notReadTest.test3();
    }

    private String result(boolean test) {
        if (test) {
            return "PASSED";
        } else
            return "FAILED";
    }

    private final Book book0 = new Book("Metro 2033", "Dmitrij Gluhovskij");
    private final Book book1 = new Book("Florentijka", "Djuljeta Benconi");

    private void bookList(List<Book> bookList) {
        bookList.add(book0);
        bookList.add(book1);
    }

    void test1() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookList(bookReader.getLibrary());

        bookReader.setNotRead("Metro 2033", "Dmitrij Gluhovskij");
        System.out.println("Not read book test (YES) : " + result
                (bookReader.getLibrary().get(0).isNotRead()));
    }

    void test2() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookList(bookReader.getLibrary());

        bookReader.setNotRead("Flor", "Djul");
        System.out.println("Not read book test (NO) : " + result
                (!bookReader.getLibrary().get(1).isNotRead()));
    }

    void test3() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookList(bookReader.getLibrary());
        System.out.println("Not read book test (TRUE) : " + result
                (bookReader.setNotRead("Metro 2033", "Dmitrij Gluhovskij")));
        System.out.println("Not read book test (FALSE) : " + result
                (!bookReader.setNotRead("Jack and Joe", "Joker")));
    }
}
