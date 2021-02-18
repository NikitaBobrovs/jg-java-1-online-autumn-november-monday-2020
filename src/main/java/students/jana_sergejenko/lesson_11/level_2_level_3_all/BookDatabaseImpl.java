package students.jana_sergejenko.lesson_11.level_2_level_3_all;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImpl implements BookDatabase {
    ArrayList<Book> booklist = new ArrayList<>();
    private long id = 0;

    @Override
    public Long save(Book book) {
        booklist.add(book);
        id++;
        book.setId(id);
        return book.getId();
    }

    @Override
    public boolean delete(Long id) {
        for (Book book : booklist) {
            if (book.getId().equals(id)) {
                booklist.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (Book book1 : booklist) {
            if (book1.equals(book)) {
                booklist.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : booklist) {
            if (book.getId().equals(id)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> findByAuthor = new ArrayList<>();
        for (Book book : booklist) {
            if (book.getAuthor().equals(author)) {
                findByAuthor.add(book);
            }
        }
        return findByAuthor;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> findByTitle = new ArrayList<>();
        for (Book book : booklist) {
            if (book.getTitle().equals(title)) {
                findByTitle.add(book);
            }
        }
        return findByTitle;
    }

    @Override
    public int countAllBooks() {
        int count = 0;
        for (Book book : booklist) {
            count++;
        }
        return count;
    }

    @Override
    public void deleteByAuthor(String author) {
        for (Book book : booklist) {
            if (book.getAuthor().equals(author)) {
                booklist.remove(book);
                break;
            }
        }
    }

    public void deleteByTitle(String title) {
        for (Book book : booklist) {
            if (book.getTitle().equals(title)) {
                booklist.remove(book);
                break;
            }
        }
    }

    public List<Book> printAll() {
        return booklist;
    }

}