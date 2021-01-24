package students.jana_sergejenko.lesson_10.level_5.task_13;

public class Book {
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
        return this.title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                "author='" + author + '\'' +
                '}';
    }
}