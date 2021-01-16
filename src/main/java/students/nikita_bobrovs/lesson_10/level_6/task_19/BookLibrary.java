package students.nikita_bobrovs.lesson_10.level_6.task_19;

import java.util.ArrayList;
import java.util.List;

class BookLibrary {

    private final List<Book> library;

    BookLibrary() {
        this.library = new ArrayList<>();
    }

    public List<Book> getLibrary() {
        return library;
    }
}
