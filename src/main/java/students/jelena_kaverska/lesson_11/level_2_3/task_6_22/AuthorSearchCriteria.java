package students.jelena_kaverska.lesson_11.level_2_3.task_6_22;

class AuthorSearchCriteria implements SearchCriteria{
    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getAuthor().equalsIgnoreCase(this.authorToSearch);
    }
}