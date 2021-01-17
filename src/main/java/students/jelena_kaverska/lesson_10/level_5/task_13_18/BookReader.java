package students.jelena_kaverska.lesson_10.level_5.task_13_18;

import java.util.List;

interface BookReader {
    //добавление книг в электронную библиотеку для дальнейшего чтения
    boolean add(Book book);

    //удаление книги из электронной библиотеки
    boolean delete(Book book);

    List<Book> getAllBooks();

    List<Book> findByAuthor(String author);

}