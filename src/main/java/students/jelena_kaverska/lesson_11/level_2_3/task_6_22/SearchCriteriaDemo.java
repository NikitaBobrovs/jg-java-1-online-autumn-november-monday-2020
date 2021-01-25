package students.jelena_kaverska.lesson_11.level_2_3.task_6_22;

class SearchCriteriaDemo {
    public static void main(String[] args) {
        //- автор книги "Kuper" и год выпуска 1890
        SearchCriteria and = new AndSearchCriteria(new AuthorSearchCriteria("Kuper"),
                new YearOfIssueSearchCriteria("1890"));
        System.out.println(and.match(new Book("Zveroboi", "Kuper", "1890")));

        //- автор книги "Kuper" или год выпуска 1890 или название "Zveroboi"
        SearchCriteria or = new OrSearchCriteria(new OrSearchCriteria(new AuthorSearchCriteria("Kuper"),
                new YearOfIssueSearchCriteria("1890")), new TitleSearchCriteria("Zveroboi"));
        System.out.println(or.match(new Book("Zveroboi", "Kuper", "1890")));
    }
}