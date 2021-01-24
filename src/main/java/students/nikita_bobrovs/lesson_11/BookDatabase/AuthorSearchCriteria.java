package students.nikita_bobrovs.lesson_11.BookDatabase;

class AuthorSearchCriteria implements SearchCriteria{
    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }
    @Override
    public boolean match(Book book) {
        return book.getAuthor().equals(this.authorToSearch);
    }
}
