package students.nikita_bobrovs.lesson_10.level_6.task_19;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {
    private final List<Book> library = new ArrayList<>();

    public List<Book> getLibrary() {
        return library;
    }

    private boolean containsTitleAuthor(Book book) {
        return book.getTitle() != null && book.getAuthor() != null;
    }

    private boolean isNewInLibrary(Book book, List<Book> library) {
        for (Book value : library) {
            if (value.getAuthor().equalsIgnoreCase(book.getAuthor()) &&
                    value.getTitle().equalsIgnoreCase(book.getTitle())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addBook(Book book) {
        if (containsTitleAuthor(book)) {
            if (isNewInLibrary(book, this.library)) {
                this.library.add(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeBook(Book book) {
        if (containsTitleAuthor(book)) {
            if (!isNewInLibrary(book, this.library)) {
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
    public List<Book> findByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book value : this.library) {
            if (value.getAuthor().startsWith(author)) {
                foundBooks.add(value);
            }
        }
        return foundBooks;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book value : this.library) {
            if (value.getTitle().startsWith(title)) {
                foundBooks.add(value);
            }
        }
        return foundBooks;
    }

    @Override
    public boolean setRead(String title, String author) {
        for (Book value : this.library) {
            if (value.getTitle().equalsIgnoreCase(title) && value.getAuthor().equalsIgnoreCase(author)) {
                value.setRead(true);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setNotRead(String title, String author) {
        for (Book value : this.library) {
            if (value.getTitle().equalsIgnoreCase(title) && value.getAuthor().equalsIgnoreCase(author)) {
                value.setNotRead(true);
                return true;
            }

        }
        return false;
    }

    @Override
    public List<Book> getReadBooks() {
        List<Book> foundBooks = new ArrayList<>();
        for (Book value : this.library) {
            if (value.isRead()) {
                foundBooks.add(value);
            }
        }
        return foundBooks;
    }

    @Override
    public List<Book> getNotReadBooks() {
        List<Book> foundBooks = new ArrayList<>();
        for (Book value : this.library) {
            if (value.isNotRead()) {
                foundBooks.add(value);
            }
        }
        return foundBooks;
    }
}
