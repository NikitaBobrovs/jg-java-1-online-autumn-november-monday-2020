package students.viktors_cesnokovs.lesson_10.level_5.task_13;

import students.jana_sergejenko.lesson_9.level_2.task_12.B;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

    private final List<Book> library = new ArrayList<>();

    public List<Book> getLibrary() {
        return library;
    }

    private boolean containsTitleAndAuthor(Book book) {
        return book.getTitle() != null && book.getAuthor() != null;
    }

    private boolean newInLibrary(Book book, List<Book> Library) {
        for (Book value : Library) {
            if (value.getAuthor().equalsIgnoreCase(book.getAuthor()) &&
                    value.getTitle().equalsIgnoreCase(book.getTitle())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addBook(Book book) {
        if (containsTitleAndAuthor(book)) {
            if (newInLibrary(book, this.library)) {
                this.library.add(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeBook(Book book) {
        if (containsTitleAndAuthor(book)) {
            if (!newInLibrary(book, this.library)) {
                this.library.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Book> getAllBooks() {
        return getLibrary();
    }

    @Override
    public List<Book> findByAuthorFullName(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book value : this.library) {
            if (author.equals(value.getAuthor())) {
                foundBooks.add(value);
            }
        }
        return foundBooks;
    }

    @Override
    public List<Book> findByAuthorPartName(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book value : this.library) {
            if (value.getAuthor().startsWith(author)) {
                foundBooks.add(value);
            }
        }
        return foundBooks;
    }
}
