package students.nikita_bobrovs.lesson_11.book_database;

import java.util.*;

class BookDatabaseTests {
    public static void main(String[] args) {
        BookDatabaseTests databaseTests = new BookDatabaseTests();
        databaseTests.saveTest();
        databaseTests.deleteByIdTest1();
        databaseTests.deleteByIdTest2();
        databaseTests.deleteTest1();
        databaseTests.deleteTest2();
        databaseTests.findByIdTest1();
        databaseTests.findByIdTest2();
        databaseTests.findByAuthorTest1();
        databaseTests.findByTitleTest1();
        databaseTests.countAllBooksTest1();
        databaseTests.deleteByAuthorTest1();
        databaseTests.deleteByTitleTest1();
        databaseTests.findUniqueAuthorsTest1();
        databaseTests.findUniqueTitlesTest1();
        databaseTests.findUniqueBooksTest1();
        databaseTests.containsTest1();
        databaseTests.getAuthorToBooksMapTest1();
        databaseTests.getEachAuthorBookCountTest1();
    }

    private String result(boolean test) {
        return test ? "OK" : "FAIL";
    }

    Book book1 = new Book("Alpha", "ANN", "1900");
    Book book2 = new Book("Betta", "ANN", "1910");
    Book book3 = new Book("Gamma", "GAN", "1920");
    Book book4 = new Book("Betta", "DAN", "1930");
    Book book5 = new Book("Betta", "DAN", "1930");
    Book book6 = new Book("Delta", "RAN", "1900");


    void saveTest() {
        DatabaseImpl database = new DatabaseImpl();
        System.out.println("Save book test (id check) : " + result(
                database.save(book1) == 1 &&
                        database.save(book2) == 2 &&
                        database.save(book3) == 3 &&
                        database.save(book4) == 4 &&
                        database.save(book5) == 5 &&
                        database.save(book6) == 6));
    }

    void deleteByIdTest1() {
        DatabaseImpl database = new DatabaseImpl();
        database.save(book1);
        database.save(book2);
        database.save(book3);
        System.out.println("Delete by id test(true/false) : " + result(
                database.deleteById(1L) &&
                        !(database.deleteById(1L))

        ));
    }

    void deleteByIdTest2() {
        DatabaseImpl database = new DatabaseImpl();
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.deleteById(2L);
        System.out.println("Delete by id test(contains) : " + result(!(
                database.bookList.contains(book2))

        ));
    }

    void deleteTest1() {
        DatabaseImpl database = new DatabaseImpl();
        database.save(book1);
        database.save(book2);
        database.save(book3);
        System.out.println("Delete test(true/false) : " + result(
                database.delete(book2) &&
                        !(database.delete(book2))
        ));
    }

    void deleteTest2() {
        DatabaseImpl database = new DatabaseImpl();
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.delete(book3);
        System.out.println("Delete test(contains) : " + result(
                !(database.contains(book3))
        ));
    }

    void findByIdTest1() {
        DatabaseImpl database = new DatabaseImpl();
        System.out.println("Find by id test (empty) : " + result(
                database.findById(2L).isEmpty()
        ));
    }

    void findByIdTest2() {
        DatabaseImpl database = new DatabaseImpl();
        database.save(book1);
        database.save(book2);
        database.save(book3);
        System.out.println("Find by id test : " + result(
                database.findById(3L).get().getId() == 3
        ));
    }

    void findByAuthorTest1() {
        DatabaseImpl database = new DatabaseImpl();
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        List<Book> expected = new ArrayList<>();
        expected.add(book2);
        expected.add(book4);
        System.out.println("Find by author test : " + result(
                expected.equals(database.findByAuthor("Betta"))
        ));
    }

