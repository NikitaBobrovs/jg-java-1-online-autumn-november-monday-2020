package students.eugene_trambovich.lesson_11.level_1.task_5;

import java.util.Objects;

class Book {
    private String title;
    private String author;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book))
            return false;
       Book book = (Book) o;
      return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }
}
