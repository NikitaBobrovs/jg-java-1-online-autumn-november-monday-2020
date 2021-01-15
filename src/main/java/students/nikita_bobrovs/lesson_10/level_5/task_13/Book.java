package students.nikita_bobrovs.lesson_10.level_5.task_13;

class Book {
    private final String author;
    private final String title;

    Book(String title, String author) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + title + '\'' +
                '}';
    }
}

