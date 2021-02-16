package students.jekaterina_aleksejeva.lesson_11.level_4.task_23;

import java.util.*;
import java.util.stream.Collectors;

class BookDatabaseImpl implements BookDatabase {
    List<Book> bookList = new ArrayList<>();
    Long bookId = 0L;

    @Override
    public Long save(Book book) {
        bookList.add(book);
        bookId++;
        book.setId(bookId);
        return bookId;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public Long getBookId() {
        return bookId;
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        return bookList.removeIf(book1 -> book1.equals(book));
    }


    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }

        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return bookList.stream().filter(book -> book.getAuthor().equals(author)).collect(Collectors.toList());

    }

    @Override
    public List<Book> findByTitle(String title) {
        return bookList.stream().filter(book -> book.getTitle().equals(title)).collect(Collectors.toList());
    }

    @Override
    public int countAllBooks() {
        return bookList.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        bookList.removeIf(book1 -> book1.getAuthor().equals(author));
    }

    @Override
    public void deleteByTitle(String title) {
        bookList.removeIf(book1 -> book1.getTitle().equals(title));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        return bookList.stream().filter(searchCriteria::match).collect(Collectors.toList());
    }

    @Override
    public Set<String> findUniqueAuthors() {
        return bookList.stream().map(Book::getAuthor).collect(Collectors.toSet());
    }

    public Set<String> findUniqueTitles() {
        return bookList.stream().map(Book::getTitle).collect(Collectors.toSet());
    }

    public Set<Book> findUniqueBooks() {
        return new HashSet<>(bookList);
    }

    public boolean contains(Book book) {
        return bookList.contains(book);
    }
}


class DemoNew {

    public static void main(String[] args) {
        BookDatabaseImpl demo = new BookDatabaseImpl();
        demo.save(new Book("aa", "bb", "11"));
        demo.save(new Book("cc", "dd", "22"));
        demo.save(new Book("aa", "ff", "55"));
        demo.save(new Book("gg", "ff", "11"));
        demo.save(new Book("gg", "ff", "11"));
        System.out.println("Book list print out: ");
        System.out.println(demo.getBookList());
        System.out.println("Unique authors found: " + demo.findUniqueAuthors());
        System.out.println("Unique titles found: " + demo.findUniqueTitles());
        System.out.println("Unique books: ");
        System.out.println(demo.findUniqueBooks());
        System.out.println("Book list contains book authored by a, titled as ff, issued in 55 = " + demo.contains(new Book("aa", "ff", "55")));


    }

}
