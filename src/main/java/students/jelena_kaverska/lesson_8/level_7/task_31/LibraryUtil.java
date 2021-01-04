package students.jelena_kaverska.lesson_8.level_7.task_31;

import java.util.Arrays;

class LibraryUtil {
    private Library library = new Library();

    //взять книгу из библиотеки
    public boolean takeBook(Book book) {
        for (int i = 0; i < library.getBooks().length; i++) {
            if (library.getBooks()[i] == null) {
                continue;
            }
            if (library.getBooks()[i].getTitle().equalsIgnoreCase(book.getTitle()) &&
                    library.getBooks()[i].getAuthor().equalsIgnoreCase(book.getAuthor()) &&
                    !library.getBooks()[i].isReserved()) {
                library.getBooks()[i] = null;
                return true;
            }
        }
        return false;
    }

    //вернуть книгу в библиотеку TBD

    //поиск нужной книги
    public Book searchBookFromLibrary(Book book) {
        for (int i = 0; i < library.getBooks().length; i++) {
            if (library.getBooks()[i] == null) {
                continue;
            }
            if (library.getBooks()[i].getTitle().equalsIgnoreCase(book.getTitle())
                    && library.getBooks()[i].getAuthor().equalsIgnoreCase(book.getAuthor())) {
                return library.getBooks()[i];
            }
        }
        return null;
    }

    //добавление новой книги в библиотеку
    public boolean addNewBook(Book book) {
        library.getBooks()[library.getPosition()] = book;
        library.setPosition(library.getPosition() + 1);
        return true;
    }

    //резервация книги
    public boolean reserveBook(Book book) {
        for (int i = 0; i < library.getBooks().length; i++) {
            if (library.getBooks()[i] == null) {
                continue;
            }
            if (library.getBooks()[i].getId().equalsIgnoreCase(book.getId()) &&
                    library.getBooks()[i].getTitle().equalsIgnoreCase(book.getTitle()) &&
                    library.getBooks()[i].getAuthor().equalsIgnoreCase(book.getAuthor()) &&
                    (!library.getBooks()[i].isReserved())) {
                library.getBooks()[i].setReserved(true);
                return true;
            }
        }
        return false;
    }

    // рассылка оповещений читателям о сроке сдачи книги в библиотеку TBD
    // выписывание штрафов за вовремя не сданные книги TBD

    public void printAllBooks() {
        System.out.println(Arrays.toString(library.getBooks()));
    }

    public static void main(String[] args) {
        LibraryUtil libraryUtil = new LibraryUtil();
        libraryUtil.printAllBooks();
        libraryUtil.addNewBook(new Book("555", "AAA", "CCC"));
        libraryUtil.printAllBooks();
        libraryUtil.addNewBook(new Book("888", "SSS", "OOO"));
        libraryUtil.printAllBooks();
        System.out.println("reserve: " + libraryUtil.reserveBook(new Book("555", "AAA", "CCC")));
        libraryUtil.printAllBooks();
        System.out.println("reserve 2: " + libraryUtil.reserveBook(new Book("888", "SSS", "OOO")));
        libraryUtil.printAllBooks();
        System.out.println(libraryUtil.reserveBook(new Book("888", "SSS", "OOO")));
        System.out.println(libraryUtil.takeBook(new Book("888", "SSS", "OOO")));
    }
}