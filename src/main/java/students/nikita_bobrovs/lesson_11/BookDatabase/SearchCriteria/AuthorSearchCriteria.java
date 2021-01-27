package students.nikita_bobrovs.lesson_11.BookDatabase.SearchCriteria;

import students.nikita_bobrovs.lesson_11.BookDatabase.Book;

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
