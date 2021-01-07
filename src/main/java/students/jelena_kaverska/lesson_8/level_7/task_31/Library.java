package students.jelena_kaverska.lesson_8.level_7.task_31;

import java.util.Arrays;

class Library {
    private Book[] books = new Book[100];
    private int position = 0;

    public boolean take(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                continue;
            }
            if (books[i].equals(book) && !books[i].isReserved()) {
                books[i] = null;
                return true;
            }
        }
        return false;
    }

    //добавление новой книги в библиотеку
    public boolean add(Book book) {
        books[position] = book;
        position++;
        return true;
    }

    //резервация книги
    public boolean reserve(Book book) {
        for (Book b : books) {
            if (b == null) {
                continue;
            }
            if (b.getId().equals(book.getId()) &&
                    b.equals(book) &&
                    (!b.isReserved())) {
                b.setReserved(true);
                return true;
            }
        }
        return false;
    }

    //поиск нужной книги by author
    public Book searchByAuthor(String author) {
        for (Book book : books) {
            if (book == null) {
                continue;
            }
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }

    //поиск нужной книги by title
    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book == null) {
                continue;
            }
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void printAllBooks() {
        System.out.println(Arrays.toString(books));
    }

    // вернуть книгу в библиотеку TBD
    // рассылка оповещений читателям о сроке сдачи книги в библиотеку TBD
    // выписывание штрафов за вовремя не сданные книги TBD
}

class MyDemo {
    public static void main(String[] args) {
        Library l = new Library();
        System.out.println("Add book 1: " + l.add(new Book("777", "AAA", "DDD")));
        System.out.println("Add book 2: " + l.add(new Book("888", "BBB", "CCC")));
        l.printAllBooks();
        System.out.println("Reserve book 1: " + l.reserve(new Book("777", "AAA", "DDD")));
        l.printAllBooks();
        System.out.println("Take reserved book 1: " + l.take(new Book("777", "AAA", "DDD")));
        l.printAllBooks();
        System.out.println("search 1: " + l.searchByTitle("BBB"));
        System.out.println("search 2: " + l.searchByAuthor("ccc"));
        System.out.println("Take book 2: " + l.take(new Book("888", "BBB", "CCC")));
        l.printAllBooks();
        System.out.println("Reserve reserved book 1: " + l.reserve(new Book("777", "AAA", "DDD")));
        l.printAllBooks();
    }
}