    void findByTitleTest1() {
        DatabaseImpl database = new DatabaseImpl();
        database.save(book1);
        database.save(book2);
        database.save(book3);
        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book2);
        System.out.println("Find by title test : " + result(
                expected.equals(database.findByTitle("ANN"))
        ));
    }

    void countAllBooksTest1() {
        DatabaseImpl database = new DatabaseImpl();
        database.save(book1);
        database.save(book2);
        database.save(book3);
        System.out.println("Count all books test : " + result(
                database.countAllBooks() == 3
        ));
    }

    void deleteByAuthorTest1() {
        DatabaseImpl database = new DatabaseImpl();
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.deleteByAuthor("Alpha");
        List<Book> expected = new ArrayList<>();
        expected.add(book2);
        expected.add(book3);
        System.out.println("Delete by author test : " + result(
                expected.equals(database.bookList)
        ));
    }

    void deleteByTitleTest1() {
        DatabaseImpl database = new DatabaseImpl();
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.deleteByTitle("ANN");
        List<Book> expected = new ArrayList<>();
        expected.add(book3);
        System.out.println("Delete by title test : " + result(
                expected.equals(database.bookList)
        ));
    }

    void findUniqueAuthorsTest1() {
        DatabaseImpl database = new DatabaseImpl();
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        database.save(book5);
        Set<String> expected = new HashSet<>();
        expected.add("Alpha");
        expected.add("Betta");
        expected.add("Gamma");
        System.out.println("Find unique authors test : " + result(
                expected.equals(database.findUniqueAuthors())
        ));
    }

    void findUniqueTitlesTest1() {
        DatabaseImpl database = new DatabaseImpl();
        database.save(book1);
        database.save(book2);
        database.save(book3);
        Set<String> expected = new HashSet<>();
        expected.add("ANN");
        expected.add("GAN");
        System.out.println("Find unique authors test : " + result(
                expected.equals(database.findUniqueTitles())
        ));
    }

    void findUniqueBooksTest1() {
        DatabaseImpl database = new DatabaseImpl();
        database.save(book2);
        database.save(book3);
        database.save(book4);
        database.save(book5);
        Set<Book> expected = new HashSet<>();
        expected.add(book2);
        expected.add(book3);
        expected.add(book4);
        System.out.println("Find unique books test : " + result(
                expected.equals(database.findUniqueBooks())
        ));
    }

    void containsTest1() {
        DatabaseImpl database = new DatabaseImpl();
        database.save(book2);
        database.save(book3);
        System.out.println("Contains test(true/false) : " + result(
                (database.contains(book2) &&
                        !(database.contains(book5)))
        ));
    }

    void getAuthorToBooksMapTest1() {
        Map<String, List<Book>> expected = new HashMap<>();
        DatabaseImpl database = new DatabaseImpl();
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        database.save(book5);
        expected.put("Alpha", database.findByAuthor("Alpha"));
        expected.put("Betta", database.findByAuthor("Betta"));
        expected.put("Gamma", database.findByAuthor("Gamma"));

        Map<String, List<Book>> authorToBookMap = database.getAuthorToBooksMap();
        System.out.println("Get author to book map test (keys) : " + result(
                expected.keySet().equals(authorToBookMap.keySet())
        ));
        System.out.println("Get author to book map test (values) : " + result(
                expected.values().containsAll(authorToBookMap.values()))
        );
    }

    void getEachAuthorBookCountTest1() {
        Map<String, Integer> expected = new HashMap<>();
        DatabaseImpl database = new DatabaseImpl();
        database.save(book1);
        database.save(book2);
        database.save(book3);
        database.save(book4);
        database.save(book5);
        expected.put("Alpha", database.findByAuthor("Alpha").size());
        expected.put("Betta", database.findByAuthor("Betta").size());
        expected.put("Gamma", database.findByAuthor("Gamma").size());

        Map<String, Integer> eachAuthorBookCount = database.getEachAuthorBookCount();
        System.out.println("Get each author book count map test (keys) : " + result(
                expected.keySet().equals(eachAuthorBookCount.keySet())
        ));
        System.out.println("Get each author book count map test (values) : " + result(
                (new ArrayList<>(expected.values()).equals(new ArrayList<>(eachAuthorBookCount.values())))
        ));
    }
}
