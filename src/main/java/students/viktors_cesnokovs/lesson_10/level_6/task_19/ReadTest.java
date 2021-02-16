package students.viktors_cesnokovs.lesson_10.level_6.task_19;


import java.util.List;

class ReadTest {
    public static void main(String[] args) {
        ReadTest readTest = new ReadTest();
        readTest.test1();
        readTest.test2();
        readTest.test3();
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

        bookReader.setRead("Metro 2033", "Dmitrij Gluhovskij");
        System.out.println("Read book test (YES) : " + result
                (bookReader.getLibrary().get(0).isRead()));
    }

    void test2() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookList(bookReader.getLibrary());

        bookReader.setRead("Flor", "Igor");
        System.out.println("Read book test (NO) : " + result
                (!bookReader.getLibrary().get(1).isRead()));
    }

    void test3() {
        BookReaderImpl bookReader = new BookReaderImpl();
        bookList(bookReader.getLibrary());

        System.out.println("Read book test (TRUE) : " + result
                (bookReader.setRead("Metro 2033", "Dmitrij Gluhovskij")));
        System.out.println("Read book test (FALSE) : " + result
                (!bookReader.setRead("Jack and Jae", "Joker")));
    }
}
