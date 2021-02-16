package students.nikita_bobrovs.lesson_11.book_database.search_criterias;

import students.nikita_bobrovs.lesson_11.book_database.Book;
import students.nikita_bobrovs.lesson_11.book_database.SearchCriteria;

class AuthorSearchCriteria implements SearchCriteria {
    private final String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(this.authorToSearch);
    }
}
