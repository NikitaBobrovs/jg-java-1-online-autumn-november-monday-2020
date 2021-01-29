package students.jekaterina_aleksejeva.lesson_11.level_3.task_15;

import java.util.Objects;

class SearchCriteriaTest {
    public static void main(String[] args) {
        SearchCriteriaTest test = new SearchCriteriaTest();
        test.bookMatchByAuthor();
        test.noBookMatchByAuthor();
        test.bookMatchByTitle();
        test.noBookMatchByTitle();
        test.bookMatchByYearOfIssue();
        test.noBookMatchByYearOfIssue();
        test.leftAndRightConditionsMet();
        test.leftAndRightConditionsNotMet();
        test.leftOrRightConditionsMet();
        test.leftOrRightConditionsNotMet();
    }

    boolean checkBooleanTest(boolean expectedResult, boolean actualResult) {
        return Objects.equals(expectedResult, actualResult);
    }

    BookDatabaseImpl database = new BookDatabaseImpl();

    Book book1 = new Book ("111", "1001");
    Book book2 = new Book ("222", "2002");
    Book book3 = new Book ("333", "3003");
    Book book4 = new Book("444", "4004");
    Book book5 = new Book("555", "1001", "2012");
    Book book6 = new Book("111", "5005", "2000");
    Book book7 = new Book("777", "8888", "2020");
    Book book8 = new Book("999", "5005", "2017");



    void bookMatchByAuthor(){
        String scenario = "Book match by Author found = ";
        SearchCriteria sc = new AuthorSearchCriteria("111");
        if (checkBooleanTest(true, sc.match(book1))){
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void noBookMatchByAuthor(){
        String scenario = "No book match by Author found = ";
        SearchCriteria sc = new AuthorSearchCriteria("999");
        if (checkBooleanTest(false, sc.match(book2))){
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void bookMatchByTitle(){
        String scenario = "Book match by Title found = ";
        SearchCriteria sc = new TitleSearchCriteria("3003");
        if (checkBooleanTest(true, sc.match(book3))){
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void noBookMatchByTitle(){
        String scenario = "No book match by Title found = ";
        SearchCriteria sc = new TitleSearchCriteria("400");
        if (checkBooleanTest(false, sc.match(book4))){
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }
    }

    void bookMatchByYearOfIssue(){
        String scenario = "Book match by year of issue found = ";
        SearchCriteria sc = new YearOfIssueSearchCriteria("2012");
        if (checkBooleanTest(true, sc.match(book5))){
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void noBookMatchByYearOfIssue(){
        String scenario = "No book match by year of issue found = ";
        SearchCriteria sc = new YearOfIssueSearchCriteria("2013");
        if (checkBooleanTest(false, sc.match(book6))){
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void leftAndRightConditionsMet() {
        String scenario = "Book match when both left and right conditions are met = ";
        SearchCriteria left  = new AuthorSearchCriteria("111");
        SearchCriteria right = new TitleSearchCriteria("5005");
        SearchCriteria sc = new AndSearchCriteria(left, right);
        if (checkBooleanTest(true, sc.match(book6))){
         System.out.println(scenario + "PASS");
        } else {
        System.out.println(scenario + "FAILED");
        }

    }

    void leftAndRightConditionsNotMet() {
        String scenario = "No book match when both left and right conditions are not met = ";
        SearchCriteria left  = new AuthorSearchCriteria("000");
        SearchCriteria right = new YearOfIssueSearchCriteria("1010");
        SearchCriteria sc = new AndSearchCriteria(left, right);
        if (checkBooleanTest(false, sc.match(book5))){
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void leftOrRightConditionsMet() {
        String scenario = "Book match when any of left or right conditions is met = ";
        SearchCriteria left  = new TitleSearchCriteria("8888");
        SearchCriteria right = new YearOfIssueSearchCriteria("2012");
        SearchCriteria sc = new OrSearchCriteria(left, right);
        if (checkBooleanTest(true, sc.match(book7))){
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }

    void leftOrRightConditionsNotMet() {
        String scenario = "No book match when any of left or right conditions is not met = ";
        SearchCriteria left  = new AuthorSearchCriteria("4455");
        SearchCriteria right = new TitleSearchCriteria("2000");
        SearchCriteria sc = new OrSearchCriteria(left, right);
        if (checkBooleanTest(false, sc.match(book8))){
            System.out.println(scenario + "PASS");
        } else {
            System.out.println(scenario + "FAILED");
        }

    }


}
