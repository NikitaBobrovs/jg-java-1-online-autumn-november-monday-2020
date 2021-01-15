package students.nikita_bobrovs.lesson_10.level_5.task_13;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

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
    public boolean addBook(Book book, List<Book> library) {
        if (containsTitleAuthor(book)) {
            if (isNewInLibrary(book, library)) {
                library.add(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeBook(Book book, List<Book> library) {
        if (containsTitleAuthor(book)) {
            if (!isNewInLibrary(book, library)) {
                library.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public void printAllBooks(List<Book> library) {
        for (Book value : library) {
            System.out.println(value.getTitle() + " [ " + value.getAuthor() + " ].");
        }
    }

    @Override
    public List<Book> findByAuthorFullName(String author, List<Book> library) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book value : library) {
            if (author.equals(value.getAuthor())) {
                foundBooks.add(value);
            }
        }
        return foundBooks;
    }

    @Override
    public List<Book> findByAuthorPartName(String author, List<Book> library) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book value : library) {
            if (value.getAuthor().startsWith(author)) {
                foundBooks.add(value);
            }
        }
        return foundBooks;
    }
}

