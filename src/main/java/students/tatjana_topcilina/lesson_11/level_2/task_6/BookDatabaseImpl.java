package students.tatjana_topcilina.lesson_11.level_2.task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImpl  implements BookDatabase {
    private List<Book> books = new ArrayList<>();
    private Long bookId = 0L;

    @Override
    public Long save(Book book) {
        bookId++;
        Book newBook = new Book(bookId,book.getTitle(), book.getAuthor());
        books.add(newBook);
        return bookId;
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (Book book1 : books) {
            if (book1.equals(book)) {
                books.remove(book1);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> resultByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                resultByAuthor.add(book);
            }
        }
        return resultByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> resultByTitle = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                resultByTitle.add(book);
            }
        }
        return resultByTitle;
    }

    @Override
    public int countAllBooks() {
        List<Book> bookList = new ArrayList<>(books);
        return bookList.size();
    }

    @Override
    public boolean deleteByAuthor(String author) {
        books.removeIf(allBooks -> allBooks.getAuthor().equals(author));
        System.out.println("All books by "+author+" were successfully deleted");
        return true;
    }

    @Override
    public void deleteByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                System.out.println("All books with title: "+"\""+title+"\""+" were deleted");
                break;
            }
        }
    }

    void printBooksList(){
        System.out.println(books);
    }

    public List<Book> getBooks (){
        return books;
    }


}
