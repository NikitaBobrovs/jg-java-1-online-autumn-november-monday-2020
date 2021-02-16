package students.jelena_kaverska.lesson_11.level_2_3.task_6_22;

class SearchCriteriaTests {
    private SearchCriteria searchCriteria;

    String printResults(boolean result) {
        return result ? "PASSED" : "FAILED";
    }

    void testSearchAuthor() {
        searchCriteria = new AuthorSearchCriteria("Turgenev");
        Book book = new Book("Turgenev", "Mumu");
        System.out.println("Test search by author: " + printResults(searchCriteria.match(book)));
    }

    void testSearchAuthor1() {
        searchCriteria = new AuthorSearchCriteria("Chekhov");
        Book book = new Book("Turgenev", "Mumu");
        System.out.println("Test search by non-existing author: " + printResults(!searchCriteria.match(book)));
    }

    void testSearchTitle() {
        searchCriteria = new TitleSearchCriteria("Atlas Shrugged");
        Book book = new Book("Ayn Rand", "Atlas Shrugged");
        System.out.println("Test search by title: " + printResults(searchCriteria.match(book)));
    }

    void testSearchTitle1() {
        searchCriteria = new TitleSearchCriteria("Mumu");
        Book book = new Book("Ayn Rand", "Atlas Shrugged");
        System.out.println("Test search by non-existing title: " + printResults(!searchCriteria.match(book)));
    }

    void testSearchYear() {
        searchCriteria = new YearOfIssueSearchCriteria("1957");
        Book book = new Book("Atlas Shrugged", "Ayn Rand", "1957");
        System.out.println("Test search by year: " + printResults(searchCriteria.match(book)));
    }

    void testSearchYear1() {
        searchCriteria = new YearOfIssueSearchCriteria("2000");
        Book book = new Book("Atlas Shrugged", "Ayn Rand", "1957");
        System.out.println("Test search by year 2: " + printResults(!searchCriteria.match(book)));
    }

    void testMultiple() {
        searchCriteria = new AndSearchCriteria(new AuthorSearchCriteria("Ayn Rand"),
                new YearOfIssueSearchCriteria("1957"));
        Book book = new Book("Atlas Shrugged", "Ayn Rand", "1957");
        System.out.println("Test multiple: " + printResults(searchCriteria.match(book)));
    }

    void testMultipleL() {
        searchCriteria = b -> b.getAuthor().equalsIgnoreCase("Ayn Rand") && b.getYearOfIssue().equals("1957");
        Book book = new Book("Atlas Shrugged", "Ayn Rand", "1957");
        System.out.println("Test multiple: " + printResults(searchCriteria.match(book)));
    }

    void testMultipleOr() {
        searchCriteria = new OrSearchCriteria(new TitleSearchCriteria("Mumu"),
                new YearOfIssueSearchCriteria("1854"));
        Book book = new Book("Mumu", "Turgenev", "1850");
        System.out.println("Test multiple or: " + printResults(searchCriteria.match(book)));
    }

    void testMultipleOrL() {
        searchCriteria = b -> b.getAuthor().equalsIgnoreCase("Ayn Rand") || b.getYearOfIssue().equals("1957");
        Book book = new Book("Atlas Shrugged", "Ayn Rand", "1957");
        System.out.println("Test multiple or: " + printResults(searchCriteria.match(book)));
    }

    void testMultipleMultiple() {
        searchCriteria = new OrSearchCriteria(new OrSearchCriteria(new TitleSearchCriteria("Mumu"),
                new YearOfIssueSearchCriteria("1854")), new AuthorSearchCriteria("Ayn Rand"));
        Book book = new Book("Atlas Shrugged", "Ayn Rand", "1957");
        System.out.println("Test multiple multiple: " + printResults(searchCriteria.match(book)));
    }

    void testMultipleMultiple2() {
        searchCriteria = new OrSearchCriteria(new OrSearchCriteria(new TitleSearchCriteria("Mumu"),
                new YearOfIssueSearchCriteria("1854")), new AuthorSearchCriteria("Ayn Rand"));
        Book book = new Book("Mumu", "Turgenev", "1850");
        System.out.println("Test multiple multiple 2: " + printResults(searchCriteria.match(book)));
    }


    public static void main(String[] args) {
        SearchCriteriaTests tests = new SearchCriteriaTests();
        tests.testSearchAuthor();
        tests.testSearchAuthor1();
        tests.testSearchTitle();
        tests.testSearchTitle1();
        tests.testSearchYear();
        tests.testSearchYear1();
        tests.testMultiple();
        tests.testMultipleL();
        tests.testMultipleOr();
        tests.testMultipleOrL();
        tests.testMultipleMultiple();
        tests.testMultipleMultiple2();
    }
}