package students.jelena_kaverska.lesson_10.level_6.tasks_19_24;

import java.util.List;

interface BookReader {
    //добавление книг в электронную библиотеку для дальнейшего чтения
    boolean add(Book book);

    //удаление книги из электронной библиотеки
    boolean delete(Book book);

    List<Book> getAllBooks();

    List<Book> findByAuthor(String author);

    List<Book> findByTitle(String title);

    boolean markAsRead(Book book);

    boolean markAsUnRead(Book book);

    List<Book> getAllReadBooks();

    List<Book> getAllUnReadBooks();

}