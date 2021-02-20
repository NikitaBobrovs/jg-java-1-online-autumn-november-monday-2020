package students.jana_sergejenko.lesson_11.level_2_level_3_all;

public class SearchCriteriaTests {

    public static void main(String[] args) {
        SearchCriteriaTests test = new SearchCriteriaTests();
        test.scenario1();
        test.scenario2();
        test.scenario3();
        test.scenario4();
        test.scenario5();
    }

    public String checkResult(boolean result, boolean expected) {
        if (result == expected) {
            return "Test = OK";
        } else {
            return "Test = FAIL";
        }
    }

    void scenario1() {

        Book book1 = new Book("Kuper", "Zveroboi");
        Book book2 = new Book("Kuper", "Zveroboi", "1980");
        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Kuper");
        boolean expected = true;
        boolean result = authorSearchCriteria.match(book2);
        System.out.println("AuthorSearchCriteria" + checkResult(expected, result));

    }

    void scenario2() {

        Book book2 = new Book("Kuper", "Zveroboi", "1980");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Zveroboi");
        boolean expected = true;
        boolean result = titleSearchCriteria.match(book2);
        System.out.println("titleSearchCriteria" + checkResult(expected, result));

    }

    void scenario3() {

        Book book2 = new Book("Kuper", "Zveroboi", "1980");
        SearchCriteria yearSearchCriteria = new YearOfIssueSearchCriteria("1980");
        boolean expected = true;
        boolean result = yearSearchCriteria.match(book2);
        System.out.println("yearSearchCriteria" + checkResult(expected, result));

    }

    void scenario4() {

        Book book2 = new Book("Kuper", "Zveroboi", "1980");
        SearchCriteria andSearchCriteria = new AndSearchCriteria(new TitleSearchCriteria("Zveroboi"), new YearOfIssueSearchCriteria("1980"));
        boolean expected = true;
        boolean result = andSearchCriteria.match(book2);
        System.out.println("andSearchCriteria" + checkResult(expected, result));

    }

    void scenario5() {

        Book book2 = new Book("Kuper", "Zveroboi", "1980");
        SearchCriteria oRSearchCriteria = new OrSearchCriteria(new TitleSearchCriteria("SSSSSSS"), new YearOfIssueSearchCriteria("1980"));
        boolean expected = true;
        boolean result = oRSearchCriteria.match(book2);
        System.out.println("oRSearchCriteria" + checkResult(expected, result));
    }
}
