package students.jana_sergejenko.lesson_11.level_2_level_3_all;

class TitleSearchCriteria implements SearchCriteria {

    private String titleToSearch;

    public TitleSearchCriteria(String titleToSearch) {
        this.titleToSearch = titleToSearch;
    }

    public boolean match(Book book) {
            if (book.getTitle().equals(this.titleToSearch)) {
                return true;
            }
        return false;
    }


}