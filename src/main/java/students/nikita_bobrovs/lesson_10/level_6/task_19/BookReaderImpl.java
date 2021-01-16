package students.nikita_bobrovs.lesson_10.level_6.task_19;

import java.util.ArrayList;
import java.util.List;

class BookReaderImpl implements BookReader {

    private boolean containsTitleAuthor(Book book) {
        return book.getTitle() != null && book.getAuthor() != null;
    }

    private void print(Book value) {
        System.out.println(value.getTitle() + " [ " + value.getAuthor() + " ].");
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
            print(value);
        }
    }

    @Override
    public List<Book> findByAuthor(String author, List<Book> library) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book value : library) {
            if (value.getAuthor().startsWith(author)) {
                foundBooks.add(value);
            }
        }
        return foundBooks;
    }

    @Override
    public List<Book> findByTitle(String title, List<Book> library) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book value : library) {
            if (value.getTitle().startsWith(title)) {
                foundBooks.add(value);
            }
        }
        return foundBooks;
    }

    @Override
    public boolean isRead(String title, String author, List<Book> library) {
        for (Book value : library) {
            if (value.getTitle().equalsIgnoreCase(title) && value.getAuthor().equalsIgnoreCase(author)) {
                value.setRead(true);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isNotRead(String title, String author, List<Book> library) {
        for (Book value : library) {
            if (value.getTitle().equalsIgnoreCase(title) && value.getAuthor().equalsIgnoreCase(author)) {
                value.setNotRead(true);
                return true;
            }

        }
        return false;
    }

    @Override
    public void printReadBooks(List<Book> library) {
        for (Book value : library) {
            if (value.isRead()) {
                print(value);
            }
        }
    }

    @Override
    public void printNotReadBooks(List<Book> library) {
        for (Book value : library) {
            if (value.isNotRead()) {
                print(value);
            }
        }
    }
}
