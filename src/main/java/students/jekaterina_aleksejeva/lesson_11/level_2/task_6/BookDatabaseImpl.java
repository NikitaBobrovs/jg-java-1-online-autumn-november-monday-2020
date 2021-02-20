package students.jekaterina_aleksejeva.lesson_11.level_2.task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

}


class Demo {

    public static void main(String[] args) {
        BookDatabaseImpl demo = new BookDatabaseImpl();

        System.out.println(demo.save(new Book("c", "d")));
        System.out.println(demo.save(new Book("c", "t")));
        System.out.println(demo.save(new Book("e", "f")));
        System.out.println(demo.save(new Book("g", "h")));
        System.out.println(demo.save(new Book("a", "f")));

        System.out.println(demo.getBookList());
        System.out.println("Total number of books in the database = " + demo.bookList.size());
        System.out.println("Find book No 3 and delete it from the database = " + demo.delete(Long.valueOf(3)));
        System.out.println("Find book No 8 and delete it from the database = " + demo.delete(Long.valueOf(8)));
        System.out.println("Find by Id book No 1 = " + demo.findById(Long.valueOf(1)));
        System.out.println("Find by Id book No 7 = " + demo.findById(Long.valueOf(7)));
        System.out.println("Find all by author named c = " + demo.findByAuthor("c"));
        System.out.println("Find all by author named x = " + demo.findByAuthor("x"));
        System.out.println("Find all by title named f = " + demo.findByTitle("f"));
        System.out.println("Find all by title named y = " + demo.findByTitle("y"));
        System.out.println("Count all books in the database = " + demo.countAllBooks());

        demo.deleteByAuthor("c");
        System.out.println("Find by author c, delete all books of c, print out new book list: ");
        System.out.println(demo.getBookList());
        demo.deleteByTitle("f");
        System.out.println("Find by name f, delete all books named f, print out new book list: ");
        System.out.println(demo.getBookList());

    }

}
