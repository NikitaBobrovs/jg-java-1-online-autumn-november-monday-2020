package students.jana_sergejenko.lesson_11.level_2_level_3_all;


class AuthorSearchCriteria implements SearchCriteria {

    private String authorToSearch;

    public AuthorSearchCriteria(String authorToSearch) {
        this.authorToSearch = authorToSearch;
    }

    @Override
    public boolean match(Book book) {
            if (book.getAuthor().equals(this.authorToSearch)) {
                return true;
            }
        return false;
    }

}
