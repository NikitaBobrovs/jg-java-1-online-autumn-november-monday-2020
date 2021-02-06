package students.viktors_cesnokovs.lesson_10.level_5.task_13;

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

    public String toString() {
        return "Book - " +
                "author : " + author + '\'' +
                " ; name : " + title + '\'';
    }
}
