package students.polina_ivashkevich.lesson_11.level_1.task_5;

import java.util.Objects;

public class Book {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    @Override
    public boolean equals(Object object1) {
        if (this == object1)
            return true;
        if (object1 == null || getClass() != object1.getClass());
        Book book = (Book) object1;
        return Objects.equals(title, book.title) && Objects.equals(author,book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

}
