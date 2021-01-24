package students.nikita_bobrovs.lesson_11.BookDatabase;

class TitleSearchCriteria implements SearchCriteria {
    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }
    @Override
    public boolean match(Book book) {
        return book.getTitle().equals(this.titleToSearch);
    }
}
