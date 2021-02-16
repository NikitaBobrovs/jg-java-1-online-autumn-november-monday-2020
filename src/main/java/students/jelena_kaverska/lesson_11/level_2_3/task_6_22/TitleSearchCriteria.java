package students.jelena_kaverska.lesson_11.level_2_3.task_6_22;

class TitleSearchCriteria implements SearchCriteria{
    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    @Override
    public boolean match(Book book) {
        return titleToSearch.equalsIgnoreCase(book.getTitle());
    }
}