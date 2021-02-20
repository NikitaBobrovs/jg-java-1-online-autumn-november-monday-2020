package students.jana_sergejenko.lesson_11.level_2_level_3_all;

public class SearchCriteriaDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Kuper", "Zveroboi");
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria, titleSearchCriteria);
        System.out.println(searchCriteria.match(book1));

    }
}
